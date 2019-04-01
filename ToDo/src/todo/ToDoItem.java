package todo;

public class ToDoItem {

	private int id;//id
	private String desc;//description
	private boolean completed;//completed flag
	
	//private static int counter=0;
	
	public ToDoItem(String desc) {
		id=Dao.getCounter(); //get the counter from the Dao abstract class
		this.desc = desc;
		completed= false;
	}
	
	//create an item
	public ToDoItem(String desc, boolean completed) {
		id=MemoryDao.getCounter();
		this.desc = desc;
		this.completed= completed;
	}
	
	// method for creating duplicate items for the list method
	public ToDoItem(int id, String desc, boolean completed) {
		this.id=id;
		this.desc = desc;
		this.completed= completed;
	}
	
	
	//getters and setters
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	
	@Override
	public String toString() {
		// to print the items
		return "ToDoItem [id=" + id + ", desc=" + desc + ", completed=" + completed + "]";
	}

}
