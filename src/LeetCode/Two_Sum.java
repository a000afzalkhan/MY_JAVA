package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

        public static int[]twoSum (int[]nums , int target){
            Map<Integer,Integer>map = new HashMap<>();
            for (int i = 0; i <nums.length ; i++) {

                int complement = target - nums[i];
                if(map.containsKey(complement)){
                    return new int[]{map.get(complement),i};
                }
                map.put(nums[i],i);
            }
            return new int[]{};
        }

//    int []nums = {4,5,1,2};
//    int target = 6;







//    public static int[]twoSum  (int[] nums , int target){
//        for (int i = 0; i < nums.length ; i++) {
//            for (int j =i+1; j < nums.length ; j++) {
//                if(nums[i] + nums[j]==target){
//                    return new int []{i,j};
//                }
//            }
//        }
//                return new int []{};
//    }

    static void main(String[] args) {

        int []nums = {4,5,1,2};
        int target = 6;

        int []res = twoSum(nums,target);

        System.out.println(Arrays.toString(res));
//        int []p =twoSum(new int[] {1,2,3,4,5},7);

//        int []result = twoSum(new int []{1,2,3,4,5},9);
//
//       // System.out.println(result);
//        System.out.println("Index = " + Arrays.toString(result) + " Is sum of equal Target");







    }
}
