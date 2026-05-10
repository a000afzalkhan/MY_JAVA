package Java_Framework.Map.Hash_Map;

import java.util.HashMap;
import java.util.Map;

public class first_Map {
    static void main(String[] args) {
        HashMap<String,Integer>lis = new HashMap<>();
            lis.put("Apple",50);
            lis.put("Banana",30);

//
//        System.out.println(lis.keySet());
//
//        System.out.println(lis);


        for(String u : lis.keySet()){
            System.out.println(u + " -> " + lis.get(u));
        }

     }
}

