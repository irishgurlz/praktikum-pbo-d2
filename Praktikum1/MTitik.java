public class MTitik {
    public static void main(String[] args) {
        Titik t1, t2;
        int counterTitik;

        t1 = new Titik(1, 2);
        t2 = new Titik(3, 4);
        counterTitik = Titik.getCounterTitik();
        t1.setAbsis(2);

        System.out.printf("Jumlah objek titik: %d\n", counterTitik);
        System.out.printf("Titik t1 dengan absis: %.2f ordinat: %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan ordinat: %.2f\n", t2.getOrdinat());
    }
}