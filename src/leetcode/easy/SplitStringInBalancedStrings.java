package leetcode.easy;

// Leetcode Problem N1221
// Related Topic: String, Greedy, Counting
//        Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
//        Given a balanced string s, split it in the maximum amount of balanced strings.
//        Return the maximum amount of split balanced strings.

public class SplitStringInBalancedStrings {
    public static void main(String[] args) {

    }

    class Solution {
        public int balancedStringSplit(String s) {
            int balance = 0;
            int result = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'L') {
                    balance++;
                } else {
                    balance--;
                }

                if (balance == 0) result++;
            }
            return result;
        }
    }
}
