package domainmodelproject;
import java.io.Serializable;

public class FordTruck extends Automobile implements Serializable {
	
	public static int population = 0;

	public FordTruck(String make, String color, boolean running) {
		super(make, color, running);
		population++;
	}

	public FordTruck(String make, String color) {
		this(make, color, true);
	}

	public FordTruck(String color) {
		this(color, "blue");
	}

	public FordTruck() {
		this("F150");
	}

	public static void printPopulation() {
		if (population == 0) {
			System.out.println("There's nobody here");
		} else {
			System.out.println("There are: " + population + " FordTrucks");
		}
	}

	@Override
	public void park() {
		System.out.println(this.getMake() + " is sitting still (not parked)");
	}

	public String getMake() {
		return this.make;
	}

	@Override
	public void getGas() {
		// this violates our 'write once and only once' rule:
		System.out.println("Cannot get gas :(");
	}
}