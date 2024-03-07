public class Main{
    public static void main(String[] args) {
        Titik t1, t2, t3, t4, refleksit1, refleksit2;
        int counterTitik;
        Garis g1,g2;

        t1 = new Titik(0, 0);
        t2 = new Titik(2, 2);
        t3 = new Titik(2, 0);
        t4 = new Titik(0,2);

        counterTitik = Titik.getCounterTitik();
        // t1.setAbsis(2);

        System.out.printf("Jumlah objek titik: %d\n", counterTitik);
        System.out.printf("Titik t1 dengan absis: %.2f ordinat: %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("Titik t2 dengan absis: %.2f ordinat: %.2f\n", t2.getAbsis(), t2.getOrdinat());
        refleksit1 = t1.getRefleksiX();
        System.out.printf("Titik t1 dengan ordinat: %.2f\n", refleksit1.getOrdinat());
        refleksit2 = t2.getRefleksiY();
        System.out.printf("Titik t2 dengan absis: %.2f\n", refleksit2.getAbsis());


        g1 = new Garis(t1,t2);
        g2 = new Garis(t3,t4);
        System.out.println(g1.isTegakLurus(g2));
    }
}
