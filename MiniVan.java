package com.revature.ewsoop;

public class MiniVan extends Automobile implements IAutointerface {

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

	}

	@Override
	public void fillGas() {

	}

}
