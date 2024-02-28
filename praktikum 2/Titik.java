  // File : Titik.java          21/02/24
  // Penulis : Aniqah Nursabrina
  // Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat
  public class Titik {
    double absis, ordinat;
    static int counterTitik;

    Titik(double absis, double ordinat) {
        counterTitik ++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }

    public double getJarakPusat(){
        return Math.sqrt(Math.pow(absis,2) + Math.pow(ordinat,2));
    }

    public void refleksiX(){
        ordinat = ordinat*(-1);   
    }

    public void refleksiY(){
        absis = absis*(-1);
    }
    public Titik getRefleksiX(){
        Titik hasil = new Titik(absis, ordinat*(-1));
        return hasil;   
    }
    public Titik getRefleksiY(){
        Titik hasil = new Titik(absis*(-1), ordinat);
        return hasil;
    }

}

