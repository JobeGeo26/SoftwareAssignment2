package nuigalway.app;

import java.util.List;

public class Student {

    public String firstName;
    public String lastName;
    public int age;
    public String dateOfBirth;
    public String studentID;
    public String username;
    public List<Module> modules;
    public List<CourseProgramme> courses;

    public Student(String fName, String lName, int age, String DOB, String id) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        this.dateOfBirth = DOB;
        this.studentID = id;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }


    public String getUsername() {
        username = "Name:" + firstName + " " + lastName + " " + "Age:" + age;
        return username;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setCourses(List<CourseProgramme> courses) {
        this.courses = courses;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

}