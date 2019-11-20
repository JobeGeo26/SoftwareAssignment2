package nuigalway.app;

import java.util.List;

public class  Module{
    public String moduleName;
    public String moduleID;
    public List<Student> students;
    public List<CourseProgramme> courses;

    public Module(String name, String id) {
        this.moduleName = name;
        this.moduleID = id;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setCourses(List<CourseProgramme> courses) {
        this.courses = courses;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

}

