package CodingGame;

import java.util.Scanner;

public class upperCase_letterOut {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter your name = ");
//        String s =input.nextLine();
//        System.out.println("Your name = " + s);
        String words = input.nextLine();

        StringBuilder b = new StringBuilder();

        for (int i = 0; i <words.length() ; i++) {
            char c = words.charAt(i);

            if(Character.isUpperCase(c)){
                b.append(c);
            }
        }
        System.out.println(b);
    }
}
