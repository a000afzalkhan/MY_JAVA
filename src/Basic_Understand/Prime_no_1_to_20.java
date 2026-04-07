package Basic_Understand;

public class Prime_no_1_to_20 {
    static void main(String[] args) {          // number divide by 1 and itself only

        for (int i = 2; i <=20 ; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if( i % j == 0 ){
                    isPrime=false;

                }
                break;


            }
            if(isPrime){
                System.out.print (  i + " ");
            }
//            System.out.print(" ");
//            if(!isPrime){
//                System.out.print( i + " "  );
//            }

        }
    }
}


//
//import java.util.*;
//
//public class Basic_Understand.Prime_no_1_to_20 {
//    static void main(String[] args) {          // number divide by 1 and itself only
//
//        ArrayList<Integer> prime = new ArrayList<>();
//        ArrayList<Integer> nonPrime = new ArrayList<>();
//
//        for (int i = 2; i <=20 ; i++) {
//            boolean isPrime = true;
//
//            for (int j = 2; j < i; j++) {
//                if( i % j == 0 ){
//                    isPrime=false;
//                    break;
//                }
//            }
//            if(isPrime){
//                prime.add(i);     // store prime
//            }
//            if(!isPrime){
//                nonPrime.add(i);  // store non-prime
//            }
//        }
//
//        System.out.println("Prime numbers: " + prime);
//        System.out.println("Non-prime numbers: " + nonPrime);
//    }
//}
