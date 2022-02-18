package leetcode.easy;

// Leetcode Problem N1704
// Related Problem: String, Counting
//        You are given a string s of even length.
//        Split this string into two halves of equal lengths,
//        and let a be the first half and b be the second half.
//        Two strings are alike if they have the same number of
//        vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').
//        Notice that s contains uppercase and lowercase letters.
//        Return true if a and b are alike. Otherwise, return false.

import java.util.HashSet;
import java.util.Set;

public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {

    }

    static class Solution1 {
        public boolean halvesAreAlike(String s) {
            String firstHalf = s.substring(0, s.length() / 2);
            String secondHalf = s.substring(s.length() / 2, s.length());

            Set<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');

            vowels.add('A');
            vowels.add('E');
            vowels.add('I');
            vowels.add('O');
            vowels.add('U');

            int countFirst = 0;
            int countSecond = 0;

            for (int i = 0; i < firstHalf.length(); i++) {
                if (vowels.contains(firstHalf.charAt(i))) {
                    countFirst++;
                }
                if (vowels.contains(secondHalf.charAt(i))) {
                    countSecond++;
                }
            }

            return countFirst == countSecond;
        }
    }

    static class Solution2 {
        public boolean halvesAreAlike(String s) {
            String firstHalf = s.substring(0, s.length() / 2);
            String secondHalf = s.substring(s.length() / 2, s.length());

            return checkIfVowelsAlike(firstHalf, secondHalf);
        }

        public boolean checkIfVowelsAlike(String s1, String s2) {
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

            int s1Count = 0;
            int s2Count = 0;
            for (int i = 0; i < s1.length(); i++) {
                for (char vowel : vowels) {
                    if (s1.charAt(i) == vowel) s1Count++;
                    if (s2.charAt(i) == vowel) s2Count++;
                }
            }

            return s1Count == s2Count;
        }
    }
}
