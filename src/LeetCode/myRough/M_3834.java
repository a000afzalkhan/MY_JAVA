package LeetCode.myRough;

import java.util.ArrayList;
import java.util.List;

public class M_3834 {

    public List<Long> mergeAdjacent(int[] nums){

        // [ 3,1,1,2]

        List<Long> l = new ArrayList<>();

        for(int i : nums){
            long val = i;

            while (!l.isEmpty() && l.get(l.size()-1)==val){

                    long last = l.get(l.size()-1);  // 1
                l.remove(l.size()-1);
                val = val + last;


            }
            l.add(val);
        }
        return l;
    }


        static void main(String[] args) {
        M_3834 m = new M_3834();
        int [] mo = {3,1,1,2};

            System.out.println(m.mergeAdjacent(mo));
    }
}
