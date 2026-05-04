package LeetCode.Easy;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number_202 {
    static void main(String[] args) {

    }
    public boolean isHappy(int n){

        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            if (seen.contains(n)) {
                return false; // loop me fas gaya
            }

            seen.add(n);
            n = getSquareSum(n);
        }

        return true; // 1 aa gaya
    }

    public static int getSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;   // last digit
            sum += digit * digit; // square add
            n = n / 10;          // next digit
        }

        return sum;
    }
}


/*

  public boolean isHappy(int n) {
            while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
 */

/*

public class HappyNumberFastSlow {

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getSquareSum(slow);              // 1 step
            fast = getSquareSum(getSquareSum(fast)); // 2 step
        } while (slow != fast);

        return fast == 1;
    }

    public static int getSquareSum(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19)); // true
    }
}
 */