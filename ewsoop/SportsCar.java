package com.revature.ewsoop;

public class SportsCar extends Automobile {
	
		private static String type = "Sports Car";	
		public static int SportsCar_population = 0 ;
		public boolean keyless = false;
		
		public SportsCar(String make, int year,String color, boolean running) {
			super(make,year,color,running);
			SportsCar_population++;
		}

		public static void printPopulation() {
			if(SportsCar_population == 0) {
				System.out.println("There is no population ");
			}
			
			else {System.out.println("There are: " + SportsCar_population + " SportsCars");
			}
		}
			
		@Override
		public void park() {
			System.out.println(this.getMake() + "placed in park mode");

		}
		
		// method overloading
		public void fillGas(String gas) {
			if(gas=="gradeA") {
				System.out.println("This grade is valid. Thanks for  using gradeA");
				System.out.println(type + " filling up with gas");
			}
			else {
				System.out.println("Please only use gasGrade --> gradeA");
			}
		}

		public void turnOnBlueTooth() throws Exception {
			if(blueTooth) {
				System.out.println("Google Voice is avaialable....");
			}
			
			else if(blueTooth & engineOn) {
				System.out.println("Google Voice is avaialable....");
			}
			
			else {
				throw new Exception("Please turn on Blue Tooth While Driving...");
			}

		}
		
		//overloading the method startEngine
		public void startEngine(boolean keyless) {
			try {
			if(keyless == true) {
				System.out.println(this.make +  " is keyless push to start engine");	
				engineOn = true;
				System.out.println("Vroooooom.......Vrooooooom........");
			}
			
			else  {
				System.out.println(this.make +  " is not keyless insert key  to start engine");
				engineOn = true;
			}
			System.out.println("Vroooooom.......Vrooooooom........");	
		}
			catch(Exception e) {
				System.out.println(e + "Please indicate with true or false that the Automobile features a keyless start...");
			}	
		}

		@Override
		public void fillGas() {
			System.out.println("Currently at a full Tank of Gas");
		}
		
		//method overloading
		public void autoDrive() throws Exception {
			if(type != "Sports Car" || this.running == false || this.year < 2017) {
				System.out.println("This Automobile is not running or does not have AutoDrive...");
			}
			else if(engineOn & type.equals("Sports Car") & this.year > 2017) {
					System.out.println("Placing the Automobile into AutoDrive....Please be alert while in AutoDrive");
				 	autoPilot = true;}
			else { throw new Exception("This Automobile does not feuture autoDrive.....");
			}
	}	
}
