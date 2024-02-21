public class Titik {
    float absis, ordinat;
    static int counterTitik;

    Titik(float absis, float ordinat) {
        counterTitik ++;
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public void setAbsis(float absis) {
        this.absis = absis;
    }

    public void setOrdinat(float ordinat) {
        this.ordinat = ordinat;
    }

    public float getAbsis() {
        return absis;
    }

    public float getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        return counterTitik;
    }
}
