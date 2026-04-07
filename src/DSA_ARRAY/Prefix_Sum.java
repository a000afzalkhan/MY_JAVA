package DSA_ARRAY;

public class Prefix_Sum {
    static void main(String[] args) {

        int []arr ={ 2,4,6,8};

        int n = arr.length;

        int[]prefix  = new int[n];

        prefix[0]=arr[0];

        for(int i = 1; i <n; i++) {

            prefix[i]=prefix[i-1]+ arr[i];
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(prefix[i]+" ");
        }

    }
}
