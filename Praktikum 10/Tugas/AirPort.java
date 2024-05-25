
public class AirPort{
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }

    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane){
            return ("Izin diterima");
        }
        else{
            return("Ditolak");
        }
    }
    

}
