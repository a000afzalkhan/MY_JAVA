package Basic_Understand;

import java.util.Scanner;

public class Odd_number {
    static boolean odd(int x){
        return x % 2 == 1;
    }
    static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your number ");

        int num = user.nextInt();



        System.out.println("Your Number is " + odd(num) + "  if True = Number is Odd / False = Number is Odd" );
    }
}
