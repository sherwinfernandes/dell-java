package timesheet;

import java.time.LocalDateTime;

public class TimesheetEntry {

	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	private static int NEXTID = 1;
	
	

	

	public TimesheetEntry(String myProject , String myTask) {
		super();
		this.projectName = myProject;
		this.task = myTask;
		this.id = NEXTID;
		this.startTime = LocalDateTime.now();
		NEXTID++;
	}




	public String getProjectName() {
		return projectName;
	}




	public String getTask() {
		return task;
	}




	public int getId() {
		return id;
	}




	public LocalDateTime getStartTime() {
		return startTime;
	}




	public LocalDateTime getEndTime() {
		return endTime;
	}




	public static int getNEXTID() {
		return NEXTID;
	}
	
	public void updateEndTime() throws IllegalArgumentException {
		if (this.endTime!=null)
			throw new IllegalArgumentException("Time already set");
		else this.endTime= LocalDateTime.now();
		
	}
	
	public boolean equals(TimesheetEntry other) {
		return (this.id== other.id);
	}

	
}
