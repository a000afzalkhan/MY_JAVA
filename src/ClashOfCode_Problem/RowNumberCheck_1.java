package ClashOfCode_Problem;

import java.util.Scanner;

public class RowNumberCheck_1 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number => ");

        int user = s.nextInt();
        int row  = (user*(user + 1)/2)/user;
        System.out.println("Row => " + row);


//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter the Number => ");
//        Long user = s.nextLong();
//
//        Long Ans = (long)Math.ceil((-1 + Math.sqrt(1 + 8 * user ))/2);
//
//        System.out.println("Your Row Number = " + Ans);

        //         long r = (long)Math.ceil((-1 + Math.sqrt(1 + 8.0 * b)) / 2);



/*

import java.io.*;
class Solution{public static void main(String[]a)throws Exception{System.out.print((long)Math.ceil((-1+Math.sqrt(1+8.0*Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine())))/2));}}

 */

    }
}

/*

📌 Problem kya keh raha hai?

Numbers ko rows mein arrange kiya gaya hai:

Row 1 → [1]
Row 2 → [2][3]
Row 3 → [4][5][6]
Row 4 → [7][8][9][10]
...

👉 Har row mein utne hi numbers hote hain jitna uska row number

Row 1 → 1 number
Row 2 → 2 numbers
Row 3 → 3 numbers
Row 4 → 4 numbers
🎯 Tumhe kya karna hai?

Input mein ek number b diya hoga (block number)

👉 Tumhe batana hai ki wo kaunsi row mein aata hai

🧠 Example samjho
Example 1:
Input: 5

Rows:

Row 1 → 1
Row 2 → 2 3
Row 3 → 4 5 6

👉 5 kis row mein hai?
➡️ Row 3

Output: 3
 */
