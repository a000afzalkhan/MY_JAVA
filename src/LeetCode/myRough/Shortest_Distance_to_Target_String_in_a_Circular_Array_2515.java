package LeetCode.myRough;

import java.net.Inet4Address;

public class Shortest_Distance_to_Target_String_in_a_Circular_Array_2515 {
    static void main(String[] args) {

        String []word = {"hello","i","am","LeetCode","hello"};
        int n = word.length;
        String tar = "hello";
        int startIndex = 1;

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (word[i].equals(tar)) {
                int distance = Math.abs(i - startIndex);
                minDistance = Math.min(minDistance, distance);
            }
        }

        System.out.println(minDistance);

    }
}

/*
public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;  // length of word
        int minDistance = Integer.MAX_VALUE;  //max Value

        for (int i = 0; i < n; i++) {

            if (words[i].equals(target)) {

                int right = Math.abs(i - startIndex);
                int left = n - right;

                int distance = Math.min(right, left);

                minDistance = Math.min(minDistance, distance);
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
*/