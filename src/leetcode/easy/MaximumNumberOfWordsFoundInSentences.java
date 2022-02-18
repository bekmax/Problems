package leetcode.easy;

// Leetcode Problem N2114
// Related Topic: Array, String
//        A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//        You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//        Return the maximum number of words that appear in a single sentence.

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {

    }

    static class Solution {
        public int mostWordsFound(String[] sentences) {
            int maxNumberOfWords = 0;

            for (String sentence : sentences) {
                String[] words = sentence.split(" ");
                if (words.length > maxNumberOfWords) {
                    maxNumberOfWords = words.length;
                }
            }
            return maxNumberOfWords;
        }
    }
}
