package DSA_ARRAY;

import java.util.Scanner;

public class Array_2 {
    static void main(String[] args) {
        int sum = 0 ;

        Scanner usr = new Scanner(System.in);
        System.out.println("Kitne number bana na hai = ");

        int u = usr.nextInt();

        int []c = new int[u];

        System.out.println("Enter Number = ");
        for (int i = 0; i < u; i++) {
            c[i] = usr.nextInt();

        }

        System.out.println("Your Number = ");
        for(int s : c){
            sum = sum + s;
        }
        System.out.println("Sum of number" + sum);

    }
}
