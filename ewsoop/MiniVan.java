package com.revature.ewsoop;

public class MiniVan extends Automobile {
	
	private static String type = "MiniVan";

	public MiniVan(String make, int year, String color, boolean running) {
		super(make, year, color, running);
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
	public void park() {
		System.out.println("Please make sure there are no children nearby while parking....");
		if(blueTooth) {
			System.out.println("please get turn off the phone...");
		}

	}

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


	public void autoDrive() {
		System.out.println("Mini Vans do not offer autoDrive()....");
		
	}

	@Override
	public void fillGas() {
		System.out.println("Currently at a full Tank of Gas");
		
	}
}
