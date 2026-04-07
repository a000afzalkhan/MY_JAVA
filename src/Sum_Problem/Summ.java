package Sum_Problem;

import java.util.Scanner;

public class Summ {

    static  int sum_all(int n){
        int sum = 0 ;

        for (int i = 0; i <=n ; i++) {

             sum=sum + i;

        }return sum;

    }
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int x = user.nextInt();

      //  int sum = 0;
        System.out.println("Sum of all number between = " + sum_all(x));
    }
}
