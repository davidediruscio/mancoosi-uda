package it.univaq.mancoosi.validator;

import it.univaq.mancoosi.validator.debian.DebianValidator;
import it.univaq.mancoosi.validator.exceptions.ValidatorException;
import it.univaq.mancoosi.validator.util.EmfCompareLaunch;
import it.univaq.mancoosi.validator.util.FileManagement;
import it.univaq.mancoosi.validator.util.ValidatorConfig;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public abstract class Validator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<String, Integer> options = new HashMap<String, Integer>();
		options.put("install", 1);
		options.put("remove", 2);
		options.put("purge", 3);

		if (!System.getProperty("user.name").equals("root")) {
			System.out.println("Permission denied. You must have root privileges.");
			System.exit(1);
		}

		if (args == null || args.length < 2 || !options.containsKey(args[0])) {
			printHelpCommand();
			System.exit(1);
		}

		if (args[1] != null && !options.containsKey(args[1])) {
			String listparam = args[0];
			for (int i = 1; i < args.length; i++) {
				if (options.containsKey(args[i])) {
					printHelpCommand();
					System.exit(1);
				}
				listparam = listparam + " " + args[i];
			}
			try {

				Validator v = null;

				if ((new File("/etc/debian_version")).exists()
						|| (new File("/etc/ubuntu_version")).exists()) {

					v = new DebianValidator();
					v.realtime(listparam);

				} else {
					// TODO
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} else {
			printHelpCommand();
			System.exit(1);
		}
	}

	/**
	 * 
	 */
	public static void printHelpCommand() {
		System.out.println("Options:");
		System.out.println(" install pkg1 [pkg2 ...]");
		System.out.println(" remove  pkg1 [pkg2 ...]");
		System.out.println(" purge   pkg1 [pkg2 ...]\n");
	}

	/**
	 * 
	 * @param config
	 * @param pathDir
	 * @throws Exception
	 */
	protected void realtime(String params) throws Exception {

		File dir = FileManagement.createTempDirectory();
		ValidatorConfig config = ValidatorConfig.getInstance();

		if (!dir.isDirectory()) {
			throw new ValidatorException(dir.getPath() + " is not a directory.");
		}

		// Create xml file
		System.out.println("\nCreating the upgrade plan...");
		File upgradePlanFile = new File(dir.getPath() + File.separator + "upgradePlan.xml");
		createXML(params, upgradePlanFile.getPath());

		System.out.println("                                                       done.");

		String str = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		System.out.println("Proceed ? yes/[no] ");
		str = in.readLine();
		while ( str != null ) {
		  if (!str.equals("yes")) {
			FileManagement.deleteDir(dir);
		    System.out.println("Program terminated.");
		    System.exit(0);
		  } else {
			  break;
		  }
		  str = in.readLine();
		}
		in.close();
		
		// Injector system - pre-upgrade
		System.out.println("\nInjecting the system...");
		
		String workingDir = new File(config.getSysinjJarPath()).getParent();
		
		// Delete old configuration model
		File systemModelOldOld = new File(workingDir + File.separator + "model" + File.separator + "systemModel.mancoosimm");
		System.gc();
		systemModelOldOld.delete();
		
		launchInjector(config.getSysinjJarPath());

		File systemModel = new File(workingDir + File.separator + "model" + File.separator + "systemModel.mancoosimm");
		if (!systemModel.exists()) {
			throw new ValidatorException("File " + systemModel.getPath()
					+ " not found.");
		}
		File preUpgradeModel = new File(dir.getPath() + File.separator
				+ "preUpgrade_" + systemModel.getName());
		FileManagement.copyFile(systemModel, preUpgradeModel);
		if (!preUpgradeModel.exists()) {
			throw new ValidatorException("File " + preUpgradeModel.getPath()
					+ " not found.");
		}
		
		System.out.println("                                                       done.");
		// Real Upgrade
		System.out.println("Retrieving packages...");
		downloadingPackages(params);
		
		System.out.println("                                                       done.");
		// Simulator
		System.out.println("Simulating the upgrade...");
		File postSimulUpgrade = new File(dir.getPath() + File.separator
				+ "postSimulUpgrade_" + systemModel.getName());
		launchSimulator(config.getSimulatorJarPath(),
				preUpgradeModel.getAbsolutePath(), 
				upgradePlanFile.getAbsolutePath(), 
				postSimulUpgrade.getAbsolutePath(), 
				dir.getAbsolutePath()+File.separator+"errorModel.errormm");
		
		System.out.println("                                                       done.");
		// Real Upgrade
		System.out.println("Upgrading...");
		long start = System.currentTimeMillis();
		realUpgrade(params);
		long end = System.currentTimeMillis();
		double tot = (end-start)/1000.0;
		System.out.println("Time: "+tot+" seconds.");
		System.out.println("                                                       done.");
		
		// Injector system - post-upgrade
		System.out.println("Injecting the system...");
		
		// Delete old configuration model
		File systemModelOld = new File(workingDir + File.separator + "model" + File.separator + "systemModel.mancoosimm");
		System.gc();
		systemModelOld.delete();
		
		launchInjector(config.getSysinjJarPath());
		File systemModelPost = new File(workingDir + File.separator + "model"
				+ File.separator + "systemModel.mancoosimm");
		if (!systemModelPost.exists()) {
			throw new ValidatorException("File " + systemModelPost.getPath()
					+ " not found.");
		}
		File postRealUpgrade = new File(dir.getPath() + File.separator
				+ "postRealUpgrade_" + systemModel.getName());
		FileManagement.copyFile(systemModelPost, postRealUpgrade);
		
		System.out.println("                                                       done.");
		// Compare
		System.out.println("Differencing models...");
		String outputDiff = dir.getPath() + File.separator + "resultdiff.emf";
		EmfCompareLaunch.compare(postRealUpgrade, postSimulUpgrade, outputDiff);
		if (!(new File(outputDiff).exists())) {
			throw new ValidatorException("File "+outputDiff+" is not created correctly.");
		}
		System.out.println("Done.");
		System.exit(0);
	}

	
	private void launchSimulator(String pathJarFile, String arg1,
			String arg2, String arg3, String arg4) throws ValidatorException, IOException {

		File jarFile = new File(pathJarFile);
		if (!jarFile.exists()) {
			throw new ValidatorException("File " + pathJarFile + " not found");
		}

		String nameComponent = jarFile.getName();
		String pathWorkDir = jarFile.getParent();

		ProcessBuilder pb = new ProcessBuilder("java", "-jar", nameComponent, arg1, arg2, arg3, arg4);
		pb.directory(new File(pathWorkDir));
		Process proc = pb.start();
		BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		String resultLine = in.readLine();

		while (resultLine != null) {
		  System.out.println(" --> "+resultLine);
		  resultLine = in.readLine();
		}
		try {
			proc.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("An error occurred during the simulation.", e);
		}
		
		proc.destroy();

	}



	private static void launchInjector(String pathJarFile) throws ValidatorException, IOException {

		File jarFile = new File(pathJarFile);
		if (!jarFile.exists()) {
			throw new ValidatorException("File " + pathJarFile + " not found");
		}

		String nameComponent = jarFile.getName();
		String pathWorkDir = jarFile.getParent();

		ProcessBuilder pb = new ProcessBuilder("java", "-jar", nameComponent);
		pb.directory(new File(pathWorkDir));
		Process proc = pb.start();
		BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		String resultLine = in.readLine();

		while (resultLine != null) {
		  System.out.println(" --> "+resultLine);
		  resultLine = in.readLine();
		}

		try {
			proc.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("An error occurred during the injection.", e);
		}

		proc.destroy();	
	 }
	
	protected abstract void createXML(String params, String filePath) throws Exception;

	protected abstract void realUpgrade(String params) throws Exception;
	
	protected abstract void downloadingPackages(String params) throws Exception;
}
