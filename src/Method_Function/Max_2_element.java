package Method_Function;

import java.util.Scanner;

public class Max_2_element {
    static int []Max_2_Element(int[]arr){
        int max , secondMax;

        if(arr[0]>arr[1]){
            max=arr[0];
            secondMax= arr[1];
        }else{
            max=arr[1];
            secondMax=arr[0];

        }

        for (int i = 2; i <arr.length ; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else{
                if(arr[i]>secondMax && arr[i]!=max){
                    secondMax =arr[i];                      //Second max update
                }
            }
        }
        return new int[] {max,secondMax};

    }


    static void main(String[] args) {

        Scanner user = new Scanner(System.in);
       System.out.println("Enter the number of Array = ");
        int s = user.nextInt();

        int []arr = new int[s];

        System.out.println("Enter the number = ");

        for (int i = 0; i < s; i++) {
            arr[i]=user.nextInt();
        }

        int []result = Max_2_Element(arr);



        System.out.println("Second Max Element = " + result[1]);
        System.out.println("Max Element = " + result[0]);
    }
}
