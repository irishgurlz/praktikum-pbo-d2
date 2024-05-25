
public class SeaPlane extends Airplane {
    private double maxLoad;
    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }
    public SeaPlane(){ }
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
    public String toString() {
        return this.getClass().getSimpleName()+ " dapat take off dan mendarat di perairan laut";
    }
    
    @Override
    public double calcTripDistance(){
        return 0;
    }   
}
