package Basic_Understand;

public class Reversing_number {
    static void main(String[] args) {
        int number = 123;

        int last_digit  ;

       // if (number >= 100 && number <= 999){

            int last = number % 10;        // 3
            int middle = (number /10) % 10; // 2
            int first = number / 100;       // 1

           // last_digit = last * 100 + middle * 10 + first;
           //  System.out.println("Reversed  = " + last_digit);

                  // Sum of all three number

        last_digit = last + middle + first ;
        System.out.println("Sum of all three number is = " + last_digit);

    }
}
