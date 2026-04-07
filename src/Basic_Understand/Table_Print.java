package Basic_Understand;

import java.util.Scanner;

public class Table_Print {
    static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter number of table = ");
        int p = user.nextInt();
        System.out.println("Here is your given table =>");

        for (int i = 1; i <=10; i++) {
            System.out.println(p + "x" + i + "=" + p*i);
        }

//        int x = 2;
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(x +"x" + i + "=" + x*i);
//
//        }
//        int table = 2;
//        int multi = 0;
//        while(table <= 10){
//            int Table = table * 2 ;
//            multi =+ Table;
//            table ++;
//        }
//        System.out.println(multi);

    }
}
