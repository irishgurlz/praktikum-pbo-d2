package org.main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        Segitiga segitiga = new Segitiga(10,3,3);
        segitiga.printInfo();
        persegi.printInfo();
        System.out.println("Luas PersegiPanjang:"+persegi.hitungLuas());
    }
}