package parkinggarage;

import java.lang.*;

public class ParkingGarage {
	private Car[] _slots;
	
	public ParkingGarage(int capacity) {//constructor
		_slots= new Car[capacity];
	}
	
	public void park(Car car, int spot){// method, that will add the car to a parking spot.
	
	//If the user attempts to add the car to a spot that doesn't exist (outside the array), catch the exception and notify the user.
		if (spot <0 || spot > _slots.length)
			throw new ArrayIndexOutOfBoundsException("spot is out of bounds");
	//If there's already a car parked in the spot, notify the user that the car cannot be parked in that spot.
		if (_slots[spot] != null)
			throw new IllegalArgumentException("spot is in use");
		_slots[spot]= car;
	}
	
	public void vacate(int spot)// method, that will remove the car from the specified spot.
	{
		//	If the user attempts to remove a car from an empty spot, notify the user that no car is present in that spot.
		if (_slots[spot]== null)
			throw new IllegalArgumentException("spot is in empty");
		_slots[spot]= null;
	}
	
	public void printInventory()// method, that prints out to the console the the listing of all the cars with a brief description. 
	{
		for (int i=0;i<_slots.length; i++) {
			//For each car, please include:
			//The spot number (array index) of the car in the parking garage
			//The car's color, license #, make, and model
			System.out.print("Slot "+ i+" ");
			if (_slots[i]!=null) {
				System.out.print(_slots[i].print());
			}
			System.out.println();
		}

	}
}
