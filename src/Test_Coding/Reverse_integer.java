package Test_Coding;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_integer {
    static void main(String[] args) {
        int [] arr = {1,2,3,4};   // Length = 9

        int temp ;

        //Arrays.sort(arr);

        //Collections.reverse(); // Required List Functions int => Integer

        for (int i = 0; i < arr.length  /2 ; i++) {

                     temp = arr[i];          //temp = arr[i] => ( temp = 1 )
                    arr[i]=arr[arr.length-1 -i];     //arr[i] = arr[arr.length]; => ( arr[i] =9 )
                    arr[arr.length-1-i]= temp;        // index 8 {9}  = 1

        }
        for(int p : arr){
            System.out.print(p + " ");
        }
    }
}
/*
class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev=rev*10+x%10;
            x/=10;
        }
        return rev;
    }
}
 */
