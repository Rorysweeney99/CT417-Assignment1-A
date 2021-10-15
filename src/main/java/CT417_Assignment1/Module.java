package CT417_Assignment1;

import java.util.List;

public class Module {

	private String name;
	private List<Course> moduleCourses;
	private List<Student> moduleStudents;	
	
	public Module(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
