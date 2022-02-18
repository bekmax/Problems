package leetcode.easy;

// Leetcode Problem N1684
// Related Topic: Array, Hash Table, String, Bit Manipulation
//        You are given a string allowed consisting of distinct characters and an array of strings words.
//        A string is consistent if all characters in the string appear in the string allowed.
//        Return the number of consistent strings in the array words.

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {

    }

    static class Solution1 {
        public int countConsistentStrings(String allowed, String[] words) {
            int count = 0;
            for (String word : words) {
                if (isAllowed(allowed, word)) {
                    count++;
                }
            }
            return count;
        }

        public boolean isAllowed(String allowed, String word) {
            for (int i = 0; i < word.length(); i++) {
                if (allowed.indexOf(word.charAt(i)) == -1) {
                    return false;
                }
            }
            return true;
        }
    }
}
