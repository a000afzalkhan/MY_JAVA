package LeetCode;

public class Find_the_Integer_Added_to_Array_3131 {
    static void main(String[] args) {

    }
    public static  int addedDifference(int[]nums1, int[]nums2){

        //Min in nums 1
        int min = nums1[0];
        for(int n1 : nums1){
            if(min>n1){
                min =n1;
            }
        }

        //Min in nums 2
        int min2 =nums2[0];

        for(int n2 : nums2){
            if(n2<min2){
                min2 = n2;
            }
        }

        return min2 - min;
    }
}
/*

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1=Integer.MAX_VALUE;

        int min2 = Integer.MAX_VALUE;

        for(int i:nums1){
            if(min1 > i){
                min1=i;
            }
        }

        for(int i:nums2){
            if(min2 > i){
                min2=i;
            }
        }

        return min2-min1;
    }
}
 */