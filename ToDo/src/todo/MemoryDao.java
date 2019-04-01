package todo;

import java.util.ArrayList;
import java.util.List;

public class MemoryDao extends Dao {

	private List<ToDoItem> toDo= new ArrayList<ToDoItem>();

	

	@Override
	public boolean update(int id,String newdesc) {
		// TODO Auto-generated method stub
		for (ToDoItem a:toDo) {
			if (a.getId()==id) {
				a.setDesc(newdesc);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean update(int id,boolean done) {
		// TODO Auto-generated method stub
		for (ToDoItem a:toDo) {
			if (a.getId()==id) {
				a.setCompleted(done);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean add(ToDoItem item) {
		// TODO Auto-generated method stub
		for (ToDoItem a:toDo) {
			if (a.getId()==item.getId()) {
				return false;
			}
		}
		return this.toDo.add(item);
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		for (ToDoItem a:toDo) {
			if (a.getId()==id) {
				return toDo.remove(a);
			}
		}
		return false;
	}

	@Override
	public List<ToDoItem> list(boolean listCompleted, boolean listIncomplete) {
		// TODO Auto-generated method stub
		List<ToDoItem> ret= new ArrayList<>();
		for (ToDoItem a:toDo) {
			if ((a.isCompleted()&& listCompleted) || (!a.isCompleted() && listIncomplete)) {
				ret.add(a);
			}
		}
		return ret;
	}
	


}
