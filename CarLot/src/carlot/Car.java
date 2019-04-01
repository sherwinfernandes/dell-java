package carlot;

enum CarType {COUPE, HATCHBACK, SEDAN;} 	

public class Car extends Vehicle {
	
	private CarType type; //  (coupe, hatchback, or sedan)
	private int doors; 	//	number of doors

	public Car(String license, String make, String model, double price, CarType type, int doors) {
		super(license, make, model, price);
		this.type = type;
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", doors=" + doors + " "+ super.toString()+"]";
	}
	
	
}
