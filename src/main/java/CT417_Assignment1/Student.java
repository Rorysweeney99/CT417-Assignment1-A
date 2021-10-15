package CT417_Assignment1;


import java.util.List;
import org.joda.time.DateTime;


public class Student {
	
	// Class Attributes
	private String name;
	private int age;
	private DateTime DOB;
	private int id;
	private List<Course> studentCourses;
	private List<Module> studentModules;
	
	public Student(String name, int age, DateTime DOB, int id) {
		this.name = name;
		this.age = age;
		this.DOB = DOB;
		this.id = id;
		studentCourses = null;
		studentModules = null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public DateTime getDOB() {
		return DOB;
	}

	public void setDOB(DateTime dOB) {
		DOB = dOB;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return name + Integer.toString(id);
	}
	
	public void addCourse(Course c) {
		this.studentCourses.add(c);
	}
	
	public List<Course> getCourses(){
		return this.studentCourses;
	}
	
	public void addModule(Module m) {
		this.studentModules.add(m);
	}
	
	public List<Module> getModules(){
		return this.studentModules;
	}

}
