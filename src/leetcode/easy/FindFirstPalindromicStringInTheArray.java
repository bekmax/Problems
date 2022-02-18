package leetcode.easy;

// Leetcode Problem N2108
// Related Topic: Array, Two Pointers, String
//        Given an array of strings words, return the first palindromic string in the array.
//        If there is no such string, return an empty string "".
//        A string is palindromic if it reads the same forward and backward.

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {

    }

    static class Solution {
        public String firstPalindrome(String[] words) {
            for (String word : words) {
                if (isPalindrome(word)) {
                    return word;
                }
            }
            return "";
        }

        public boolean isPalindrome(String word) {
            StringBuilder builder = new StringBuilder();

            builder.append(word);
            builder.reverse();

            return builder.toString().equals(word);
        }
    }
}
