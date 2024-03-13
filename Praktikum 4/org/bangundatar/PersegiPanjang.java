package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;
    
    public PersegiPanjang (double panjang, double lebar, int jumlahSisi){
        super(jumlahSisi);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang bersisi " + this.getJumlahSisi());
    }
}
