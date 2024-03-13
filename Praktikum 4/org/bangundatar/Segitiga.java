package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon{
    private double alas, tinggi;

    public Segitiga (double alas, double tinggi, int jumlahSisi){
        super(jumlahSisi);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas(){
        return 1/2 * alas * tinggi;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}
