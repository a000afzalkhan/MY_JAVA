package LeetCode;

public class Length_of_Last_Word_58 {
    static void main(String[] args) {

    }
    static  int lastLength (String words){
        int l =words.length();
        int countword=0;

        for (int i = l-1; i >=0 ; i--) {
            if(words.charAt(i)==' '&& countword==0){
                continue;
            }
            if(words.charAt(i)!=' '){
                countword++;
            }else {
                break;
            }
        }
        return countword;
    }
}
