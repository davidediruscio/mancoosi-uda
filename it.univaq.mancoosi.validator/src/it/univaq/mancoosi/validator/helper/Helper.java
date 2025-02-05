package it.univaq.mancoosi.validator.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import it.univaq.mancoosi.validator.exceptions.ValidatorException;
import it.univaq.mancoosi.validator.util.XMLFileWriter;

public class Helper {

	public static void main(String[] args) {
		try {
			if (!System.getProperty("user.name").equals("root")) {
				System.out.println("Permission denied. You must have root privileges.");
				System.exit(1);
			}

			if (args.length > 0 && args[0].equals("all")) {

				createRemovePlans();
				System.out.println("\n###############################\n");
				createInstallPlans();
			} else if (args.length > 0 && args[0].equals("install")) {
				createInstallPlans();
			} else if (args.length > 0 && args[0].equals("remove")) {
				createRemovePlans();
			} else {
				System.out.println("\nOptions:");
				System.out.println("install --> generate install/upgrade plans");
				System.out.println("remove --> generate remove plans");
				System.out.println("all --> generate install/upgrade/remove plans");
			}
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
	
	private static void createInstallPlans() throws ValidatorException, IOException {

		ArrayList<UpgradePlan> upgradePlans = new ArrayList<UpgradePlan>();
		ArrayList<String> packages = new ArrayList<String>();
		UpgradePlan ap;
		
		String line;
		String[] cmd = {"/bin/sh","-c"," aptitude -q --disable-columns -F %p search '!~i!~v'"};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));

		while ((line = input.readLine()) != null) {
			packages.add(line);
		}
		try {
			p.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("Error aptitude command", e);
		}
		
		if (p.exitValue()!=0) {
			throw new ValidatorException("Error aptitude command");
		}

		p.destroy();
		


		
		for (String pkg : packages) {
			System.out.println("\nCalculating the upgrade plan for installing " + pkg);

			try {
				ap = new UpgradePlan("install " + pkg);
				if (ap.getSequence().size() > 0 && ap.isCompletelyCovered()) {
					upgradePlans.add(ap);
					writeXML(ap, ap.getScriptsNum(), "plans");
				} else {
					System.out.println("Upgrade plan for " + pkg + " discarded since not completely covered");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Upgrade plan for " + pkg + " discarded.");
			}
		}
		
		System.out.println("Install plans calculated. They are " + upgradePlans.size() + " in total.");		
		
		
	}

	private static void createRemovePlans() throws IOException, ValidatorException {
		
		ArrayList<UpgradePlan> upgradePlans = new ArrayList<UpgradePlan>();
		ArrayList<String> packages = new ArrayList<String>();
		
		UpgradePlan ap;

		String line;
		String[] cmd = {"/bin/sh","-c"," dpkg -l | awk '/ii/' | awk '{print $2}'"};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));

		while ((line = input.readLine()) != null) {
			packages.add(line);
		}
		try {
			p.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("Error 'dpkg -l' command", e);
		}

		if (p.exitValue()!=0) {
			throw new ValidatorException("Error 'dpkg -l' command");
		}
		
		p.destroy();
		
		
		for (String pkg : packages) {
			System.out.println("\nCalculating the upgrade plan for removing " + pkg);
			try {
				ap = new UpgradePlan("remove " + pkg);
				if (ap.getSequence().size() > 0 && ap.isCompletelyCovered()) {
					upgradePlans.add(ap);
					writeXML(ap, ap.getScriptsNum(), "plans");
				} else {
					System.out.println("Upgrade plan for " + pkg + " discarded since not completely covered");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Upgrade plan for " + pkg + " discarded.");
			}
		}
		
		System.out.println("Remove plans calculated. They are " + upgradePlans.size() + " in total.");		
		
	}

	public  static void writeXML(UpgradePlan up, Integer numScript, String filePath) throws Exception {

		XMLFileWriter xml;		
	
		File upgradePlanFile = new File(filePath + File.separator + "upgradePlan_numScript-"+numScript+"_" + up.getOperation() + "_" + up.getPackageName() + ".xml");
		xml = new XMLFileWriter(upgradePlanFile.getPath());

		ArrayList<Operation> sequence = up.getSequence();
		Iterator<Operation> sequenceIterator = sequence.iterator();
		
		while (sequenceIterator.hasNext()){
	
			Operation op = sequenceIterator.next();
			if (op.getType().equals("install")) {
				xml.createInstallSelection(op.getName(), op.getVersion(), op.getArchitecture());
			}

			if (op.getType().equals("purge")) {
				xml.createPurgeSelection(op.getName(), op.getVersion(), op.getArchitecture());
			}

			if (op.getType().equals("remove")) {
				xml.createRemoveSelection(op.getName(), op.getVersion(), op.getArchitecture());
			}
		}
		xml.closeFile();		
	}
	
	public  static void writeXML(ArrayList<UpgradePlan> upgradePlans, String filePath) throws Exception {

		XMLFileWriter xml;
		
		Iterator<UpgradePlan> upgradePlansIterator = upgradePlans.iterator();
		while (upgradePlansIterator.hasNext()) {
			
			UpgradePlan  up = upgradePlansIterator.next();		
			File upgradePlanFile = new File(filePath + File.separator + "upgradePlan_" + up.getOperation() + "_" + up.getPackageName() + ".xml");
			xml = new XMLFileWriter(upgradePlanFile.getPath());

			ArrayList<Operation> sequence = up.getSequence();
			Iterator<Operation> sequenceIterator = sequence.iterator();
			
			while (sequenceIterator.hasNext()){
		
				Operation op = sequenceIterator.next();
				System.out.println(op.getName());
				System.out.println(op.getType());				
				if (op.getType().equals("install")) {
					xml.createInstallSelection(op.getName(), op.getVersion(), op.getArchitecture());
				}
	
				if (op.getType().equals("purge")) {
					xml.createPurgeSelection(op.getName(), op.getVersion(), op.getArchitecture());
				}
	
				if (op.getType().equals("remove")) {
					xml.createRemoveSelection(op.getName(), op.getVersion(), op.getArchitecture());
				}
			}
			xml.closeFile();	
		}		
	}

}
