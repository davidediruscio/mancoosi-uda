package it.univaq.mancoosi.injectors.systemconfiguration.managers;



import it.univaq.mancoosi.mancoosimm.Alternative;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;

public abstract class AlternativesManager {
	 protected static AlternativesManager INSTANCE ;
	 protected MancoosiFactory factory;
	   
	   // Private constructor prevents instantiation from other classes
	   protected  AlternativesManager() {
		    factory = MancoosiFactory.eINSTANCE; 
		    INSTANCE = this;
	   }
	 
	   public static AlternativesManager getInstance() {
	      return INSTANCE;
	   }
	   
	   public abstract Alternative getAlternative(String alternativeName);
	   
	   public abstract Boolean exists(String alternativeName);
	   
	   public abstract void createAlternativesFromSystem();
	   
	   public abstract void sychronize();

}
