package LeetCode;

public class Find_the_Difference_389 {
    static void main(String[] args) {
//        String a = "abcd";
//        String b = "abcde";
//
//        int e=a.length();
//        int f=b.length();
//
//        int p = Math.max(e,f);
//
//        int last = p-1;                     //store longest string but i want index so ( p - 1 )
//
//        if (e > f) {
//            System.out.println(a.charAt(last));
//        } else {
//            System.out.println(b.charAt(last));
//        }

        System.out.println(lastCharacter("abcd","abcde"));

    }
    public static char lastCharacter(String s , String t){

        int e=s.length();
        int f=t.length();

        int len = Math.max(e,f);

       // int last = p-1;                     //store longest string but i want index so ( p - 1 )

        char show =0;

        for (int i = 0; i < len; i++) {
            if(i < e){
                show ^=s.charAt(i);
            }if(i < f) {
                show ^=t.charAt(i);
            }
        }
        return show;
    }

}
/*
class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return (char) result;
    }
}
 */










/*
                                // XOR USE

            1 => Matlab same cheez ko 0 unique cheez ko 1
            2 => same cheez ko haatana unique cheez ko store Karna


class Solution {
    public char findTheDifference(String s, String t) {

        int a = s.length();
        int b = t.length();

        int len = Math.max(a, b);

        char show = 0;

        // ADD THIS LOOP
        for (int i = 0; i < len; i++) {
            if (i < a) {
                show ^= s.charAt(i);
            }
            if (i < b) {
                show ^= t.charAt(i);
            }
        }

        return show;
    }
}
 */
