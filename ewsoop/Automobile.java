package com.revature.ewsoop;

public abstract class Automobile  implements IAutointerface, IBluetooth {
	// fields "variables"
		public String[] type = {"Sports Car","Truck"} ;
		protected String make;
		protected int year;
		protected String color;
		protected boolean running;
		public static int Auto_population = 0 ;
		public int startEngine;
		public String revEngine;
		public int setCruiseControl;  
		public boolean engineOn = false;
		public boolean blueTooth = false;
		public boolean autoPilot = false;
		
		// constructor including all fields
		public Automobile(String make, int year,String color, boolean running) {
			this.setMake(make);
			this.setYear(year);
			this.setColor(color);
			this.setRunning(running);
			Auto_population++;
		}
		
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
		
		public void makeCall(String number) {
			try {
			if(blueTooth & number.length()==10) {
				System.out.println("While using bluetooth feel free to call: " +  Long.parseLong(number));
			} 
			
			else if(number.length()>10 & blueTooth==true) {
				System.out.println("Sorry that number is not valid...");
			}
				else {
					System.out.println("Please turn bluetooth on before making calls and driving...");
				}
			}catch(Exception e) {
				System.out.println(e + "Please use a valid number");
			}
		}
		
		public void listenToMusic(int volume) {
			if(blueTooth & engineOn) {
				System.out.println("While using bluetooth feel free to listen to your playlist at your volume: " +  volume);
			} 
			
			else if(engineOn==false & blueTooth==true) {
				System.out.println("Listening to music in the car but not on the road...");
			}
				else if(engineOn==false & blueTooth==false){
					System.out.println("Please start the engine ...");
				}
		}
		
		public void setCruiseControl(int speed) {
			try {
			if(engineOn) {
				System.out.println("What Speed would you like to set the car's cruise to?");
				System.out.println("Setting cruise to: " + speed + " mph");
				}
				else {System.out.println("The engine is currently off");
				}
			} catch(Exception e) {
					System.out.println("Please insert a valid speed....");
			}
		}
		
		public void placeInReverse() {
			if(engineOn) {
				System.out.println("Come to a complete stop prior to changing gears");
			} 
			else {
				System.out.println("engine is off");
			}
		}
		
		public void autoDrive() throws Exception {
				if(engineOn & type.equals(type) & this.year > 2017) {
					System.out.println("This car feutures AutoDrive...");
					autoPilot = true;
				}
				else {
					throw new Exception("This Automobile does not feuture autoDrive()...");
				}
			}	
		}


