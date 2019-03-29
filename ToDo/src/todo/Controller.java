package todo;

import java.util.Scanner;

public class Controller {
	
	private static Scanner inp = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length == 0) interactive();
		else if (args[0].equals("demo")) demo();

		
	}
	
	private static void demo() {
		Dao thingstodo= new DbDao(); // create a DB connection to things to do
		
		// add some tasks
		thingstodo.add(new ToDoItem("wash dishes"));
		thingstodo.add(new ToDoItem("dry dishes"));
		thingstodo.add(new ToDoItem("wash clothes"));
		thingstodo.add(new ToDoItem("dry clothes"));
		
		//print
		System.out.println(thingstodo.list(true, true));
		
		//update items and print the active and completed items in the list
		thingstodo.update(1, true);
		thingstodo.update(3, "dry clothes thoroughly");
		System.out.println(thingstodo.list(true, false));
		System.out.println(thingstodo.list(false, true));

		//delete an item and print the list
		thingstodo.delete(0);
		System.out.println(thingstodo.list(true, true));

	}
	
	private static void interactive() {
		Dao thingstodo= new DbDao(); // create a DB connection to things to do
		
		int choice;
		do {
			displaymainmenu(); //choose list all, list active, list completed, add, delete or mark complete
			choice= Integer.parseInt(inp.nextLine());
			if (choice ==1 ) System.out.println(thingstodo.list(true, true));
			if (choice ==2 ) System.out.println(thingstodo.list(false, true));
			if (choice ==3 ) System.out.println(thingstodo.list(true, false));
			if (choice ==4 ) {
				System.out.println("Enter the description of the task to add");
				thingstodo.add(new ToDoItem(inp.nextLine()));
			}
			if (choice ==5 ) {
				System.out.println("Enter the id of the task to delete");
				thingstodo.delete(Integer.parseInt(inp.nextLine()));
			}
			if (choice ==6 ) {
				System.out.println("Enter the id of the task to mark complete");
				thingstodo.update(Integer.parseInt(inp.nextLine()), true);
			}
		}while (choice !=7 );
		
		
	}
	
	private static void displaymainmenu() {
		System.out.println("Please select from the menu options below");
		System.out.println("1) List all items");
		System.out.println("2) List active items");
		System.out.println("3) List completed items");
		System.out.println("4) Add an item");
		System.out.println("5) delete an item");
		System.out.println("6) mark an item complete");
		System.out.println("7) Exit");

	}
	

}
