package leetcode.easy;

// Leetcode Problem N1374
// Related Topic: String
//        Given an integer n, return a string with n characters such that each
//        character in such string occurs an odd number of times.
//        The returned string must contain only lowercase English letters.
//        If there are multiples valid strings, return any of them.

public class GenerateStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {

        System.out.println(new Solution().generateTheString(20));
    }

    static class Solution {
        public String generateTheString(int n) {

            StringBuilder builder = new StringBuilder();

            if (n % 2 == 1) {
                for (int i = 0; i < n; i++) {
                    builder.append("x");
                }
            } else {
                for (int i = 0; i < n - 1; i++) {
                    builder.append("x");
                }
                builder.append("y");
            }

            return builder.toString();
        }
    }
}
