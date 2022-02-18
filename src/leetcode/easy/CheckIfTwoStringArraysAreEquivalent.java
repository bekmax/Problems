package leetcode.easy;

// Leetcode Problem N1662
// Related Topic: Array, String
//        Given two string arrays word1 and word2,
//        return true if the two arrays represent the same string, and false otherwise.
//        A string is represented by an array if the array elements concatenated in order forms the string.

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder input1 = new StringBuilder();
            StringBuilder input2 = new StringBuilder();

            for (String word : word1) {
                input1.append(word);
            }

            for (String word : word2) {
                input2.append(word);
            }

            return input1.toString().equals(input2.toString());
        }
    }
}
