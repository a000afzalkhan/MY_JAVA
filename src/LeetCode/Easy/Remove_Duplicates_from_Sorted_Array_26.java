package LeetCode.Easy;

public class Remove_Duplicates_from_Sorted_Array_26 {
    static void main(String[] args) {

        int []x = {1,1,2,2,3,3,4,4,5,6,6};
        int r = removeDuplicate(x);

        System.out.println(r);

    }
    static  int removeDuplicate(int[]num){

        int firstElement =0;


        for (int i = 1; i <num.length ; i++) {
                if(num[firstElement] != num[i]){
                    firstElement++;
                    num[firstElement]=num[i];
                }
        }

            return firstElement + 1;
    }
}
