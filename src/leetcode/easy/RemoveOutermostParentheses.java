package leetcode.easy;

// Leetcode Problem N1021
// Related Topic: String, Stack
//        A valid parentheses string is either empty "", "(" + A + ")", or A + B,
//        where A and B are valid parentheses strings, and + represents string concatenation.
//        For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
//        A valid parentheses string s is primitive if it is nonempty, and there does not exist
//        a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
//        Given a valid parentheses string s, consider its primitive decomposition:
//        s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
//        Return s after removing the outermost parentheses of every primitive string in the
//        primitive decomposition of s.

public class RemoveOutermostParentheses {
    public static void main(String[] args) {

    }

    static class Solution {
        public String removeOuterParentheses(String s) {
            int open = 0;
            char[] charArr = s.toCharArray();

            StringBuilder builder = new StringBuilder();
            for (char c : charArr) {
                if (c == '(') {
                    open++;
                    if (open > 1) {
                        builder.append(c);
                    }
                }
                if (c == ')') {
                    open--;
                    if (open > 0) {
                        builder.append(c);
                    }
                }
            }
            return builder.toString();
        }
    }
}
