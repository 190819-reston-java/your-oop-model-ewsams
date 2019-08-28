package com.revature.ewsoop;

public class SportsCar extends Automobile {
	
		private static String type = "Sports Car";	
		public static int SportsCar_population = 0 ;
		public boolean keyless = false;
		public SportsCar(String make, int year,String color, boolean running) {
			super(make,year,color,running);
			SportsCar_population++;
		}

		//overloading our constructor for the SportsCar class
				// placing default values for method calls of differing parameters 
				public SportsCar(String make,int year , String color) {
					this(make,year,color,true);	
					SportsCar_population++;
				}

				public SportsCar(String make,int year) {
					this(make,year,"blue");	
					SportsCar_population++;
				}
				
				public SportsCar(String make) {
					this(make,0);	
					SportsCar_population++;
				}
				
				public SportsCar() {
					this("Ford");
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

		public void fillGas(String gasGrade) {
			
			if(gasGrade=="gradeA") {
				System.out.println("This grade is valid. Thanks for  using gradeA");
				System.out.println(type + " filling up with gas");
			}
			else {
				System.out.println("Please only use gasGrade --> gradeA");
			}
		}

		public void turnOnBlueTooth() {
			
		}
		
		//overloading the method startEngine
		public void startEngine(boolean keyless) {
			if(keyless == true) {
				System.out.println(this.make +  " is keyless push to start engine");	
				engineOn = true;
			}
			else  {
				System.out.println(this.make +  " is not keyless insert key  to start engine");
				engineOn = true;
			}
			System.out.println("Vroooooom.......Vrooooooom........");
		}

		@Override
		public void fillGas() {
			// TODO Auto-generated method stub
			
		}
		
		//method overloading
		public void autoDrive() {
			if(type != "Sports Car" ) {
				System.out.println("This car does not have AutoDrive...");
			}
				else if(engineOn & type.equals("Sports Car")) {
					System.out.println("Placing the Automobile into AutoDrive....Please be alert while in AutoDrive");
				} autoPilot = true;
			}	
}
