package domainmodelproject;

import java.security.PublicKey;

public class Automobile {
	//private fields "variables"
	protected String make;
	private String year;
	final int maxspeed = 200;

	public Automobile(String make, String year, boolean running) {
	this.make = make;
	this.year = year;
	this.running = running;
}
	public Automobile(String make, String year) {
		this(make,year,true);	
	}

	public Automobile(String make) {
		this(make,"red");
	}
	
	public Automobile() {
		this("Fusion");
	}
	
	@Override
	public String toString() {
		return "Automobile [make=" + make + ", year=" + year + ", running=" + running + "]";
	}
	public String getMake() {
		return make;
	}
	public void setmake(String make) {
		this.make = make;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public boolean isrunning() {
		return running;
	}
	public void setrunning(boolean running) {
		this.running = running;
	}

	private boolean running;
	
	public void drive() {
		System.out.println(this.make + "is driving");
	}
	
	public void revengine() {
		System.out.println(this.make + "engine is running");
	}
	
	public void park() {
		
	}
	
	public void getGas() {
		
	}
	}
	// we want an interface
	//we will have one abstract class
	//two concrete classes with one that inherits the interface.