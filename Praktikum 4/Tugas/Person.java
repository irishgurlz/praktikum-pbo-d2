public class Person {
    private String name;
    private int age;
    private String address;
    private static int personCount = 0;

    public Person(String name, int age, String address) {
        personCount++;
        this.name = name;
        this.age = age;
        this.address = address;
        personCount++;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getPersonCount() {
        return personCount;
    }

    public void getDetails(){
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
        System.out.println("Alamat: " + address);
    }

}



