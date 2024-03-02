import java.util.List;
import java.util.ArrayList;

public class Lecturer {
    String name;
    int age;
    String address;
    int employeeID;
    List<Course> coursesTaught;

    // Constructor
    public Lecturer(String name, int age, String address, int employeeID) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
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
    public void getDetails() {
        System.out.println("Nama: " + this.name);
        System.out.println("Umur: " + this.age);
        System.out.println("Alamat: " + this.address);
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
