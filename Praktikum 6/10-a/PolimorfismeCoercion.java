//=========== a ================

//Syarat:
// Memiliki parameter yang berbeda. Perbedaannya bisa dalam hal 
// jumlah parameter, tipe parameter, atau urutan parameter.

// Contoh:
// public class Tambah {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public double add(double a, double b) {
//         return a + b;
//     }
// }

//=========== b ================
public class PolimorfismeCoercion {
    public static void main(String[] args){
        int output1 = 'a'; 
        System.out.println(output1);

        double x = 15.5;
        int output2 = x;
        System.out.println(output2);  
        //Kesalahan ini disebabkan oleh penugasan dari 
        //double ke int tanpa casting. Anda perlu 
        //mengkonversi double ke int

        int y = 15;
        double output3 = y;
        System.out.println(output3); 

        int z = 78;
        char output4 = (char)z;
        System.out.println(output4);

        char a = 'a';
        double output5 = a;
        System.out.println(output5);
    }
    
}
