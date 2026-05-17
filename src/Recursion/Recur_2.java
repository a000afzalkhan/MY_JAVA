package Recursion;

import java.util.Scanner;

public class Recur_2 {

    static int n;


    static void TargetNumPrint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        TargetNumPrint(n-1);
        //System.out.println(n);
    }


    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n=s.nextInt();

        TargetNumPrint(n);

//        Scanner s = new Scanner(System.in);
//        int user = s.nextInt();
      //  print(user,1);

        //int x =0;        System.out.println(x);



    }
}
//public static void print(int user,int start) {
//        if(start>user)return;
//        System.out.println(start);
//        print(user,start+1);
//    }
