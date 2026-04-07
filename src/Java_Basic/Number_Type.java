package Java_Basic;

public class Number_Type {
    static void main(String[] args) {


        int re = reverseNumber(-123);
        System.out.println(re);




//        int x =  Integer.MAX_VALUE ;  // 2^31 - 1 Max
//        int y = Integer.MIN_VALUE ;   // 2^31
//
//        System.out.println(y);

    }
    public static int reverseNumber(int x){
        boolean neg = x<0;

        String y = Integer.toString(Math.abs(x));
        StringBuilder b = new StringBuilder(y);
        b.reverse();

        try {
            int Reversed = Integer.parseInt(b.toString());
            return neg ? -Reversed : Reversed;
        }catch (NumberFormatException e){
            return 0;
        }

    }
}





/*
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check overflow
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
}
 */
