package Fabrica;

public class FabricaDeCarro {

	 private static FabricaDeCarro uniqueInstance; 
	 private FabricaDeCarro() { 
		 
	 } public static synchronized FabricaDeCarro getInstance() { 
		 if (uniqueInstance == null) 
			 uniqueInstance = new FabricaDeCarro(); 
		 return uniqueInstance; 
		 } 
	 
	 }

	

