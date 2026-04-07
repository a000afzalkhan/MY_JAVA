package CodingGame;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Palindrome {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Word / Sentence");
        String p = s.nextLine() ;
        String [] separate =p.split("p");  // Words or sentence separated by space

        System.out.println(Arrays.toString(separate));

    }
}

/*
import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] words = input.split(" ");
        int count = 0;

        for (String word : words) {
            String lower = word.toLowerCase();
            String reversed = new StringBuilder(lower).reverse().toString();

            if (lower.equals(reversed)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
 */



/*
import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String[] words = s.split(" ");
        int count = 0;

        for (String w : words) {
            w = w.toLowerCase(); // case ignore

            String rev = "";
            for (int i = w.length() - 1; i >= 0; i--) {
                rev = rev + w.charAt(i);
            }

            if (w.equals(rev)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
 */
