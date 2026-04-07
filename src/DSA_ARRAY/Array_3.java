package DSA_ARRAY;

public class Array_3 {
    static void main(String[] args) {

        int []arr = { 1,5};

//        for (int y : arr){
//            System.out.print( y);
//        }
//        System.out.println(" ");

        int temp=0;

        temp=arr[0];
        arr[0]=arr[arr.length-1];       // arr.length-1  means 2 => 2 - 1 = 1  ( 1 index se 5)
        arr[arr.length-1]=temp;

        for(int o : arr){
            System.out.print(o);
        }


    }
}
