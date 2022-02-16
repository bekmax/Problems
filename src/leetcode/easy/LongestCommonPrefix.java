package leetcode.easy;

// Leetcode Problem N14
// Related Topic: String
//        Write a function to find the longest common prefix string amongst an array of strings.
//        If there is no common prefix, return an empty string "".

public class LongestCommonPrefix {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] stringArr = {"car", "car", "car"};

        System.out.println(solution.longestCommonPrefix(stringArr));
    }

    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            String result = "";

            if (strs == null || strs.length == 0) {
                return result;
            }

            int minLength = Integer.MAX_VALUE;
            for (String s : strs) {
                if (s.length() < minLength) {
                    minLength = s.length();
                }
            }

            char[] charArr = strs[0].toCharArray();

            for (int i = 0; i < minLength; i++) {
                for (String s : strs) {
                    if (charArr[i] != s.charAt(i)) {
                        return result;
                    }
                }
                result += charArr[i];
            }
            return result;
        }
    }
}
