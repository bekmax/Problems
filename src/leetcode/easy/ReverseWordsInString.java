package leetcode.easy;

// Leetcode Problem N557
// Related Topic: Two Pointers, String
//        Given a string s, reverse the order of characters in each word
//        within a sentence while still preserving whitespace and initial word order.

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWordsInString {
    public static void main(String[] args) {

    }

    // Using Loop and StringBuilder
    static class Solution1 {
        public String reverseWords(String s) {

            String[] strArr = s.split(" ");
            StringBuilder result = new StringBuilder();

            for (String str : strArr) {
                StringBuilder builder = new StringBuilder();
                builder.append(str);
                builder.reverse();

                result.append(builder.toString() + " ");
            }
            return result.toString().trim();
        }
    }

    // Not a good solution
    static class Solution2 {
        public String reverseWords(String s) {
            String[] stringArr = s.split(" ");
            String result = "";
            for (String str : stringArr) {
                result += reverse(str) + " ";
            }

            return result.trim();
        }

        public String reverse(String word) {
            char[] charArr = word.toCharArray();
            int start = 0;
            int end = charArr.length - 1;

            while (start <= end) {
                char letter = charArr[start];
                charArr[start] = charArr[end];
                charArr[end] = letter;
                start++;
                end--;
            }
            return new String(charArr);
        }
    }

    // Using Stream and StringBuilder
    static class Solution3 {
        public String reverseWords(String s) {

            return Arrays.stream(s.split(" "))
                    .map(i -> new StringBuilder(i).reverse().toString())
                    .collect(Collectors.joining(" "));
        }
    }

}


