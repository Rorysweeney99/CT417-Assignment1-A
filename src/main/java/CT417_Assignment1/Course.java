// Rory Sweeney - 18342673

package CT417_Assignment1;

import org.joda.time.*;
import java.util.ArrayList;
import java.util.List;

public class Course {
	
	// Class Attributes
	private String name;
	public List<Student> courseStudents =  new ArrayList<Student>();
	public List<Module> courseModules = new ArrayList<Module>();
	private DateTime startDate, endDate;
	
	public Course(String name, DateTime startDate, DateTime endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	// Getter Methods
	public String getName() {
		return name;
	}
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public List<Student> getStudents() {
		return courseStudents;
	}
	
	public List<Module> getModules() {
		return courseModules;
	}
	
	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	// Student & Module Utility Functions
	public void addModule(Module m) {
		if(!courseModules.contains(m)) 
		{
			courseModules.add(m);
			m.addCourse(this);
		}
	}
	
	
	public void addStudent(Student s) {
		if(!courseStudents.contains(s)) 
		{
			courseStudents.add(s);
			s.addCourse(this);
		}
	}
	
	public void removeStudent(Student s) {
		if(courseStudents.contains(s)) 
		{
			courseStudents.remove(s);
			s.studentCourses.remove(this);
		}
	}
	
	public void removeModule(Module m) {
		if(courseModules.contains(m)) 
		{
			courseModules.remove(m);
			m.moduleCourses.remove(this);
		}
	}
	
	
	@Override
	public String toString() {
		return "\n"+name+"\n"+startDate+"\n"+endDate+"\n";
	}

}
