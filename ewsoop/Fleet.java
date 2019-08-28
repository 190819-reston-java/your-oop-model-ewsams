package com.revature.ewsoop;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Fleet extends ArrayList<Automobile> {
	final int listLength =10;
	
	public static void setTruckFleet() {
		ArrayList<String>Fleet = new ArrayList<String>(Truck.truck_population);
		for(String value : Fleet) {
			System.out.println("number of Trucks equals" + Truck.truck_population + value);
		}
		
	}
	public static void getFleet() {
		
	}


}
