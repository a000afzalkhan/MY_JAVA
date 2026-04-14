package LeetCode.Medium;

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
/*
import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;
        int maxSum = 0;

        while (left < right) {
            int sum = nums[left] + nums[right];

            // Math.max ki jagah if use kiya
            if (sum > maxSum) {
                maxSum = sum;
            }

            left++;
            right--;
        }

        return maxSum;
    }
}
 */