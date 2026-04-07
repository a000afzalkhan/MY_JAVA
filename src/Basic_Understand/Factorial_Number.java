package Basic_Understand;

public class Factorial_Number {
                // R E C U R S I O N  -  M E T H O D
    static int Factorial_Method(int f){
        if(f == 1){
            return 1;
        }return f * Factorial_Method(f-1);
    }





    static void main(String[] args) {
                                            // Factorial of 5 is 5x4x3x2x1 = 120
//        int factorial = 5;
//        int fac= 1 ;
//
//        for (int i = 1; i <= factorial ; i++) {
//
//          fac = fac * i;
//        }
//        System.out.println(fac);

        System.out.println(Factorial_Method(5));
    }
}



