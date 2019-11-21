package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentTest {

    @Test
    public void testGetUsername() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");
        String username = "Name:Jobe George Age:20";
        assertEquals(username, student.getUsername());
    }

    @Test
    public void testSetFirstName() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");

        student.setFirstName("John");
        String fName = "John";
        assertEquals(fName, student.getFirstName());
    }

    @Test
    public void testGetFirstName() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");


        assertEquals("Jobe", student.getFirstName());
    }

    @Test
    public void testSetLastName() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");

        student.setLastName("Smith");
        String lName = "Smith";
        assertEquals(lName, student.getLastName());
    }

    @Test
    public void testGetLastName() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");


        assertEquals("George", student.getLastName());
    }

    @Test
    public void testSetAge() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");

        student.setAge(25);
        int age = 25;
        assertEquals(age, student.getAge());
    }

    @Test
    public void testGetAge() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");


        assertEquals(20, student.getAge());
    }

    @Test
    public void testSetDateOfBirth() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");

        student.setDateOfBirth("26/11/1995");
        String DOB = "26/11/1995";
        assertEquals(DOB, student.getDateOfBirth());
    }

    @Test
    public void testGetDateOfBirth() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");


        assertEquals("26/11/1998", student.getDateOfBirth());
    }

    @Test
    public void testSetStudentID() {
        Student student = new Student("Jobe", "George", 19, "26/11/1999", "16323856");

        student.setStudentID("162626262");
        String id = "162626262";
        assertEquals(id, student.getStudentID());
    }

    @Test
    public void testGetStudentID() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");


        assertEquals("16323856", student.getStudentID());
    }

    @Test
    public void testSetAndGetModules() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");
        Module module = new Module("Software Eng", "CT417");
        List<Module> modules = new ArrayList<>();
        modules.add(module);
        student.setModules(modules);

        assertNotNull(student.getModules());
        assertEquals(modules, student.getModules());
    }

    @Test
    public void testSetAndGetCourses() {
        Student student = new Student("Jobe", "George", 20, "26/11/1998", "16323856");
        CourseProgramme courseProgramme = new CourseProgramme("CS", DateTime.now(),DateTime.now());
        List<CourseProgramme> courseProgrammes = new ArrayList<>();
        courseProgrammes.add(courseProgramme);
        student.setCourses(courseProgrammes);

        assertNotNull(student.getCourses());
        assertEquals(courseProgrammes, student.getCourses());
    }

}
