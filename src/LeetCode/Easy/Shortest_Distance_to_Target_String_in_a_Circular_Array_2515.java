package LeetCode.Easy;

public class Shortest_Distance_to_Target_String_in_a_Circular_Array_2515 {
    static void main(String[] args) {

    }
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
}


