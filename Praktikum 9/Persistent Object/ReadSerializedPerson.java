import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("Serialized person name = " + person.getName());
        } catch (FileNotFoundException e) {
            System.out.println("File 'person.ser' not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading from file 'person.ser'.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class 'Person' not found.");
            e.printStackTrace();
        }
    }
}
