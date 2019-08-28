package com.revature.ewsoop;

public class MiniVan extends Automobile implements IAutointerface {
	
	private static String type = "MiniVan";

	public MiniVan(String make, int year, String color, boolean running) {
		super(make, year, color, running);
	}

	public MiniVan(String make, int year, String color) {
		super(make, year, color);
	}

	public MiniVan(String make, int year) {
		super(make, year);
	}

	public MiniVan(String make) {
		super(make);
	}

	public MiniVan() {
	}

	public void turnOnBlueTooth() {
		if(blueTooth) {
			System.out.println("Google Voice is avaialable....");
		}else {
			System.out.println("Please turn on Blue Tooth While Driving...");
		}

	}

	@Override
	public void park() {
		System.out.println("Please make sure there are no children nearby while parking....");
		if(blueTooth) {
			System.out.println("please get off the phone...");
		}

	}

	public void fillGas(String args) {
		if(args=="gradeB") {
			System.out.println("This grade is valid. Thanks for  using gradeB");
			System.out.println(type + " filling up with gas");
		}
		else {
			System.out.println("Please only use gasGrade --> gradeB");
		}
		

	}

	@Override
	public void fillGas() {
		// TODO Auto-generated method stub
		
	}

	public void autoDrive() {
		// TODO Auto-generated method stub
		
	}

}
