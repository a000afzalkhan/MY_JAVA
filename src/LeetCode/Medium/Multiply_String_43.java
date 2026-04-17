package LeetCode.Medium;

import java.math.BigInteger;

public class Multiply_String_43 {
    static void main(String[] args) {

        String x = "5";
        String u = "3";

        BigInteger b = new BigInteger(x);
        BigInteger c = new BigInteger(u);

        System.out.println(b.multiply(c));
    }

}
/*

 public String multiply(String num1, String num2) {
         int[] res = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int sum = mul + res[i + j + 1];

                res[i + j + 1] = sum % 10;   // digit
                res[i + j] += sum / 10;      // carry
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int num : res) {
            if (!(ans.length() == 0 && num == 0)) {
                ans.append(num);
            }
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
 */

/*

public String multiply(String num1, String num2) {
       BigInteger n1=new BigInteger(num1);
       BigInteger n2=new BigInteger(num2);
       return n1.multiply(n2).toString();
    }
 */
