package garage;

import java.util.ArrayList;

public class garage {
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle vh) {
		vehicles.add(vh);
	}

	public void removeVehicle(Vehicle vh) {
		vehicles.remove(vh);
	}

	public void printVehicles() {
		if (vehicles.size() != 0) {
			for (Vehicle vh : vehicles) {
				System.out.println(vh);
			}
		} else {
			System.out.println("No vehicles in garage");
		}
	}
}
	




	
	//    so a method to print vehicles 
//if vehicles != 0
//	for loop and loops vehicles e : vehicles
//	        sout.e
//	else
//	     sout(no vehicles in garage)


