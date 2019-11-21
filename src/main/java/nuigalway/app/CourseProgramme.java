package nuigalway.app;

import java.util.List;

import org.joda.time.DateTime;

public class CourseProgramme {
    public String courseName;
    public List<Module> modules;
    public List<Student> students;
    public DateTime startDate;
    public DateTime endDate;

    public CourseProgramme(String name, DateTime startDate, DateTime endDate) {
        this.courseName = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

}

