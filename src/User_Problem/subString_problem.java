package User_Problem;

public class subString_problem {
    static void main(String[] args) {
        String x = "Hello world";  //   1 2 3 4 5  6 7 8 9 10
                                   //   H e l l o  w o r l d

        int a = 4;   //l
        int b = 8;   //r


        String R = x.substring(a,b+1);   // b < target

        System.out.println(R);

        String result = "";

        for (int i = a; i <=b; i++) {
            result += x.charAt(i);
        }
        System.out.println(result);


//        for (int i = 0; i <x.length() ; i++) {
//            System.out.println(x.charAt(i));
//        }
    }
}


/*
Sample Input

Helloworld
3 7
Sample Output

lowo
in java
 */