

public class Truck extends Vehicle{
    private double maxLoad;

    public Truck(double maxload){
        this.maxLoad = maxload;
    }

    public Truck(){}
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
        return this.getClass().getSimpleName()+ " adalah angkutan darat yang sangat handal";
    }
}
