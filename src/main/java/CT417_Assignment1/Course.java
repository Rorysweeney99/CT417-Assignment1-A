package CT417_Assignment1;

import org.joda.time.*;
import java.util.List;

public class Course {
	
	private String name;
	private List<Student> courseStudents;
	private List<Module> courseModules;
	private DateTime startDate;
	private DateTime endDate;
	public Course(String name, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

}
