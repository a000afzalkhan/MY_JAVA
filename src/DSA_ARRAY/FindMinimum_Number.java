package DSA_ARRAY;

public class FindMinimum_Number {
    static void main(String[] args) {

        int []arr = {1,2,3,4,5,-1};
        int min = arr[0];

        for (int i = 0; i < args.length;i++) {
            if(min<arr[i]){
                min=+arr[i];
            }

        }
        System.out.println(min);    }
}
