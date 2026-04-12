package LeetCode;

public class Add_digit_258 {
    static void main(String[] args) {

    }
//    public static int addDigit (int nums){
//
//        // 38
//                while(nums>=10){
//                    int sum = nums % 10 ;   // 8
//                }
//    }
}
/*
                             //Most Optimized Solution


public int addDigits(int num) {
    if (num == 0) return 0;
    return 1 + (num - 1) % 9;
}

 */

/*
class Solution {
    public int addDigits(int num) {

        if (num == 0) return 0;     SPECIAL CASE

        if (num % 9 == 0) {
            return 9;               // 27 => 2+7=9  => [ 27/9=3 remainder =0 THATS WHY RETURN 9 ]
                                    // 18 => 1+8=9 => [ 18/9=2 remainder =0 THATS WHY RETURN 9 ]
        } else {
            return num % 9;
        }
    }
}
 */
