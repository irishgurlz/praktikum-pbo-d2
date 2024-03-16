import java.util.List;
import java.util.ArrayList;

public class Lecture extends Person{
    String name;
    int age;
    String address;
    int employeeID;
    List<Course> coursesTaught;

    // Constructor
    public Lecture(String name, int age, String address, int employeeID) {
        super(name, age, address);
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public int getEmployeeID() {
        return employeeID;
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

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
    @Override public void getDetails() {
        super.getDetails(); 
        System.out.println("Employee ID: " + this.employeeID);
    }
    public void teachCourse(Course course) {
        this.coursesTaught.add(course);
    }

    public void viewTaughtCourses() {
        for (Course course : coursesTaught) {
            course.getDetails();
        }
    }
}
