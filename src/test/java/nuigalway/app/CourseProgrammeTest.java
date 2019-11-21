package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CourseProgrammeTest {


    @Test
    public void testSetCourseName(){
        CourseProgramme courseProgramme = new CourseProgramme("CS", DateTime.now(),DateTime.now());
        courseProgramme.setCourseName("changed name");
        String courseName = "changed name";
        assertEquals(courseName,courseProgramme.getCourseName());

    }

    @Test
    public void testGetCourseName(){
        CourseProgramme courseProgramme = new CourseProgramme("CS", DateTime.now(),DateTime.now());
        String courseName = "CS";
        assertEquals(courseName,courseProgramme.getCourseName());

    }

    @Test
    public void testSetCourseStartDate(){
        CourseProgramme courseProgramme = new CourseProgramme("CS", DateTime.now(),DateTime.now());
        DateTime startDate = DateTime.now();
        courseProgramme.setStartDate(startDate.plusMonths(1));

        assertEquals(startDate.plusMonths(1),courseProgramme.getStartDate());

    }

    @Test
    public void testGetCourseStartDate(){
        DateTime testStart = DateTime.now();
        DateTime testEnd = DateTime.now();

        CourseProgramme courseProgramme = new CourseProgramme("CS", testStart,testEnd);
        assertEquals(testStart,courseProgramme.getStartDate());

    }

    @Test
    public void testSetCourseEndDate(){
        CourseProgramme courseProgramme = new CourseProgramme("CS", DateTime.now(),DateTime.now());
        DateTime endDate = DateTime.now();
        courseProgramme.setEndDate(endDate.plusMonths(1));

        assertEquals(endDate.plusMonths(1),courseProgramme.getEndDate());

    }

    @Test
    public void testGetCourseEndDate(){
        DateTime testStart = DateTime.now();
        DateTime testEnd = DateTime.now();

        CourseProgramme courseProgramme = new CourseProgramme("CS", testStart,testEnd);
        assertEquals(testEnd,courseProgramme.getEndDate());

    }

    @Test
    public void testSetAndGetStudents(){
        CourseProgramme courseProgramme = new CourseProgramme("CS", DateTime.now(),DateTime.now());
        Student student = new Student("Jobe","George", 20, "26/11/1998","16323856");

        List<Student> students = new ArrayList<>();
        students.add(student);

        courseProgramme.setStudents(students);

        assertNotNull(courseProgramme.getStudents());
        assertEquals(students,courseProgramme.getStudents());

    }

    @Test
    public void testSetAndGetModules(){
        CourseProgramme courseProgramme = new CourseProgramme("CS", DateTime.now(),DateTime.now());
        Module module = new Module("Software Eng", "CT417");
        List<Module> modules = new ArrayList<>();
        modules.add(module);

        courseProgramme.setModules(modules);

        assertNotNull(courseProgramme.getModules());
        assertEquals(modules,courseProgramme.getModules());

    }

}
