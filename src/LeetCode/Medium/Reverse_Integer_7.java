package LeetCode.Medium;

public class Reverse_Integer_7 {
    static void main(String[] args) {

      int re =  reverse(123);
        System.out.println(re);


//        int x = 123;
//        String str = Integer.toString(x);
//
//        StringBuilder r = new StringBuilder(str);
//
//      for (int i = 0; i <x ; i++) {
//          r.append(str);
//      }
//
//        r.reverse();
//        int reversed = Integer.parseInt(str.toString());
//        System.out.println("Reverse in Integer  = "+reversed);
    }
    public static int reverse(int x) {

        String Rev = Integer.toString(x);

        StringBuilder r = new StringBuilder(Rev);
        r.reverse();


        int reversed=Integer.parseInt(r.toString());
        return reversed;

    }
}


