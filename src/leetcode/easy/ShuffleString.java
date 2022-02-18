package leetcode.easy;

// Leetcode Problem N1528
// Related Topic: Array, String
//        You are given a string s and an integer array indices of the same length.
//        The string s will be shuffled such that the character at the ith position
//        moves to indices[i] in the shuffled string.
//        Return the shuffled string.

public class ShuffleString {
    public static void main(String[] args) {

    }

    static class Solution {
        public String restoreString(String s, int[] indices) {
            StringBuilder result = new StringBuilder(s);

            for (int i = 0; i < s.length(); i++) {
                result.setCharAt(indices[i], s.charAt(i));
            }

            return result.toString();
        }
    }


}
