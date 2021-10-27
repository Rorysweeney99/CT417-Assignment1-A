// Rory Sweeney - 18342673

package CT417_Assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Test;

public class ModuleTest {
	DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
	//Mock Module Data : 
	// Name - "Computer Science"
	// Module ID - "CS123"
	
	private Module moduleTest = new Module("Computer Science","CS123");
	private Student studentMock = new Student("John", 21, dtf.parseDateTime("01/01/2000"), 123456789);
	private Course courseMock = new Course("CSIT", dtf.parseDateTime("01/09/2018"), dtf.parseDateTime("07/05/2022"));
	
	@Test
	public void testName() {	  
		assertEquals("Computer Science",moduleTest.getName());
	}
	
	@Test
	public void testModuleID() {	  
		assertEquals("CS123" ,moduleTest.getModuleID());
	}
	
	@Test
    public void testContsructor(){      
        moduleTest = new Module("Computer Science","CS123");

        assertNotNull(moduleTest.getName());
        assertNotNull(moduleTest.getModuleID());
    }
	
	@Test
    public void testAddStudentsAndModules(){
        moduleTest.addStudent(studentMock);
		moduleTest.addCourse(courseMock);
        
		assertTrue(moduleTest.getStudents().contains(studentMock));
        assertTrue(moduleTest.getCourses().contains(courseMock));
	}
	
	@Test
    public void testRemoveModulesAndCourses(){
		moduleTest.addStudent(studentMock);
        moduleTest.addCourse(courseMock);

        assertTrue(moduleTest.getStudents().contains(studentMock));
        assertTrue(moduleTest.getCourses().contains(courseMock));    

        moduleTest.removeStudent(studentMock);
        moduleTest.removeCourse(courseMock);
        
        assertFalse(moduleTest.getStudents().contains(studentMock));
        assertFalse(moduleTest.getCourses().contains(courseMock));
    }

}
