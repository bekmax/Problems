package leetcode.easy;

// Leetcode problem N28
// Related Topic: Two Pointer, String, String Matching
//        Implement strStr().
//        Return the index of the first occurrence of needle in haystack,
//        or -1 if needle is not part of haystack.
//        Clarification:
//        What should we return when needle is an empty string?
//        This is a great question to ask during an interview.
//        For the purpose of this problem, we will return 0 when needle is an empty string.
//        This is consistent to C's strstr() and Java's indexOf().

public class ImplementStrStr {
    public static void main(String[] args) {

        ImplementStrStr iss = new ImplementStrStr();
        Solution solution = iss.new Solution();

        String haystack = "hello";
        String needle = "ll";

        System.out.println(solution.strStr(haystack, needle));
    }

    class Solution {
        public int strStr(String haystack, String needle) {
            if (haystack == null || needle == null || needle.length() > haystack.length()) {
                return -1;
            }

            if (needle.length() == 0) {
                return 0;
            }

            for (int i = 0; i <= haystack.length() - needle.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    if (haystack.substring(i, i + needle.length()).equals(needle)) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}
