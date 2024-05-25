
public class Bird extends Animal implements IFlyer{
    public void takeOff(){
        System.out.println(toString() + "Akan Terbang");
    }
    public void land(){
        System.out.println(toString() + "Mendarat");
    }
    public void fly(){
        System.out.println(toString() + "Terbang");
    }
    
    public void buildNest(){
        System.out.println(toString() + "Membuat sarang");
    }
    public void layEggs(){
        System.out.println(toString() + "Menaruh telur");
    }
    public void eat(){
        System.out.println(toString() + "Makan");
    }
}
