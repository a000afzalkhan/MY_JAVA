package LeetCode;

import java.util.HashSet;

public class lengthOfLongestSubstring {
    static void main(String[] args) {

        String r = "Afzal";
        char y = r.charAt(0);
        System.out.println(y);

    }
//    public int lengthOfLongestSubstring(String s) {
//        HashSet<Character>set = new HashSet<>();
//        int left = 0;
//        int right = 0;
//        int max = 0;
//
//        while (right < s.length()){               // 0 < 5  [ A F Z A L ]
//            char ch = s.charAt(right);
//        }
//
//    }
}
/*

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0, maxLen = 0;
        int[] map = new int[128];

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            left = Math.max(left, map[c]);
            maxLen = Math.max(maxLen, right - left + 1);
            map[c] = right + 1;
        }

        return maxLen;
    }
}

 */


/*

class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] lastSeen = new int[256]; // ASCII

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // move left if duplicate found
            left = Math.max(left, lastSeen[ch]);

            // calculate max length
            maxLength = Math.max(maxLength, right - left + 1);

            // update last seen position
            lastSeen[ch] = right + 1;
        }

        return maxLength;
    }
}
 */

                                    //Geminie
/*

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // 1. Ek HashSet banaya letters yaad rakhne ke liye
        HashSet<Character> set = new HashSet<>();

        int i = 0; // Left pointer
        int j = 0; // Right pointer
        int max = 0; // Sabse lambi length store karne ke liye

        // 2. String ke end tak jao
        while (j < s.length()) {
            // Agar character naya hai (set mein nahi hai)
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j)); // Diary mein likh lo
                j++; // Khidki aage badhao
                // Max length update karo
                max = Math.max(max, set.size());
            }
            // Agar character repeat ho gaya!
            else {
                set.remove(s.charAt(i)); // Left wala letter nikalo
                i++; // Khidki piche se choti karo
            }
        }

        return max;
    }
}
 */