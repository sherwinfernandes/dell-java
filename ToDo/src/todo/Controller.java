package todo;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao thingstodo= new DbDao(); // create a DB of things to do
		
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

}
