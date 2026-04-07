package Basic_Understand;

import java.util.Scanner;

public class BASIC_1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER YOUR AGE = ");
        int a = scanner.nextInt();
        if(a<10) {
            System.out.println("You now KID");

        }
        System.out.println("you are young");

        System.out.println(a);


    }
}
