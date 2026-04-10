package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Longest_Prefix {

    public String longestCommonPrefix(String[]str){
        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length-1];

         //int u = Math.min(first.length() , last.length() ) ;   ye bhi ho sakta hai

            //  ( i < first.length() && i < last.length() ) ye bhi ho sakta hai

        int i =0;

        for ( i = 0; i < Math.min(first.length() , last.length()) ; i++) {
                        if(first.charAt(i)!=last.charAt(i)){
                            break;
                        }
        }
        return first.substring(0,i);
    }

    static void main(String[] args) {

    }
}
