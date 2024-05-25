
public class Helicopter extends Airplane{
    private double maxLoad;

    public Helicopter(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Helicopter(){}
    public void takeOff(){
        System.out.println(toString() + "Akan Terbang");
    }

    public void land(){
        System.out.println(toString() + "Mendarat");
    }

    public void fly(){
        System.out.println(toString() + "Terbang");
    }

    @Override
    public double calcFuelEfficiency(){
        return 0;
    }
    
    @Override
    public double calcTripDistance(){
        return 0;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " hanya memerlukan landasan kecil";
    }
}
