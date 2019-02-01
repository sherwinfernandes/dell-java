package carlot;

public class Truck extends Vehicle {
	
	double bedsize; //bedsize

	//constructor
	public Truck(String license, String make, String model, double price, double bedsize) {
		super(license, make, model, price);
		this.bedsize = bedsize;
	}

	@Override
	public String toString() {
		return "Truck [bedsize=" + bedsize + " "+ super.toString()+"]";
	}
	
	

}
