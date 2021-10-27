// Rory Sweeney - 18342673

package CT417_Assignment1;


import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;


public class Student {
	
	// Class Attributes
	private String name;
	private int age, id;
	private DateTime DOB;
	public List<Course> studentCourses = new ArrayList<Course>();
	public List<Module> studentModules = new ArrayList<Module>(); 
	
	public Student(String name, int age, DateTime DOB, int id) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.id = id;
	}
	
	// Getter Methods 
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public DateTime getDOB() {
		return DOB;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return name + age;
	}
	
	public List<Course> getCourses(){
		return studentCourses;
	}
	
	public List<Module> getModules(){
		return studentModules;
	}
	
	// Setter Methods 
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public void setDOB(DateTime dOB) {
		DOB = dOB;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	// Course & Module Utility Functions
	public void addCourse(Course c) {
		if(!studentCourses.contains(c)) 
		{
			studentCourses.add(c);
			c.addStudent(this);
		}
	}
	
	
	public void addModule(Module m) {
		if(!studentModules.contains(m)) 
		{
			studentModules.add(m);
			m.addStudent(this);
		}
	}
	
	public void removeCourse(Course c) {
		if(studentCourses.contains(c)) 
		{
			studentCourses.remove(c);
			c.courseStudents.remove(this);
		}
	}
	
	public void removeModule(Module m) {
		if(studentModules.contains(m)) 
		{
			studentModules.remove(m);
			m.moduleStudents.remove(this);
		}
	}
	
	@Override
	public String toString() {
		return name+"\n"+age+"\n"+DOB+"\n"+id+"\n"+getUsername()+"\n";
	}
}
