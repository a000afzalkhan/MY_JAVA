package HackerRank_Problem;

import java.util.List;

public class Min_max_Sum {
    static void main(String[] args) {

    }


    public static void miniMaxSum(List<Integer> arr) {
        long total = 0;
        long min = arr.get(0);
        long max = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            long value = arr.get(i);
            total += value;

            if (value < min) min = value;
            if (value > max) max = value;
        }

        long minSum = total - max;
        long maxSum = total - min;

        System.out.println(minSum + " " + maxSum);
    }

}

/*

🧾 Problem: Mini-Max Sum (HackerRank)

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.

Then print the respective minimum and maximum values as a single line of two space-separated long integers.

📥 Input Format
A single line of five space-separated integers
📤 Output Format
Print two space-separated long integers:
First → minimum sum
Second → maximum sum

⚠️ Constraints
Each integer is between 1 and 10⁹
Sum can be large → use long in Java .


 */
