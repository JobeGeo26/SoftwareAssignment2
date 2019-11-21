package nuigalway.app;

import org.joda.time.DateTime;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ModuleTest {

    @Test
    public void testSetModuleName(){
        Module module = new Module("Software Eng", "CT417");
        module.setModuleName("changed name");
        String moduleName = "changed name";
        assertEquals(moduleName, module.getModuleName());

    }

    @Test
    public void testGetModuleName(){
        Module module = new Module("Software Eng", "CT417");
        String moduleName = "Software Eng";
        assertEquals(moduleName, module.getModuleName());

    }

    @Test
    public void testSetModuleID(){
        Module module = new Module("Software Eng", "CT417");
        module.setModuleID("changed ID");
        String id = "changed ID";
        assertEquals(id, module.getModuleID());

    }

    @Test
    public void testGetModuleID(){
        Module module = new Module("Software Eng", "CT417");
        String id = "CT417";
        assertEquals(id, module.getModuleID());

    }

    @Test
    public void testSetAndGetStudents(){
        Module module = new Module("Software Eng", "CT417");
        Student student = new Student("Jobe","George", 20, "26/11/1998","16323856");
        List<Student> students = new ArrayList<>();
        students.add(student);

        module.setStudents(students);

        assertNotNull(module.getStudents());
        assertEquals(students,module.getStudents());

    }

    @Test
    public void testSetAndGetCourses(){
        Module module = new Module("Software Eng", "CT417");
        CourseProgramme courseProgramme = new CourseProgramme("CS", DateTime.now(),DateTime.now());
        List<CourseProgramme> courseProgrammes = new ArrayList<>();
        courseProgrammes.add(courseProgramme);

        module.setCourses(courseProgrammes);

        assertNotNull(module.getCourses());
        assertEquals(courseProgrammes,module.getCourses());

    }

}
