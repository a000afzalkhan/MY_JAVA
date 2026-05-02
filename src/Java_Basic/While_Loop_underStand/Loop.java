package Java_Basic.While_Loop_underStand;

public class Loop {
    static void main(String[] args) {

        int[] nums = {4, 5, 1, 2};
        int tar = 6;

        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == tar) {
                    System.out.println(i + ", " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("-1, -1");
        }
    }
}

//        for (int i = 0; i <5 ; i++) {
//            System.out.println(i);
//        }
//
//        int i = 0;
//        while (i<5){
//            System.out.print(i);
//            i++;
//        }


/*
                            IN WHILE LOOP
            1) Starting declaration i=0   => FIRST

            2) Then Condition inside the While Loop   => { while (i<5) }

            // Int i = 0;

            while(i<5){
            System.out,println(i);
            i++;

            }

*/
