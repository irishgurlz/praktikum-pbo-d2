public class KontrolSenjata{
    private Senjata weapon;
    private int jumPeluru;
    
    public KontrolSenjata (Senjata weapon){
        this.weapon = weapon;
        this.jumPeluru = 0;
    }
    
    public boolean isAdaPeluru() {
        if (jumPeluru <= 0) {
            System.out.println("Peluru Habis");
            return false;
        }
        return true;
    }
    
    public void isiPeluru(int newJumPeluru){
        jumPeluru = jumPeluru + newJumPeluru; 
        weapon.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()){
            if (jumPeluru < jumlah){
                for (int i = 0; i < jumPeluru; i++){
                    System.out.println(weapon.getBunyi() + " ");
                }
                for (int i = 0; i < jumlah - jumPeluru; i++){
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                jumPeluru = 0;
                System.out.println("Peluru sisa: " + jumPeluru);
            }
            else{
                for (int i = 0; i < jumlah; i++){
                    System.out.println(weapon.getBunyi() + " ");
                }
                jumPeluru = jumPeluru - jumlah;
                System.out.println("Peluru sisa: " + jumPeluru);
            }
        }
        System.out.println(" ");
    }

    public String menusuk(){
        if (weapon.isMenusuk()){
            return "Jleb!";
        }
        else{
            return "Gagal, belum pasang bayonet";
        }
    }

    public void pasangBayonet(){
        weapon.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}