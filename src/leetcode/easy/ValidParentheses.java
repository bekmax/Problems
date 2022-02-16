package leetcode.easy;

// Leetcode Problem N20
// Related Topic: String, Stack
//        Given a string s containing just the characters
//        '(', ')', '{', '}', '[' and ']',
//        determine if the input string is valid.
//        An input string is valid if:
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

        Solution solution = new Solution();

        boolean result = solution.isValid("((){}[]{)}");

        System.out.println(result);
    }

    static class Solution {
        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char insert = s.charAt(i);

                if (insert == '(' || insert == '{' || insert == '[') {
                    stack.push(insert);
                    continue;
                }

                if (stack.isEmpty()) return false;

                char check;
                switch (insert) {
                    case ')':
                        check = stack.pop();
                        if (check == '{' || check == '[') {
                            return false;
                        }
                        break;
                    case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[') {
                            return false;
                        }
                        break;
                    case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{') {
                            return false;
                        }
                        break;
                }
            }
            return stack.isEmpty();
        }
    }

}
