package todo;


import java.util.List;

public abstract class Dao {
	
	//counter for numbering ToDo items
	private static int counter=1;

	protected Dao()//create method
	{
		
	}
	
	public abstract boolean update(int id, String newdesc);

	public abstract boolean update(int id, boolean done);
	
	//add method
	public abstract boolean add(ToDoItem toAdd);
	
	public abstract boolean delete(int id);
	
	public abstract List<ToDoItem> list(boolean listCompleted, boolean listIncomplete);
	
	public static int getCounter() {
		return counter++;
	}
}
