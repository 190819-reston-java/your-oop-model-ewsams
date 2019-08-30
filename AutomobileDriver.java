package com.revature.ewsoop;
import java.util.Collections;

public class AutomobileDriver  {

	public static void main(String[] args) throws Exception {
		//Instantiatin our Automobile Objects
		Truck F150 = new Truck("Ford", 2007, "blue", true);
		SportsCar Mustang = new SportsCar("Ford", 2019, "red/black", true);
		SportsCar BMW3 = new SportsCar("BMW", 2017, "White", true);
		SportsCar BMW5 = new SportsCar("BMW", 1999, "Grey", true);
		SportsCar GT = new SportsCar("Ford", 2001, "blue/white", true);
		Truck Tundra = new Truck("Toyota", 1993, "blue", false);
		MiniVan Sienna = new MiniVan("Ford", 2002, "green", false);
		Truck F350 = new Truck("Ford",2018,"black",true);
		//methods used:
		Mustang.startEngine(true);
		Mustang.revEngine();
		Mustang.setCruiseControl(75);
		Mustang.fillGas("gradeA");
		Mustang.turningOnHandFreeset();
		Mustang.makeCall("1234567892");
		F150.startEngine();
		F150.fillGas();
		Sienna.turningOnHandFreeset();
		Sienna.fillGas("gradeB");
		Mustang.autoDrive();
		F350.startEngine();
		System.out.println("************************************************************************************");
		System.out.println("-----------------Now Lets take a look at our unsorted Array List------------------");
		for(Automobile objectInAutomobileList: Automobile.autoList) {
			System.out.println(objectInAutomobileList);
		}
		System.out.println("************************************************************************************");
		System.out.println("---------------------Now are Sorted ArrayList by Year in descending order---------");
		Collections.sort(Automobile.autoList, Automobile.yearComparator);
		for(Automobile objectInAutomobileList: Automobile.autoList) {
			System.out.println(objectInAutomobileList);
		}
		
	}
}