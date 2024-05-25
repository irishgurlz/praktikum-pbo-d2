
public class Superman extends Kryptonian{
    private String name;
    public Superman(String name){
        this.name = name;
    }
    public void takeOff(){
        System.out.println(toString() + "Akan Terbang");
    }
    public void land(){
        System.out.println(toString() + "Mendarat");
    }
    public void fly(){
        System.out.println(toString() + "Terbang");
    }

    public void leapBuilding(){
        System.out.println(toString() + "Melompat Gedung");
    }

    public void stopBullet(){
        System.out.println(toString() + "Menghentikan Peluru");
    }

    public void eat(){
        System.out.println(toString() + "Makan");
    }
}
