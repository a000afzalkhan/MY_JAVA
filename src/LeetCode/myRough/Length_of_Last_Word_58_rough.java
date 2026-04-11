package LeetCode.myRough;

public class Length_of_Last_Word_58_rough {
    static void main(String[] args) {
        String word = "Hello World       ";

        int count = 0;

        for (int i = word.length()-1; i >=0 ; i--) {

                // End mein Space
            if(word.charAt(i)==' '&& count==0){
                continue;
            }

            if(word.charAt(i)!=' '){
                count ++;
            }else {
                break;
            }
        }
        System.out.println(count);

    }
}
/*
 int x = 12345;
        String s = Integer.toString(x);
        System.out.println(s.length());

        for (int i = 0; i < x; i++) {
            System.out.println(i);
        }

        System.out.println(word.length());
 */
