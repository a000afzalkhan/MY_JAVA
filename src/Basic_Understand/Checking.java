package Basic_Understand;

public class Checking {
    static void main(String[] args) {
        int x = 123;
        int output = 0;

        while (x>0){               //Condition


//            int last = x % 10; // 3 out
//            int middle = (x/10) %10; // 2 out
//            int first = x / 100; // 1 out
//
//            output = last *100 + middle * 10 + first;

       // System.out.println(output);

            int las = x % 10 ;
            output = output* 10 + las;
           // output = output + las;                    Sum of Number
            x = x / 10;

        }
        System.out.println(output);
    }
}
