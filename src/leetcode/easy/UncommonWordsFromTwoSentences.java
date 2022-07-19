package leetcode.easy;

import java.util.*;

// Leetcode Problem N884
// Related Topic: Hashtable, String
//        A sentence is a string of single-space separated words where
//        each word consists only of lowercase letters.
//        A word is uncommon if it appears exactly once in one of the sentences,
//        and does not appear in the other sentence.
//        Given two sentences s1 and s2, return a list of all the uncommon words.
//        You may return the answer in any order.
public class UncommonWordsFromTwoSentences {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String s1 = "This apple is sour";
//        String s2 = "This apple is sweet";
        String s1 = "apple apple";
        String s2 = "banana";

        System.out.println(Arrays.toString(solution.uncommonFromSentences(s1, s2)));

    }

    static class Solution {
        public String[] uncommonFromSentences(String s1, String s2) {
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();

            for (String s : s1.split(" ")) {
                if (map1.containsKey(s)) {
                    map1.put(s, map1.get(s) + 1);
                } else {
                    map1.put(s, 1);
                }
            }

            for (String s : s2.split(" ")) {
                if (map2.containsKey(s)) {
                    map2.put(s, map2.get(s) + 1);
                } else {
                    map2.put(s, 1);
                }
            }

            List<String> uncommonWords = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : map1.entrySet()) {
                if (entry.getValue() == 1 && !map2.containsKey(entry.getKey())) {
                    uncommonWords.add(entry.getKey());
                }
            }
            for (Map.Entry<String, Integer> entry : map2.entrySet()) {
                if (entry.getValue() == 1 && !map1.containsKey(entry.getKey())) {
                    uncommonWords.add(entry.getKey());
                }
            }

            String[] res = new String[uncommonWords.size()];
            int index = 0;
            for (String s : uncommonWords) {
                res[index++] = s;
            }
            return res;
        }
    }
}
