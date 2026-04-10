package Basic_Understand;

import java.util.Collections;
import java.util.Arrays;

public class timepass {
    static void main(String[] args) {

        String []t = {"A","Z","E","Q","U","M"};
        String []e = {"Afzal ","Zohra ","Ehsan ","Qumsum ","Uzair ","Maryam "};

        String []s = {"flower", "flight","flow"};
        int []p = {1,5,4,7,44,8,6,2};

//        Arrays.sort(t);
        Arrays.sort(e,Collections.reverseOrder());
//        Arrays.sort(s);
//        Arrays.sort(p);

        //Alphabet
//        for(String o :t){
//            System.out.print(o);
//        }

        //Name
        for(String o :e){
            System.out.print(o);
        }

        //Number
//        for(int i : p){
//            System.out.print(i);
//        }

//        int left = 0;
//        char right =0;
//        int max = 0;
//        while (right < s.length()){               // 0 < 5  [ A F Z A L ]
//            char ch = s.charAt();
//        }
    }
}
