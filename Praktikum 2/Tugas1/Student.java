import java.util.List;
import java.util.ArrayList;


public class Student {
    String name;
    int age;
    String address;
    String studentID;
    List<Course> coursesEnrolled;

    public Student(String name, int age, String address, String studentID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.studentID = studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
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
    public void getDetails() {
        System.out.println("Nama: " + this.name);
        System.out.println("Umur: " + this.age);
        System.out.println("Alamat: " + this.address);
        System.out.println("Student ID: " + this.studentID);
    }

    public void viewEnrolledCourses(){
        for (Course course : coursesEnrolled){
            course.getDetails();
        }
    }
}
