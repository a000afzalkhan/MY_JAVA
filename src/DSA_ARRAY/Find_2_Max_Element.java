package DSA_ARRAY;

public class Find_2_Max_Element {
    static void main(String[] args) {

        int []arr = {10,5,20,8,15};

        int max,secondMax;

                                            //Condition statement
        if(arr[1]>arr[0]){
            max = arr[1];
            secondMax =arr[0];
        }else{
            max = arr[0];
            secondMax =arr[1];
        }


        for (int i = 2; i < arr.length ; i++) {
            if(max < arr[i]){
                secondMax = max;                                            //Update second max
                max =arr[i];

            }

            else {
                if(arr[i]>secondMax && arr[i]!=max){
                    secondMax = arr[i];
                }
            }


        }
        System.out.println("Second large element = " + secondMax);


























//       int max , secondMax;
//
//       if(arr[0] > arr[1]){
//           max = arr[0];
//           secondMax = arr[1];
//       }else  {
//           max = arr[1];
//           secondMax = arr[0];
//       }
//
//
//        for (int i = 2; i <arr.length ; i++) {
//            if(max < arr[i]){
//                secondMax =max;
//                max=arr[i];
//            }
//            else if (arr[i] > secondMax && arr[i]!=max) {
//                secondMax =arr[i];
//            }
//
//        }
//        System.out.println(secondMax);

    }
}
