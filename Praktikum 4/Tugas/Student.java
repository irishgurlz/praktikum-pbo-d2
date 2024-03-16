import java.util.List;
import java.util.ArrayList;


public class Student extends Person{
    String name;
    int age;
    String address;
    String studentID;
    List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        super(name, age, address);
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void enrollInCourse(Course course){
        this.coursesEnrolled.add(course);
        course.addStudent(this);
    }

    // Method to display student details
    
    @Override public void getDetails() {
        super.getDetails(); 
        System.out.println("Student ID: " + this.studentID);
    }

    public void viewEnrolledCourses(){
        for (Course course : coursesEnrolled){
            course.getDetails();
        }
    }
}
