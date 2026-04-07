package DSA_ARRAY;

public class Array_4 {
    static void main(String[] args) {

        int [] reverseArray = {1,2,3,4,5};

        int start =0;
        int end = reverseArray.length-1;

        while(start < end){                 //swap through Index wise

            int temp = reverseArray[end];
            reverseArray[end]=reverseArray[start];
            reverseArray[start]=temp;

            start++;
            end--;

        }
        for(int s : reverseArray){
            System.out.print(s + " ");
        }

    }
}
