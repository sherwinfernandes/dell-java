package rentable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Rentable> bob= new ArrayList<>();
		bob.add(new Room(100.99, "Austin Hyatt"));
		bob.add(new Condo(250.45, "Denver Hills"));
		bob.add(new Room (120.42, "Palm Springs Main Street"));
		bob.add(new Condo(555.23, "Downtown Houston"));
		bob.add(new Tool(3.10, "Circular Saw"));
		bob.add(new Tool(4.10, "Cordless Drill"));

		for (Rentable a: bob) {
			System.out.println(a.getDescription() + " Daily Rate is "+a.getDailyRate());
		}
		
		System.out.println("\nHow many days do you want to rent these items for?");
		Scanner inp = new Scanner(System.in);
		int days = Integer.parseInt(inp.nextLine());
		
		for (Rentable a: bob) {
			System.out.println(a.getDescription() + " Total Price is "+a.getPrice(days));
		}
		
		
	}

}
