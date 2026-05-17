package Recursion;

public class Recur_1 {
    public static void print(int n) {

        if(n==0)return;
        System.out.println("Hello");
        print(n - 1);


    }
    static void main(String[] args) {

        print(5);
    }
}
