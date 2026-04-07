package Java_Framework.List.LinkedList;

import java.util.LinkedList;

public class Linked_Listt {
    public static void main(String[] args) {

        // LinkedList create karna
        LinkedList<String> list = new LinkedList<>();

        // Elements add karna
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        // First aur last add karna
        list.addFirst("Orange");
        list.addLast("Grapes");

        // List print karna
        System.out.println("LinkedList: " + list);

        // Element access karna
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Element remove karna
        list.remove("Banana");

        System.out.println("After removing Banana: " + list);
    }
}