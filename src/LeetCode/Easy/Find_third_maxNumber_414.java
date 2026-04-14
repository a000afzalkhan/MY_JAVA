package LeetCode.Easy;

import java.util.TreeSet;                                   // One more time to understand

public class Find_third_maxNumber_414 {
    static void main(String[] args) {

    }

    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst();
            }
        }

        return (set.size() == 3) ? set.first() : set.last();
    }
}

/*

class Solution {
    public int thirdMax(int[] nums) {
        // Three variables to store maxiumum three numbers till now.
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int num : nums) {
            // This number is already used once, thus we skip it.
            if (firstMax == num || secondMax == num || thirdMax == num) {
                continue;
            }

            // If current number is greater than first maximum,
            // It means that this is the greatest number and first maximum and second max
            // will become the next two greater numbers.
            if (firstMax <= num) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            }
            // When current number is greater than second maximum,
            // it means that this is the second greatest number.
            else if (secondMax <= num) {
                thirdMax = secondMax;
                secondMax = num;
            }
            // It is the third greatest number.
            else if (thirdMax <= num) {
                thirdMax = num;
            }
        }

        // If third max was never updated, it means we don't have 3 distinct numbers.
        if (thirdMax == Long.MIN_VALUE) {
            int ans = (int) firstMax;
            return ans;
        }

        int ans = (int) thirdMax;
        return ans;
    }
}
 */
