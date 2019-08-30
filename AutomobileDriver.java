package com.revature.ewsoop;
import java.util.Collections;

public class AutomobileDriver  {

	public static void main(String[] args) throws Exception {
		SportsCar Mustang = new SportsCar("Ford", 2019, "red/black", true);
		Truck F150 = new Truck("Ford", 2016, "blue", true);
		System.out.println(Mustang);
		SportsCar BMW3 = new SportsCar("BMW", 2007, "White", true);
		Mustang.startEngine(true);
		Mustang.revEngine();
		Mustang.setCruiseControl(75);
		SportsCar GT = new SportsCar("Ford", 2006, "blue/white", true);
		F150.startEngine();
		F150.fillGas();
		Mustang.fillGas("gradeA");
		Mustang.turningOnHandFreeset();
		Mustang.makeCall("1234567892");
		Truck Tundra = new Truck("Toyota", 1993, "blue", false);
		MiniVan Sienna = new MiniVan("Ford", 2002, "green", false);
		Sienna.turningOnHandFreeset();
		Sienna.fillGas("gradeB");
		Mustang.autoDrive();
		Truck F350 = new Truck("Ford",2018,"black",true);
		F350.startEngine();
		System.out.println("-----------------Now Lets take a look at our unsorted Array List------------------");
		for(Automobile objectinAutomobileList: Automobile.autoList) {
			System.out.println(objectinAutomobileList);
		}
		System.out.println("---------------------Now are Sorted ArrayList by Year in descending order---------");
		Collections.sort(Automobile.autoList, Automobile.yearComparator);
		for(Automobile objectinAutomobileList: Automobile.autoList) {
			System.out.println(objectinAutomobileList);
		}
		
	}
}