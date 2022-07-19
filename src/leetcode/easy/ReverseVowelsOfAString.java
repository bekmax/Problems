package leetcode.easy;

// Leetcode Problem N345
// Related Topic: Two Pointers, String
//        Given a string s, reverse only all the vowels in the string and return it.
//        The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both cases.

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("LeetcOde"));
    }

    static class Solution {
        public String reverseVowels(String s) {
            char[] charArr = s.toCharArray();
            int left = 0;
            int right = charArr.length - 1;

            while (left <= right) {
                if (isVowel(charArr[left]) && isVowel(charArr[right])) {
                    char c = charArr[left];
                    charArr[left] = charArr[right];
                    charArr[right] = c;
                    left++;
                    right--;
                } else if (isVowel(charArr[left])) {
                    right--;
                } else {
                    left++;
                }
            }

            return String.valueOf(charArr);
        }

        public boolean isVowel(char c) {
            if (c == 'a' || c == 'o' || c == 'u' || c == 'e' || c == 'i'
            || c == 'A' || c == 'O' || c == 'U' || c == 'E' || c == 'I') {
                return true;
            }
            return false;
        }
    }
}
