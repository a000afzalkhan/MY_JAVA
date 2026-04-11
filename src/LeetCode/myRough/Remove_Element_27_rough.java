package LeetCode.myRough;

public class Remove_Element_27_rough {
    static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 3, 4, 3, 5};
        int tar = 3;

        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != tar) {
                nums1[count]=nums1[i];
                count++;
            }
        }



    }
}
