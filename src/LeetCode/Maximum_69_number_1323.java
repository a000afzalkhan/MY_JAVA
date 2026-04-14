package LeetCode;

import java.util.Arrays;

public class Maximum_69_number_1323 {
    static void main(String[] args) {

        /*
          public static void main(String[] args) {
        Maximum_69_number_1323 x = new Maximum_69_number_1323();
        System.out.println(x);
    }

    @Override
    public String toString() {
        return "Custom readable output 👀";

        */


        Maximum_69_number_1323 x = new Maximum_69_number_1323();
        System.out.println(x.maximum69Number(9669));

    }
    public int maximum69Number (int num) {

        int temp = num; //original number ko touch nahi karna 👉 isliye copy bana li

        int base = 1; //👉 ye batata hai kaunsa place hai
                      // 1 → units
                      // 10 → tens
                      // 100 → hundreds

        int pos = -1;   //👉 yahan store karenge 6 kaha mila

        while(temp>0){  //👉 jab tak number khatam nahi hota   [ example=> 9669 > 0 ]

            if(temp%10==6){ //👉 “mil gaya 6!”

                pos=base;  //👉 uska place store kar liya
            }
            temp/=10; //👉 next digit pe jao

            base*=10; //👉 place bhi update karo
            
        }
        return pos==-1?num:num+(3*pos);  //👉 kyun 3? 6 → 9 difference = 3

    }

}

/*

right se check karo 👀
6 mile → yaad rakho 🧠
last wala = leftmost 6 😎
usme +3 add karo 💥
 */


/*

                                * OTHER WAY *

class Solution {
    public int maximum69Number (int num) {
        char[] digits = String.valueOf(num).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(digits));
    }
}
 */
