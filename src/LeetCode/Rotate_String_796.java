package LeetCode;

public class Rotate_String_796 {
    static void main(String[] args) {

    }

    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        
        String temp = s;                        //Copy of original
        for (int i = 0; i <s.length(); i++) {
            temp= temp.substring(1)+temp.charAt(i);
                                        /*
                                        example = > "abcde"

                                       temp.substring() 👉 index 1 se end tak "abcde" index 1 se end tk "bcde"

                                       temp.charAt(i) 👉 first character 'a' ya first index

                                       add both => "bcde + a" = "bcdea"


                                        */

            if(temp.equals(goal))return true;
            /*

            temp.equals(goal)) return true => 👉 Check karta hai:
                                            kya current rotated string = goal?
                                            ✔ Agar haan → true return
                                            ❌ Nahi → next rotation try karo

            */
        }
        return false;
    }

}
