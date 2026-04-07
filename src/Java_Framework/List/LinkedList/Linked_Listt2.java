package Java_Framework.List.LinkedList;
import java.util.LinkedList;
import java.util.Collections;

public class Linked_Listt2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List: " + list);

        // Reverse using Collections
        Collections.reverse(list);


        System.out.println("Reversed List: " + list);
    }
}