package com.revature.ewsoop;

public class Truck extends Automobile  {
	
		private static String type = "Truck";
		public static int truck_population = 0 ;
		public Truck(String make, int year,String color, boolean running) {
			super(make,year,color,running);
			truck_population++;
		}

		//overloading our constructor for the Truck class
				// placing default values for method calls of differing parameters 
				public Truck(String make,int year , String color) {
					this(make,year,color,true);	
					truck_population++;
				}

				public Truck(String make,int year) {
					this(make,year,"blue");	
					truck_population++;
				}
				
				public Truck(String make) {
					this(make,0);	
					truck_population++;
				}
				
				public Truck() {
					this("Ford");
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
		//overloading
		public void fillGas(int cost) {
			System.out.println(type + " filling with gas");
			System.out.println("please pay:" + cost);
			
		}

		public void turnOnBlueTooth() {
			
		}

		@Override
		public void fillGas() {
			// TODO Auto-generated method stub
			
		}

}
