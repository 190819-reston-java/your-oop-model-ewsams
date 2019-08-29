package com.revature.ewsoop;

public class AutomobileDriver {

	public static void main(String[] args) throws Exception {
		SportsCar Mustang = new SportsCar("Ford", 2019, "red", true);
		Truck F150 = new Truck("Ford", 2019, "blue", true);
		System.out.println(Mustang);
		Mustang.startEngine(true);
		Mustang.revEngine();
		Mustang.setCruiseControl(75);
		F150.startEngine();
		F150.fillGas();
		Mustang.fillGas("gradeA");
		Mustang.turningOnHandFreeset();
		Mustang.makeCall("1234567892");
		MiniVan Sienna = new MiniVan("Ford", 2000, "green", false);
		Sienna.turningOnHandFreeset();
		Sienna.fillGas("gradeB");
		Mustang.autoDrive();
	}
}