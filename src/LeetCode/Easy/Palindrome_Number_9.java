package LeetCode.Easy;

public class Palindrome_Number_9 {
    static void main(String[] args) {
        int c = 121;
        boolean result = palindromeNumber(c);

        System.out.println(result);


    }

    public static boolean palindromeNumber(int num){               // Output = True / False
//            if(num < 0 ){
//                return false};

            int original = num;
            int reversed = 0;

            while (num!=0){
                int d = num%10;
                reversed=reversed*10 + d;
                num=num / 10;
            }
                    return original==reversed;
    }
}
/*
num = 121

while(num != 0 ) 121 != 0  =>TRUE

 */