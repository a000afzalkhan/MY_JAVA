package LeetCode;

import java.util.Arrays;

public class Minimize_max_1877 {
    public static int minMaxPair(int [] nums){              // { 1,2,3,4,5 }
        Arrays.sort(nums);

        int left =0;
        int right = nums.length-1;
        int max = 0;

        while(left<right){
            int sum =nums[left] + nums[right];
            max = Math.max(max ,sum);
            left ++;
            right --;
        }
        return max;

    }

    static void main(String[] args) {

    }
}
