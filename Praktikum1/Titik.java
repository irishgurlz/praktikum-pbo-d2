public class Titik {
    float absis, ordinat;
    static int counterTitik;

    Titik(float absisIn, float ordinatIn) {
        absis = absisIn;
        ordinat = ordinatIn;
        counterTitik += 1;
    }

    public void setAbsis(float absisIn) {
        absis = absisIn;
    }

    public void setOrdinat(float ordinatIn) {
        ordinat = ordinatIn;
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