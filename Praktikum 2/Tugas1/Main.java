public class Main {
    public static void main(String[] args) {
        Student cahyo, dani, edi;
        Lecturer agus, bambang;
        Course cs101, cs102, cs103;

        //student
        cahyo = new Student("Cahyo", 20, "456 Elm St", "723751");
        dani = new Student("Dani", 20, "123 Oak St", "734621");
        edi = new Student("Edi", 20, "789 Pine St", "733451");

        // cahyo.getDetails();
        // dani.getDetails();
        // edi.getDetails();

        //lecturer
        agus = new Lecturer("Agus", 35, "Tembalang", 177013);
        bambang = new Lecturer("Bambang", 35, "Banyumanik", 412873);

        // agus.getDetails();
        // bambang.getDetails();

        
        //course
        cs101 = new Course("CS101", "Intro to Computer Science", agus);
        cs102 = new Course("CS102", "Data Structures", agus);
        cs103 = new Course("CS103", "Algorithms", bambang);
        
        cs101.addStudent(cahyo);
        cs101.addStudent(dani);
        cs101.addStudent(edi);

        agus.teachCourse(cs101);
        agus.teachCourse(cs102);
        bambang.teachCourse(cs103);  
        
        // cs101.getDetails();
        // cs102.getDetails();
        // cs103.getDetails();

        // cahyo.enrollInCourse(cs101);

        // cahyo.viewEnrolledCourses();
        cs101.viewEnrolledStudents();
        System.out.println();
        cs101.removeStudent(cahyo);
        cs101.viewEnrolledStudents();
        // agus.viewTaughtCourses();
    }
}
        

