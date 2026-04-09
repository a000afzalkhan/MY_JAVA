package Test_Coding;

public class Sum_Array {
    static void main(String[] args) {

        int []p ={8,7,8,9,7,10};
        int r =sum(p);
        System.out.println(r);

    }

    public static  int sum (int [] x){
        int sumAll =0;
        for (int i = 0; i <x.length ; i++) {
            sumAll = sumAll + x[i];
        }
        return sumAll;
    }
}
