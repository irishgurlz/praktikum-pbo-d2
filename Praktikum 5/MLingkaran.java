import Interface.Lingkaran;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Lingkaran l = new Lingkaran(10.2);
        double jejari = scan.nextDouble();
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
    }
}
