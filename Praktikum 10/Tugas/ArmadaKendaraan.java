import java.util.ArrayList;
import java.util.List;
public class ArmadaKendaraan {
    List<Vehicle> armada = new ArrayList<>();
    public void tambahArmada(List<? extends Vehicle> armadaKendaraan) {
        armada.addAll(armadaKendaraan);
    }
    public List<Vehicle> getAllArmada(){
        return armada;
    }
}
