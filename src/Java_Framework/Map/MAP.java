package Java_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class MAP {
    static void main(String[] args) {
        Map<Integer,Integer>map = new HashMap<>();

        map.put(0,4);
        map.put(1,5);
        map.put(2,1);
        map.put(3,2);

        for(Map.Entry<Integer,Integer>kop : map.entrySet()){
            System.out.println(kop.getKey() + " -> " + kop.getValue());
        }

    }
}
