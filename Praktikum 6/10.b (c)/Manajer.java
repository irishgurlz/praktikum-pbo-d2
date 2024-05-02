public class Manajer extends Pegawai {
    private int tunjangan = 7000000;  

    public Manajer(String nama) {
        super(nama);
    }

    @Override public void tampilData() {  
        super.tampilData();  
        System.out.println("Tunjangan: " + tunjangan);  
    }
}