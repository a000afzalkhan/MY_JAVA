package Sum_Problem;

import java.util.Scanner;

public class Even_Sum {

    static int evensum(int e){
        int sum_even = 0 ;

        for (int i = 0; i <=e ; i++) {
            if(i % 2 == 0){
                sum_even = sum_even + i;
            }

        }return sum_even;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number = ");
        int x  = scanner.nextInt();

        System.out.println("Even number sum is = "  + evensum(x) );
    }
}
