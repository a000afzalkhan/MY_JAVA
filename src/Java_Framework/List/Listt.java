package Java_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Listt {
    static void main(String[] args) {

        List<Integer> lis = new ArrayList<>();
        lis.add(5);
        lis.add(6);
        lis.add(7);
        lis.add(8);
        lis.add(9);

        System.out.println(lis);

        lis.removeFirst();
        System.out.println("After Remove = " + lis);

    }
}
