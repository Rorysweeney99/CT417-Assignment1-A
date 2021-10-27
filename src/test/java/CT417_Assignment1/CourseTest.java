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

public class CourseTest {
	DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
	//Mock Course Data : 
	// Name - "CSIT"
	// Start Date - "01/09/2018"
	// End Date - "07/05/2022"
	
	private Course courseTest = new Course("CSIT", dtf.parseDateTime("01/09/2018"), dtf.parseDateTime("07/05/2022"));
	private Student studentMock = new Student("John", 21, dtf.parseDateTime("01/01/2000"), 123456789);
	private Module moduleMock = new Module("Computer Science","CS123");
	
	@Test
	public void testName() {	  
		assertEquals("CSIT",courseTest.getName());
	}
	
	@Test
	public void testStartDate() {	  
		assertEquals(dtf.parseDateTime("01/09/2018") ,courseTest.getStartDate());
	}
	
	@Test
	public void testEndDate() {	  
		assertEquals(dtf.parseDateTime("07/05/2022"),courseTest.getEndDate());
	}
	
	@Test
    public void testContsructor(){      
        courseTest = new Course("CSIT", dtf.parseDateTime("01/09/2018"), dtf.parseDateTime("07/05/2022"));

        assertNotNull(courseTest.getName());
        assertNotNull(courseTest.getStartDate());
        assertNotNull(courseTest.getEndDate());
    }
	
	@Test
    public void testAddStudentsAndModules(){
        courseTest.addStudent(studentMock);
		courseTest.addModule(moduleMock);
        
		assertTrue(courseTest.getStudents().contains(studentMock));
        assertTrue(courseTest.getModules().contains(moduleMock));
	}
	
	@Test
    public void testRemoveModulesAndCourses(){
		courseTest.addStudent(studentMock);
        courseTest.addModule(moduleMock);

        assertTrue(courseTest.getStudents().contains(studentMock));
        assertTrue(courseTest.getModules().contains(moduleMock));    

        courseTest.removeStudent(studentMock);
        courseTest.removeModule(moduleMock);
        
        assertFalse(courseTest.getStudents().contains(studentMock));
        assertFalse(courseTest.getModules().contains(moduleMock));
    }
}