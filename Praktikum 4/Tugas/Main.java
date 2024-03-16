public class Main {
    public static void main(String[] args) {
        Student cahyo, dani, edi;
        Lecture agus, bambang;
        Course cs101, cs102, cs103;

        //student
        cahyo = new Student("Cahyo", 20, "456 Elm St", "723751");
        dani = new Student("Dani", 20, "123 Oak St", "734621");
        edi = new Student("Edi", 20, "789 Pine St", "733451");

        //Lecture
        agus = new Lecture("Agus", 35, "Tembalang", 177013);
        bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);


        
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
        

        cs101.viewEnrolledStudents();
        System.out.println();
        cs101.removeStudent(cahyo);
        cs101.viewEnrolledStudents();
    }
}
        

