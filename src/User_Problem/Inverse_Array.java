package User_Problem;

import java.util.Scanner;

public class Inverse_Array {
    static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of input = ");
       int p = s.nextInt();

        int []c = new int [p];

        int str = 0;
        int end =c.length-1;

        for (int i = 0; i <=c.length-1 ; i++) {
            c[i] = s.nextInt();
        }

        while (str < end){
            int temp = c[str];
            c[str]=c[end];
            c[end]= temp;
             str ++ ;
             end --;
        }

        for(int t : c){
            System.out.print(t + " ");
        }


    }
}
