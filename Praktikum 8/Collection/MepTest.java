import java.util.*;

public class MepTest {
    public static void main (String[] args){
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1, "satu");
        map.put(2, "dua");
        System.out.println(map.get(2));
        
//        map.remove(1);
        Set<Integer> keys = map.keySet();
        
        for (Integer key: keys){
            System.out.println(key + ":" +map.get(key));
        }
    }
}
