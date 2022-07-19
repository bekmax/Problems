package leetcode.easy;

// Leetcode Problem N258
// Related Topic: Math, Simulation, Number Theory
//    Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
public class AddDigits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigits(38));
    }

    static class Solution {
        public int addDigits(int num) {
            while (num > 9) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
            }
            return num;
        }
    }
}
