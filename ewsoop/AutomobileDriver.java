package com.revature.ewsoop;

public class AutomobileDriver  {

	public static void main(String[] args) throws Exception {
		SportsCar Mustang = new SportsCar("Ford", 2019, "red", true);
		Truck F150 = new Truck("Ford", 2016, "blue", true);
		System.out.println(Mustang);
		Mustang.startEngine(true);
		Mustang.revEngine();
		Mustang.setCruiseControl(75);
		F150.startEngine();
		F150.fillGas();
		Mustang.fillGas("gradeA");
		Mustang.turningOnHandFreeset();
		Mustang.makeCall("1234567892");
		MiniVan Sienna = new MiniVan("Ford", 2006, "green", false);
		Sienna.turningOnHandFreeset();
		Sienna.fillGas("gradeB");
		Mustang.autoDrive();
		Truck F350 = new Truck("Ford",2019,"black",true);
		F350.startEngine();
		System.out.println("-----------Now Lets take a look at our unsorted Array List---------");
		for(Automobile objectinAutomobileList: Automobile.autoList) {
			System.out.println(objectinAutomobileList);
		}
		System.out.println("------------------Now are Sorted ArrayList-----------------------");
	}
}