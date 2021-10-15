package CT417_Assignment1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.joda.time.*;
import org.joda.time.format.*;
import org.junit.Test;
import java.util.List;

public class StudentTest {
	DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
	
	//Mock Student Data 
	String dobString = "01/01/2000";
	DateTime dob = dtf.parseDateTime(dobString);
	public Student stu = new Student("John", 21, dob, 123456789);
	
	List<Module> testModules = Arrays.asList( new Module("SoftwareEngineering3"), 
			new Module("AdvancedProfessionalSkills"),
			new Module("InfomationRetrieval") );
	
	String startDateString = "01/09/2018";
	DateTime startDate= dtf.parseDateTime(startDateString);
	String endDateString = "30/05/2022";
	DateTime endDate = dtf.parseDateTime(endDateString);
	
	List<Course> testCourses = Arrays.asList( new Course("CS&IT",startDate,endDate),
			new Course("ECE",startDate,endDate) );
	
	
	
	@Test
	   public void testName() {	  
	      assertEquals("John",stu.getName());
	   }
	
	@Test
	   public void testAge() {	  
	      assertEquals(21 ,stu.getAge());
	   }
	@Test
	   public void testDOB() {	  
	      assertEquals(dob,stu.getDOB());
	   }
	@Test
	   public void testID() {	  
	      assertEquals(123456789,stu.getId());
	   }
	
	@Test
	   public void testUsername() {	  
	      assertEquals("John123456789",stu.getUsername());
	   }
	
	@Test
	   public void testStudentModules() {	  
	      stu.addModule(new Module("SoftwareEngineering3"));
	      stu.addModule(new Module("AdvancedProfessionalSkills"));
	      stu.addModule(new Module("InfomationRetrieval"));
	      assertEquals(testModules,stu.getModules());
	   }
	
	@Test
	   public void testStudentCourses() {	  
	      stu.addCourse(new Course("CS&IT",startDate,endDate));
	      stu.addCourse(new Course("ECE",startDate,endDate));
	      assertEquals(testCourses,stu.getCourses());
	   }
	
	
	

}
