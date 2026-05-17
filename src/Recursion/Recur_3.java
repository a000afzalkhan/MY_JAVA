package Recursion;

public class Recur_3 {

    static int factorial(int x){
        if(x==0 || x==1)return 1;

       return x * factorial(x-1);
    }



    static void main(String[] args) {
        System.out.println("factorial of = ");
        factorial(5);
    }
}
