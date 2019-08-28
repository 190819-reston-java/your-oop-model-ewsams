package com.revature.ewsoop;

public class AutomobileDriver {

	public static void main(String[] args) {
		SportsCar Mustang = new SportsCar();
		Truck F150 = new Truck();
		System.out.println(Mustang);
		Mustang.startEngine();
		Mustang.revEngine();
		Mustang.setCruiseControl(75);
		F150.startEngine();
		F150.fillGas();
		Mustang.fillGas();
		Mustang.turningOnHandFreeset();
		Mustang.makeCall(999892);
		MiniVan Sienna = new MiniVan();
		Sienna.turningOnHandFreeset();
		F150.turningOnHandFreeset();
	}
}
