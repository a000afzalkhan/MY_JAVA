package Basic_Understand;

import java.util.Collections;
import java.util.Arrays;
import java.util.Stack;

public class timepass {
    static void main(String[] args) {
        int[] nums = {11, 12, 13, 14};
        Stack<Integer> stack = new Stack<>();

        // Push digits of each number **separately** and pop immediately
        // to maintain correct order
        int[] a = new int[8];   // we know total 8 digits
        int index = 0;

        for (int num : nums) {
            int n = num;
            Stack<Integer> temp = new Stack<>();   // temp stack for each number

            while (n > 0) {
                temp.push(n % 10);
                n /= 10;
            }

            // Pop from temp to get correct digit order
            while (!temp.isEmpty()) {
                a[index++] = temp.pop();
            }
        }

        System.out.println(Arrays.toString(a));
    }
}

//
//        int[] nums = {11,12,13,14};
//
//
//
//        Stack<Integer>stack = new Stack<>();
//
//
//
//        for (int num : nums) {
//            while(num>0){
//                stack.add(num%10);
//                num/=10;
//            }
//        }
//        int[]a = new int[stack.size()];
//        for (int i = 0; i <stack.size() ; i++) {
//            a[i] = stack.pop();
//        }
//        System.out.println(stack.peek());
//        System.out.println(Arrays.toString(a));
//    }
//}

//System.out.print(t);


            // System.out.println(nums.length);      4 length





//        String s = "Afzal";
     //   System.out.println(s.substring(0,3));

//        timepass obj = new timepass();
//
//        int x = 123;
//
//        System.out.println(obj.reverse(x));
//        if(obj.reverse(x)==x){
//            System.out.println("Its palindrome");
//        }else{
//            System.out.println("Its not palindrome");
//        }

       // int [] a = {54,45,78};

//        int nums = 121;
//        int d =2;
//
//        String i = nums + "";
//        String j = d + "";
//
//        //System.out.println(i.charAt(0));
//       // System.out.println(a[0]);
//
//
//
//        System.out.println(i.contains(j) && i.charAt(0)!=j.charAt(0));




//
//        String []t = {"A","Z","E","Q","U","M"};
//        String []e = {"Afzal ","Zohra ","Ehsan ","Qumsum ","Uzair ","Maryam "};
//
//        String []s = {"flower", "flight","flow"};
//        int []p = {1,5,4,7,44,8,6,2};

//        Arrays.sort(t);
    //    Arrays.sort(e,Collections.reverseOrder());
//        Arrays.sort(s);
//        Arrays.sort(p);

        //Alphabet
//        for(String o :t){
//            System.out.print(o);
//        }

        //Name
//        for(String o :e){
//            System.out.print(o);
//        }

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

//    public int reverse(int x) {
//        boolean isNegative = x<0;
//        int p = Math.abs(x);
//
//        String u = p + "";
//
//        String rev = "";
//
//        int len = u.length();
//
//        for(int i = len-1; i>=0;i-- ){
//          rev += u.charAt(i);
//        }
//
//        int result = Integer.valueOf(rev);
//        return isNegative ? -result : result;