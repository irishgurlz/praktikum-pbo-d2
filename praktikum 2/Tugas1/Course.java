import java.util.List;
import java.util.ArrayList;

public class Course {
    String courseCode;
    String courseName;
    Lecturer lecture;
    List<Student> studentsEnrolled;

    Course(String courseCode, String courseName, Lecturer lecture){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
        this.studentsEnrolled = new ArrayList<>();
    }
    public void addStudent(Student student){
        this.studentsEnrolled.add(student);
    }
    void removeStudent(Student studentR){ 
        studentsEnrolled.remove(studentR);
    }

    public void getDetails() {
        System.out.println("Course Code: " + this.courseCode);
        System.out.println("Nama Course: " + this.courseName);
        System.out.println("Lecturer:"  + this.lecture.getName());
    }

    public void viewEnrolledStudents(){
        for (Student student : studentsEnrolled){
            student.getDetails();
        }
    }
}
