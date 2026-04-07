package Java_Basic;

public class addTwoNumber {
    static void main(String[] args) {

        int x = 100 + 201;   //Sum = 301   <=>  Reversed = 103
        //int y = 778;

        System.out.println("Original = " + x);

        int rev =0 ;

        while(x != 0){        // 301 != 0  true
            int d = x % 10;    // 301 % 10 = 1 Remainder   =>>>( d = 1 )
            rev = rev*10+d;   //0*10+1 = 1
            x=x/10;           // 301 / 10  = 30.1  => 30
        }
        System.out.println("reversed "+ rev);


//        String h = String.valueOf(x);   // Convert in Int to String
//
//        StringBuilder s = new StringBuilder();
//        s.append(x);
//        System.out.println(s);
//        s.reverse();
//        System.out.println("Reverse =>"+s);   // But Reverse in String form

        //s.reverse();


       // System.out.println("Reversed = " + s);


    }
}
