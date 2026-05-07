package LeetCode.Medium;

public class StringToIntegerAtoi_8 {
    public int myAtoi(String s) {

        int i = 0;
        int sign=1;
        int len = s.length();

        while (i < len && s.charAt(i) == ' ') {             //Space  khatam kar raha hai
            i++;
        }

        if( i<len &&  (s.charAt(i)=='-' || s.charAt(i)=='+') ){             // (-)(+) Check kar raha hai
            if(s.charAt(i)== '-'){
                sign=-1;
            }
            i++;
        }


       int num = 0;

        while(i<len && Character.isDigit(s.charAt(i))){
            int d = s.charAt(i) - '0';


            num = num * 10 + d;

            if(num > (Integer.MAX_VALUE - d) / 10){
                if(sign == 1 ){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }

            i++;
        }
return  num * sign;
    }







    static void main(String[] args) {
        StringToIntegerAtoi_8 m = new StringToIntegerAtoi_8();
        char[] x ={'S','a','e'};

        String z = "  -041";

        System.out.println(m.myAtoi(z));

    }
}

/*

                                //Best all control overflow


    class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // Step 1: skip spaces
        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        // Step 2: sign
        int sign = 1;

        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){

            if(s.charAt(i) == '-'){
                sign = -1;
            }

            i++;
        }

        // Step 3: build number
        int num = 0;

        while(i < n && Character.isDigit(s.charAt(i))){

            int digit = s.charAt(i) - '0';

            // Step 4: overflow check
            if(num > (Integer.MAX_VALUE - digit) / 10){

                if(sign == 1){
                    return Integer.MAX_VALUE;
                }
                else{
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;

            i++;
        }

        return num * sign;
    }
}

 */

/*


                                                        // Not checking Overflow
public class StringToIntegerAtoi_8 {

    public static int myAtoi(String s) {

        // remove spaces
        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int sign = 1;
        long result = 0;
        int start = 0;

        // check sign
        if (s.charAt(0) == '-') {
            sign = -1;
            start = 1;
        }
        else if (s.charAt(0) == '+') {
            start = 1;
        }

        // using for loop
        for (int i = start; i < s.length(); i++) {

            // stop if character is not digit
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }

            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;
        }

        result = result * sign;

        return (int) result;
    }

    public static void main(String[] args) {

        String s = "   -041  ";

        int ans = myAtoi(s);

        System.out.println(ans);
    }
}

 */


/*
  // spaces remove
        s = s.trim();

        // empty string
        if (s.length() == 0)
            return 0;

        int sign = 1;
        int i = 0;
        long result = 0;

        // sign check
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (s.charAt(i) == '+') {
            i++;
        }

        // digits process
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            result = result * 10 + digit;

            // overflow check
            if (sign * result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (sign * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * result);
 */