package CodingGame;

import java.util.Scanner;

public class Number_Problem {
    static void main(String[] args) {    // *5 print Foo , *7 print Bar , *both print FooBar

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <=n ; i++) {
            if(i%5==0 && i%7==0){
                System.out.println("FooBar");
            } else if (i%5==0) {
                System.out.println("Foo");
            }else if (i%7==0){
                System.out.println("Bar");
            }else{
                System.out.println(i);
            }

        }

    }
}
