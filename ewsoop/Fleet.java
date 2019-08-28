package com.revature.ewsoop;
import java.util.ArrayList;

@SuppressWarnings("serial")
public abstract class Fleet extends ArrayList<Automobile> {
	final int listLength =10;
	
	public static void setFleet() {
		ArrayList<String>Fleet = new ArrayList<String>(Truck.truck_population);
		for(String value : Fleet) {
			System.out.println("number of Trucks" + value);
		}
		
	}
	public static void getFleet() {
		
	}


}
