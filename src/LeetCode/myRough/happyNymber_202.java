package LeetCode.myRough;

import LeetCode.Easy.Happy_Number_202;

public class happyNymber_202 {

    public boolean NumberC(int nums) {

        if(nums==0)return false;
        if (nums == 1) return true;
        if (nums == 4) return false;

        int sum = 0;

        while (nums > 0) {
            int d = nums % 10;
            sum = sum + d * d;
            nums = nums / 10;
        }



        return NumberC(sum);
    }


    public static void main(String[] args) {
        happyNymber_202 s = new happyNymber_202();

        int x = 19;

        System.out.println(s.NumberC(x));
                        //Use Ternary Operator
        System.out.println(s.NumberC(x) ? "Happy": "N-Happy");


//        boolean res = s.NumberC(x);
//        if(res){
//            System.out.println("Happy");
//        }else{
//            System.out.println("Not Happy");
//        }

//        for (int i = 1; i < 10; i++) {
//            if(s.NumberC(i)){
//                System.out.println(i + " Happy");
//            }else {
//                System.out.println(i + " Not - Happy");
//            }
//        }




//        int x =4;
//
//       // int y = x*x;
//                        // Check this is number is Happy Number
//
//
//
//        while(x != 1 && x!=4){
//            int sum = 0;
//            while(x>0){
//                int d = x%10;
//                sum=sum +  d*d;
//                x=x/10;
//            }
//            x = sum ;
//        }
//
//        System.out.println(x);
//
//        if (x == 1) {
//            System.out.println("Happy Number 😄");
//        } else {
//            System.out.println("Not Happy 😢");
//        }


//        while (x!=1 & x!=4){
//
//            int sum = 0;
//
//            while(x > 0){
//                int digit = x%10;
//                sum =(digit*digit);
//
//            }
//
//        }









    }


//    public boolean HappyNumberr(int nums){
//        if (nums == 1 || nums ==7)return true;
//        else if (nums<10)return false;
//
//        else{
//
//            int sum =0;
//
//            while (nums>0){
//                int d = nums%10;
//                sum=sum+d*d;
//                nums=nums/10;
//            }
//            return HappyNumberr(sum);
//        }
//    }




}
