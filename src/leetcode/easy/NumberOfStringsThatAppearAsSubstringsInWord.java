package leetcode.easy;

// Leetcode Problem N1967
// Related Topic: String
//        Given an array of strings patterns and a string word, return the number of strings
//        in patterns that exist as a substring in word.
//        A substring is a contiguous sequence of characters within a string.

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {

    }

    static class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int count = 0;
            for (String pattern : patterns) {
                if (word.contains(pattern)) {
                    count++;
                }
            }
            return count;
        }
    }
}
