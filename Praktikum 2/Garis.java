public class Garis {
    Titik titikAwal, titikAkhir;

    Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(),2)+ Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(),2));
    }

    public double getGradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat())/(titikAkhir.getAbsis() - titikAwal.getAbsis());   
    }

    public Garis getRefleksiY(){
        Garis hasil = new Garis(titikAwal.getRefleksiY(), titikAkhir.getRefleksiY());
        return hasil;
    }

    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1; 
    }

}

