// Rory Sweeney - 18342673

package CT417_Assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.*;
import org.joda.time.format.*;
import org.junit.Test;
import java.util.List;

public class StudentTest {
	private DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
	
	//Mock Student Data : 
	// Name - "John"
	// Age - 21
	// DOB - 01/01/2000
	// Student ID - 123456789
	// Username - John21
	
	private Student studentTest = new Student("John", 21, dtf.parseDateTime("01/01/2000"), 123456789);
	private Module moduleMock = new Module("Computer Science","CS123");
	private Course courseMock = new Course("CSIT", dtf.parseDateTime("01/09/2018"), dtf.parseDateTime("07/05/2022")); 
	
	@Test
	   public void testName() {	  
	      assertEquals("John",studentTest.getName());
	   }
	
	@Test
	   public void testAge() {	  
	      assertEquals(21 ,studentTest.getAge());
	   }
	@Test
	   public void testDOB() {	  
	      assertEquals(dtf.parseDateTime("01/01/2000"),studentTest.getDOB());
	   }
	@Test
	   public void testID() {	  
	      assertEquals(123456789,studentTest.getId());
	   }
	
	@Test
	   public void testUsername() {	  
	      assertEquals("John21",studentTest.getUsername());
	   }
	
	@Test
    public void testContsructor(){      
        studentTest = new Student("John", 21, dtf.parseDateTime("01/01/2000"), 123456789);

        assertNotNull(studentTest.getName());
        assertNotNull(studentTest.getDOB());
        assertEquals(21, studentTest.getAge());
        assertEquals(123456789, studentTest.getId());
    }
	
	@Test
    public void testAddModulesAndCourses(){
        studentTest.addModule(moduleMock);
        studentTest.addCourse(courseMock);

        assertTrue(studentTest.getModules().contains(moduleMock));
        assertTrue(studentTest.getCourses().contains(courseMock));
	}
	
	@Test
    public void testRemoveModulesAndCourses(){
        studentTest.addModule(moduleMock);
        studentTest.addCourse(courseMock);

        assertTrue(studentTest.getModules().contains(moduleMock));
        assertTrue(studentTest.getCourses().contains(courseMock));

        studentTest.removeModule(moduleMock);
        studentTest.removeCourse(courseMock);

        assertFalse(studentTest.getModules().contains(moduleMock));
        assertFalse(studentTest.getCourses().contains(courseMock));
    }
}
