package com.revature.ewsoop;
/*
1. Come up with some domain model and implement it
2. Use at least one Abstract Class, at least one Interface, at least two concrete classes
3. Override at least one method
4. Overload at least one method
5. Use at least one static field and or method
 */
public abstract class Automobile implements IAutointerface {
	//private fields "variables"
		private String make;
		private int year;
		private String color;
		private boolean running;
		public static int Auto_population = 0 ;
		public int startEngine;
		public String revEngine;
		public int setCruiseControl;  
		public boolean engineOn = false;
		public boolean blueTooth = false;
		
		// constructor including all fields
		public Automobile(String make, int year,String color, boolean running) {
			this.setMake(make);
			this.setYear(year);
			this.setColor(color);
			this.setRunning(running);
			Auto_population++;
		}
		//overloading our constructor for the Automobile class
		// placing default values for method calls of differing parameters 
		public Automobile(String make,int year , String color) {
			this(make,year,color,true);	
		}

		public Automobile(String make,int year) {
			this(make,year,"blue");	
		}
		
		public Automobile(String make) {
			this(make,0);	
		}
		
		public Automobile() {
			this("Ford");	
		}
		//method overriding taking place
		
		@Override
		public String toString() {
			return "Automobile: make=" + make + ", year=" + year + ", color=" + color + ", running=" + running;
		}
		
		//overriding the toString() method
		
		public String getMake() {
			return make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isRunning() {
			return running;
		}
		public void setRunning(boolean running) {
			this.running = running;
		}
		public abstract void park();
		
		public abstract void fillGas();
		
		//staring the engine
		public void startEngine() {
			System.out.println(this.make +  " Engine is On");
			engineOn = true;
		}
		
		//turning on bluetooth
				public void turningOnHandFreeset() {
					System.out.println(this.make +  " Bluetooth is On");
					blueTooth = true;
				}
		
		public void revEngine() {
			if(engineOn==false ) {
				System.out.println("Turn the engine on ....");}
				else {System.out.println("engine sound: Vrooooom");
			}
		}
		
		public void makeCall(long number) {
			if(blueTooth) {
				System.out.println("While using bluetooth feel free to call: " +  number);
			} 
				else {
					System.out.println("Please turn bluetooth on before making calls and driving...");
				}
		}
		
		public void setCruiseControl(int speed) {
			if(engineOn) {
				System.out.println("What Speed would you like to set the car's cruise to?");
				System.out.println("Setting cruise to: " + speed + " mph");
				}
				else {System.out.println("The engine is currently off");}
				}
		 
		public void placeInReverse() {
			if(engineOn) {
				System.out.println("Come to a complete stop prior to changing gears");
			} else {
				System.out.println("engine is off");
			}
		}	
}

