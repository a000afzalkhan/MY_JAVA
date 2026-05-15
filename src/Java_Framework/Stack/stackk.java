package Java_Framework.Stack;

import java.util.Stack;

public class stackk {
    static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.add(5);
        stack.add(4);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }
}
