package LeetCode.myRough;

import java.util.Arrays;

public class Maximum_Gap_164 {
    static void main(String[] args) {

        int []z ={3,6,9,1};

        int l = z.length;

        int maxDifference = 0;

        Arrays.sort(z);
        for (int i = 1; i <l ; i++) {
            maxDifference = Math.max( maxDifference , z[i] - z[i -1]);
        }
        System.out.println(maxDifference);

    }
}

/*

public class MaximumGap {
    public static int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max) return 0;

        int n = nums.length;
        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];

        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        // Fill buckets
        for (int num : nums) {
            int index = (num - min) / bucketSize;
            bucketMin[index] = Math.min(bucketMin[index], num);
            bucketMax[index] = Math.max(bucketMax[index], num);
        }

        int maxGap = 0;
        int prevMax = min;

        for (int i = 0; i < bucketCount; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE) continue;

            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }

        return maxGap;
    }
}
 */
