import java.util.HashMap;
import java.util.Map;

public class MahasiswaMap {
    public static void main(String[] args) {
        Map<String, String> MapMahasiswa = new HashMap<>();
        MapMahasiswa.put("24060122120036", "Aniqah Nursabrina");
        MapMahasiswa.put("24060122140124", "Rona Realita Najma");
        MapMahasiswa.put("24060122140142", "Farid Rahman Fadhilah");
        MapMahasiswa.put("24060122130072", "Qun Alfadrian");
        MapMahasiswa.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
