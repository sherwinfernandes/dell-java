package timesheet;

import java.util.List;
import java.util.ArrayList;

public class Timesheet {

	private List<TimesheetEntry> database;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Timesheet() {
		super();
		this.database = new ArrayList<>();
	}

	public boolean add(String project, String task) {
		return this.database.add(new TimesheetEntry(project, task));
	}
	
	public List<TimesheetEntry> list() {
		return database;
	}
	
	public List<TimesheetEntry> list(String name) {
		if (name==null) return list();
		List<TimesheetEntry> ret= new ArrayList<>();
		for (TimesheetEntry a: database) {
			if (a.getProjectName().equals(name))
				ret.add(a);
		}
		return ret;
	}

	public List<TimesheetEntry> list(boolean activeOnly ) {
		if (!activeOnly) return list();
		List<TimesheetEntry> ret= new ArrayList<>();
		for (TimesheetEntry a: database) {
			if (a.getEndTime()==null)
				ret.add(a);
		}
		return ret;
	}
	
	public List<TimesheetEntry> list(boolean activeOnly, String name) {
		if (name==null) return list(activeOnly);
		if (!activeOnly) return list(name);
		List<TimesheetEntry> ret= new ArrayList<>();
		for (TimesheetEntry a: database) {
			if (a.getProjectName().equals(name) && a.getEndTime()==null)
				ret.add(a);
		}
		return ret;
	}
		

	public TimesheetEntry get(int id) {
		for (TimesheetEntry a : database) {
			if (a.getId() == id)
				return a;
		}
		return null;
	}

	public boolean delete(TimesheetEntry entry) {
		return database.remove(entry);

	}
	
	public void stop(TimesheetEntry entry) {
		try{
			entry.updateEndTime();
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		}
	}

}
