package todo;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dao thingstodo= new DbDao();
		thingstodo.add(new ToDoItem("wash dishes"));
		thingstodo.add(new ToDoItem("dry dishes"));
		thingstodo.add(new ToDoItem("wash clothes"));
		thingstodo.add(new ToDoItem("dry clothes"));
		System.out.println(thingstodo.list(true, true));
		
		thingstodo.update(1, true);
		thingstodo.update(3, "dry clothes thoroughly");
		System.out.println(thingstodo.list(true, false));
		System.out.println(thingstodo.list(false, true));

		thingstodo.delete(0);
		System.out.println(thingstodo.list(true, true));

		
	}

}
