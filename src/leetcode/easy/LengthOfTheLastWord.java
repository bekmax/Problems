package leetcode.easy;

// Leetcode Problem N58
// Related Topic: String
//        Given a string s consisting of some words separated by some number of spaces,
//        return the length of the last word in the string.
//        A word is a maximal substring consisting of non-space characters only.

public class LengthOfTheLastWord {
    public static void main(String[] args) {

        String sentence = "This is a sample string consisting of several words";

        System.out.println(new Solution().lengthOfLastWord(sentence));
    }

    static class Solution {
        public int lengthOfLastWord(String s) {

            if (s == null || s.length() == 0){
                return 0;
            }

            String[] strArr = s.split(" ");

            return strArr[strArr.length-1].length();
        }
    }
}
