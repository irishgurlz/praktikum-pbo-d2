import java.util.ArrayList;
public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> MahasiswaList = new ArrayList<>();
        MahasiswaList.add("Adi");
        MahasiswaList.add("Bambang");
        MahasiswaList.add("Cici");

        MahasiswaList.forEach((nama) -> System.out.println(nama));

    }
}
