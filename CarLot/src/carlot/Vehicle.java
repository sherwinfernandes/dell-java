package carlot;

public abstract class Vehicle {
	String license;//license number
	String make;//make
	String model;//model
	double price;//price
	

	//constructor
	public Vehicle(String license, String make, String model, double price) {
		super();
		this.license = license;
		this.make = make;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {		//print a description of the vehicle, including license number, make, model, and price
		return "Vehicle [license=" + license + ", make=" + make + ", model=" + model + ", price=" + price + "]";
	}
	

}
