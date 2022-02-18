package leetcode.easy;

// Leetcode Problem N1832
// Related Topic: Hash Table, String
//        A pangram is a sentence where every letter of the English alphabet appears at least once.
//        Given a string sentence containing only lowercase English letters,
//        return true if sentence is a pangram, or false otherwise.

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean checkIfPangram(String sentence) {
            boolean[] mark = new boolean[26];
            int index = 0;

            for (int i = 0; i < sentence.length(); i++) {
                if ('a' <= sentence.charAt(i) && sentence.charAt(i) <= 'z')
                    index = sentence.charAt(i) - 'a';

                mark[index] = true;
            }

            for (int i = 0; i < mark.length; i++) {
                if (mark[i] == false) {
                    return false;
                }
            }
            return true;
        }
    }
}
