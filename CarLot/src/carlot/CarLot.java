package carlot;

import java.util.ArrayList;
import java.util.List;

public class CarLot {
	private String name;
	private List<Vehicle> vehicles;
	
	public void addVehicle(Vehicle veh) { //add a vehicle to the lot
		vehicles.add(veh);
	}
	
	public String toString() { //print the inventory of the car lot, including number of vehicles and details about each vehicle
		String ret= name + " has "+String.valueOf(vehicles.size()) +" Vehicles\n";
		for (Vehicle veh: vehicles) {
			ret += veh.toString() +"\n";
		}
		return ret;
	}
	
	public CarLot(String name) { //constructor
		this.name=name;
		vehicles= new ArrayList <Vehicle>();
	}
}
