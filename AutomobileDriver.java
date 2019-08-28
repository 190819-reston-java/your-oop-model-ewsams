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
		//using long data type requires L after the primitive
		//example : 928393849L
		Mustang.makeCall(79202);
		MiniVan Sienna = new MiniVan();
		Sienna.turningOnHandFreeset();
	}
}
