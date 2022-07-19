package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

// Leetcode Problem N2085
// Related Topic: Array, Hashtable, String, Counting
//        Given two string arrays words1 and words2,
//        return the number of strings that appear exactly once in each of the two arrays.
public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {

    }

    static class Solution {
        public int countWords(String[] words1, String[] words2) {
            Map<String, Integer> map1 = new HashMap<>();
            Map<String, Integer> map2 = new HashMap<>();

            for (String s : words1) {
                if (map1.containsKey(s)) {
                    map1.put(s, map1.get(s) + 1);
                } else {
                    map1.put(s, 1);
                }
            }

            for (String s : words2) {
                if (map2.containsKey(s)) {
                    map2.put(s, map2.get(s) + 1);
                } else {
                    map2.put(s, 1);
                }
            }
            int counter = 0;
            for (Map.Entry<String, Integer> entry : map1.entrySet()) {
                if (entry.getValue() != 1) continue;
                if (map2.containsKey(entry.getKey()) && map2.get(entry.getKey()) == 1) {
                    counter++;
                }
            }
            return counter;
        }
    }
}
