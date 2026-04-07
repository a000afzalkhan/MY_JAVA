package Basic_Understand;

public class Sum_of_number {
    static void main(String[] args) {
        int number = 123;
        int sum = 0 ;
        int digit = 0 ;


        while(number > 0){

            digit = number % 10 ;
            sum = sum + digit;
            number = number / 10;


        }
        System.out.println(sum);
    }
}
