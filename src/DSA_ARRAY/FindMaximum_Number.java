package DSA_ARRAY;

public class FindMaximum_Number {
    static void main(String[] args) {

        int []arr = { 1,2,3,4,5,77 };
        int big = 0 ;

        for (int i = 0; i <arr.length ; i++) {
            if(big<arr[i]){
                big=+arr[i];
            }
        }
        System.out.println(big);
    }
}
