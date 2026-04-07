package DSA_ARRAY;

public class Array_1 {
   public  static void main(String[] args) {

       int[]arr={1,2,3,4,5,6,7,8,9,10};

       int sum = 0;

//       for(int p : arr){                //Sum of Array
//
//           sum = sum + p;
//
//       }

       for (int i = 1; i <=arr.length ; i++) {
           sum =sum + i;

       }
       System.out.println(sum);

    }
}

