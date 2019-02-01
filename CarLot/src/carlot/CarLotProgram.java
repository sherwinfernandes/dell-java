package carlot;

public class CarLotProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarLot brazos= new CarLot("Brazos");
		CarLot manchaca= new CarLot("Manchaca");
		
		brazos.addVehicle(new Car("A1OHA","honda","civic", 18999.99, CarType.COUPE, 2));
		brazos.addVehicle(new Car("BXCD4","mazda","3", 17999.99, CarType.SEDAN, 4));
		brazos.addVehicle(new Car("JYTCV58","chrysler","lebaron", 18999.99, CarType.SEDAN, 4));
		brazos.addVehicle(new Car("67GFR","honda","accord", 21999.99, CarType.HATCHBACK, 5));
		brazos.addVehicle(new Truck("YTGJK43","honda","pilot", 28999.99, 5));
		brazos.addVehicle(new Truck("54335G","honda","odyssey", 18999.99, 6));
		
		manchaca.addVehicle(new Car("A1OHA","honda","civic", 18999.99, CarType.COUPE, 2));		
		manchaca.addVehicle(new Truck("LJLKL9","subaru","forester", 18999.99, 3));		
		manchaca.addVehicle(new Car("A1OHA","honda","civic", 18999.99, CarType.COUPE, 2));
		manchaca.addVehicle(new Car("BXCD4","mazda","3", 17999.99, CarType.SEDAN, 4));
		manchaca.addVehicle(new Truck("JYTCV58","chrysler","lebaron", 18999.99, 4));
		
		System.out.println(brazos);
		System.out.println(manchaca);
		
		
	}

}
