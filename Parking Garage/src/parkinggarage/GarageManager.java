package parkinggarage;

public class GarageManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParkingGarage pk1= new ParkingGarage(8);
		
		try{pk1.park(new Car("blue","A1OHA","honda","civic"), 0);}
		catch (Exception e) {System.out.println(e);}
		try{pk1.park(new Car("red","BXCD4","mazda","3"), 3);}
		catch (Exception e) {System.out.println(e);}
		try{pk1.park(new Car("white","JYTCV58","chrysler","lebaron"), 9);}
		catch (Exception e) {System.out.println(e);}
		try{pk1.park(new Car("orange","67GFR","honda","accord"), 4);}
		catch (Exception e) {System.out.println(e);}
		try{pk1.park(new Car("green","YTGJK43","honda","pilot"), 3);}
		catch (Exception e) {System.out.println(e);}
		try{pk1.park(new Car("purple","54335G","honda","odyssey"), 2);}
		catch (Exception e) {System.out.println(e);}
		try{pk1.park(new Car("silver","FGGF6","mitsubishi","lancer"), 7);}
		catch (Exception e) {System.out.println(e);}
		try{pk1.park(new Car("maroon","LJLKL9","subaru","forester"), 5);}
		catch (Exception e) {System.out.println(e);}
		try {pk1.vacate(0);}
		catch (Exception e){System.out.println(e);}
		
		pk1.printInventory();
				

		ParkingGarage pk2= new ParkingGarage(0);
		
		try{pk2.park(new Car("blue","A1OHA","honda","civic"), 0);}
		catch (Exception e) {System.out.println(e);}
		try{pk2.park(new Car("red","BXCD4","mazda","3"), -5);}
		catch (Exception e) {System.out.println(e);}

		pk2.printInventory();	
		
		ParkingGarage pk3= new ParkingGarage(10);


		
		try{pk3.park(new Car("blue","A1OHA","honda","civic"), 0);}
		catch (Exception e) {System.out.println(e);}
		try{pk3.park(new Car("red","BXCD4","mazda","3"), 3);}
		catch (Exception e) {System.out.println(e);}
		try{pk3.park(new Car("white","JYTCV58","chrysler","lebaron"), 9);}
		catch (Exception e) {System.out.println(e);}
		try{pk3.park(new Car("orange","67GFR","honda","accord"), 4);}
		catch (Exception e) {System.out.println(e);}
		try{pk3.park(new Car("green","YTGJK43","honda","pilot"), 3);}
		catch (Exception e) {System.out.println(e);}
		try{pk3.park(new Car("purple","54335G","honda","odyssey"), 2);}
		catch (Exception e) {System.out.println(e);}
		try{pk3.park(new Car("silver","FGGF6","mitsubishi","lancer"), 7);}
		catch (Exception e) {System.out.println(e);}
		try{pk3.park(new Car("maroon","LJLKL9","subaru","forester"), 5);}
		catch (Exception e) {System.out.println(e);}
		try {pk3.vacate(0);}
		catch (Exception e){System.out.println(e);}
		
		pk3.printInventory();
				
	

	}

}
