package LeetCode.Easy;

import java.util.*;

public class Most_common_word_819 {
    static void main(String[] args) {

    }
    public String mostCommonWord(String paragraph, String[] banned) {

        // Step 1: lowercase + remove punctuation
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", "");

        // Step 2: split words
        String[] words = paragraph.split(" ");

        // Step 3: banned set
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Step 4: count words
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!bannedSet.contains(word) && word.length() > 0) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }

        }

        // Step 5: find max
        String result = "";
        int max = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > max) {
                max = map.get(word);
                result = word;
            }
        }

        return result;
    }
}

/*

import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> count = new HashMap<>();

        StringBuilder word = new StringBuilder();
        String result = "";
        int max = 0;

        paragraph = paragraph.toLowerCase();

        for (int i = 0; i <= paragraph.length(); i++) {
            char c = i < paragraph.length() ? paragraph.charAt(i) : ' ';

            if (Character.isLetter(c)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    String w = word.toString();

                    if (!bannedSet.contains(w)) {
                        int freq = count.getOrDefault(w, 0) + 1;
                        count.put(w, freq);

                        if (freq > max) {
                            max = freq;
                            result = w;
                        }
                    }
                    word.setLength(0); // reset
                }
            }
        }

        return result;
    }
}
 */
