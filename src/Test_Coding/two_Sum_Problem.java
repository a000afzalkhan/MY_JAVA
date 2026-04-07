package Test_Coding;

import java.util.Arrays;

public class two_Sum_Problem {
    static void main(String[] args) {
        int []p = {1,2,3,4,5};
        int target = 7;

        int []re = twoSum(p,target);
        System.out.println(Arrays.toString(re));

    }

    static int[] twoSum(int[] number, int target) {

                                                // i=0 , i=1 , i=2 , i=3 , i=4
        // int first =number[0];               // { 1 ,  2 ,    3 ,  4 ,   5 }

        for (int i = 0; i < number.length ; i++) {
              for(int j = i+1; j < number.length ; j++) {
                if(number[i] + number[j] ==target){
                        return new int[]{i,j};
                  }
            }
        }
        return new int[]{};
    }
}