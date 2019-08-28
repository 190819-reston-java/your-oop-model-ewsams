package com.revature.ewsoop;

public class AutomobileDriver {

	public static void main(String[] args) {
		SportsCar Mustang = new SportsCar();
		Truck F150 = new Truck();
		System.out.println(Mustang);
		Mustang.startEngine();
		Mustang.revEngine();
		Mustang.setCruiseControl(50);
		F150.startEngine();
		Truck.printPopulation();
	}
}
