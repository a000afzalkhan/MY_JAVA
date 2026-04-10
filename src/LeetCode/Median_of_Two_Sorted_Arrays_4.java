package LeetCode;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays_4 {
    static void main(String[] args) {

    }
    static Double findMedianSortedArrays(int[]nums1,int[]nums2){
        Double median =0.0;

        int[] nums3 = new int[nums1.length + nums2.length];


        //nums1
        for (int i = 0; i <nums1.length ; i++) {
            nums3[i]=nums1[i];
        }

        //nums2
        for (int i = 0; i < nums2.length; i++) {
            nums3[nums1.length + i] = nums2[i];
        }

        Arrays.sort(nums3);

       int nums3Length = nums3.length;

       if(nums3Length%2==0){
           median = (nums3[nums3Length/2-1] + nums3[nums3Length/2]) / 2.0;
       }else{
           median = nums3.length/2.0;
       }

        return median;
    }
}


/*

package LeetCode.myRough;

import java.util.Arrays;

public class Rough_1_Add_array {
    static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        int[] nums3 = new int[nums1.length + nums2.length];

        //nums1
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        //nums2
        for (int i = 0; i < nums2.length; i++) {
            nums3[nums1.length + i] = nums2[i];
        }

        Arrays.sort(nums3);

        double median;


        int lenNums3 =nums3.length;

        if(lenNums3 % 2 ==0){
            median=(nums3[lenNums3/2 - 1] + nums3[lenNums3/2]) / 2.0;
        }else {
            median = nums3[lenNums3/2];

        }
        System.out.println(median);
    }
}

 */
