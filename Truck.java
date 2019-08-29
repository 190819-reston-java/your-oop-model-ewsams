package com.revature.ewsoop;

public class Truck extends Automobile  {
	
		private static String type = "Truck";
		public static int truck_population = 0 ;
		
		public Truck(String make, int year,String color, boolean running) {
			super(make,year,color,running);
			truck_population++;
		}

		public static void printPopulation() {
			if(truck_population == 0) {
				System.out.println("There are no trucks available ");
			}
			
			else {System.out.println("There are: " + truck_population + " Trucks");
			}
		}
			
		@Override
		public void park() {
			System.out.println(this.getMake() + "placed in park mode");

		}
		
		//method overloading
		public void fillGas(String gas) {
			try {
			if(gas=="gradeB") {
				System.out.println("This grade is valid. Thanks for using gradeB");
				System.out.println(type + " filling up with gas");
			}
			else {
				System.out.println("Please only use gasGrade --> gradeB");
			}
		} catch(Exception e) {
			System.out.println(e + "please include --> classB gasoline only");
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

		@Override
		public void fillGas() {
			System.out.println("Currently at a full Tank of Gas");
		}			
}

