package leetcode.easy;

// Leetcode Problem N1768
// Related Topic: Two Pointers, String
//        You are given two strings word1 and word2.
//        Merge the strings by adding letters in alternating order, starting with word1.
//        If a string is longer than the other, append the additional letters onto the end of the merged string.
//        Return the merged string.

public class MergeStringsAlternately {
    public static void main(String[] args) {

    }

    static class Solution {
        public String mergeAlternately(String word1, String word2) {
            char[] w1 = word1.toCharArray();
            char[] w2 = word2.toCharArray();
            int length = Math.min(w1.length, w2.length);
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < length; i++) {
                builder.append(w1[i]);
                builder.append(w2[i]);
            }

            if (word1.length() == word2.length()) {
                return builder.toString();
            } else if (word1.length() > word2.length()) {
                builder.append(word1.substring(length, word1.length()));
            } else {
                builder.append(word2.substring(length, word2.length()));
            }

            return builder.toString();
        }
    }
}
