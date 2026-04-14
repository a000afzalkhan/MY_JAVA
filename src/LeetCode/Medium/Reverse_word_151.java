package LeetCode.Medium;

public class Reverse_word_151 {
    static void main(String[] args) {

    }
}


/*
class Solution {
    public String reverseWords(String s) {
        // Step 1: trim spaces
        s = s.trim();

        // Step 2: split by multiple spaces
        String[] words = s.split("\\s+");

        // Step 3: reverse words
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}

 */

/*

import java.util.*;

class Solution {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        int i = 0;
        int n = s.length();

        while (i < n) {
            // skip spaces
            while (i < n && s.charAt(i) == ' ') i++;

            int start = i;

            // get word
            while (i < n && s.charAt(i) != ' ') i++;

            if (start < i) {
                stack.push(s.substring(start, i));
            }
        }

        // build result
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
            if (!stack.isEmpty()) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}


 */


/*

class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();

        // Step 1: Clean spaces
        int n = cleanSpaces(arr);

        // Step 2: Reverse entire string
        reverse(arr, 0, n - 1);

        // Step 3: Reverse each word
        reverseEachWord(arr, n);

        return new String(arr, 0, n);
    }

    private int cleanSpaces(char[] arr) {
        int i = 0, j = 0, n = arr.length;

        while (j < n) {
            // skip spaces
            while (j < n && arr[j] == ' ') j++;

            // copy word
            while (j < n && arr[j] != ' ') arr[i++] = arr[j++];

            // skip spaces again
            while (j < n && arr[j] == ' ') j++;

            // add one space if not end
            if (j < n) arr[i++] = ' ';
        }

        return i; // new length
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }

    private void reverseEachWord(char[] arr, int n) {
        int start = 0, end = 0;

        while (start < n) {
            // find end of word
            while (end < n && arr[end] != ' ') end++;

            // reverse word
            reverse(arr, start, end - 1);

            // move to next word
            start = end + 1;
            end = start;
        }
    }
}
 */