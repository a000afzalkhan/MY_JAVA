package LeetCode.Easy;

public class Remove_Element_27 {
    static void main(String[] args) {

        int []str={1,2,3,3,4,3,5};
        int tar = 3;

        int result = removeElement(str,tar);
        System.out.println(result);


        for (int i = 0; i <result ; i++) {
            System.out.print(str[i]+" ");
        }

    }
    public static int removeElement(int[]nums ,int tar){

        int count=0;

        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=tar){

                nums[count]=nums[i];

                count++;
            }
        }
        return count;
    }
}

/*

public static int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;

    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];                                                      // UNDERSTAND ONE MORE TIME
            n--;
        } else {
            i++;
        }
    }
    return n;
}
 */

