package leetcode.easy;

// Leetcode Problem 1941
// Related Topic: Hash Table, String, Counting
//        Given a string s, return true if s is a good string, or false otherwise.
//        A string s is good if all the characters that appear in s have the same number
//        of occurrences (i.e., the same frequency).

import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean areOccurrencesEqual(String s) {
            Map<Character, Integer> letters = new HashMap<Character, Integer>();
            char[] charArr = s.toCharArray();
            for (char c : charArr) {
                if (letters.get(c) == null) {
                    letters.put(c, 1);
                } else {
                    letters.put(c, letters.get(c) + 1);
                }
            }

            int count = letters.get(charArr[0]);
            for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
                if (count != entry.getValue()) return false;
            }
            return true;
        }
    }
}
