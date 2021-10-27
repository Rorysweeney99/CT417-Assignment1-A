// Rory Sweeney - 18342673

package CT417_Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Module {
	
	// Class Attributes
	private String name, moduleID;
	public List<Student> moduleStudents = new ArrayList<Student>();
	public List<Course> moduleCourses = new ArrayList<Course>();
	
	
	public Module(String name, String moduleID) {
		this.name = name;
		this.moduleID = moduleID;
	}
	
	// Getter Methods
	public String getName() {
		return name;
	}
	
	public String getModuleID() {
		return moduleID;
	}
	
	public List<Student> getStudents(){
		return moduleStudents;
	}
	
	public List<Course> getCourses(){
		return moduleCourses;
	}
	
	// Setter Methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	
	// Student & Course Utility Methods
	public void addStudent(Student s) {
		if(!moduleStudents.contains(s)) 
		{
			moduleStudents.add(s);
			s.addModule(this);
		}
	}
	
	public void addCourse(Course c) {
		if(!moduleCourses.contains(c)) 
		{
			moduleCourses.add(c);
			c.addModule(this);
		}
	}
	
	public void removeStudent(Student s) {
		if(moduleStudents.contains(s)) 
		{
			moduleStudents.remove(s);
			s.studentModules.remove(this);
		}
	}
	
	public void removeCourse(Course c) {
		if(moduleCourses.contains(c)) 
		{
			moduleCourses.remove(c);
			c.courseModules.remove(this);
		}
	}
	
	@Override
	public String toString() {
		return "\n"+name+"\n"+moduleID+"\n";
	}

}
