package leetcode.easy;

// Leetcode Problem N342
// Related Topic: Math, Bit Manipulation, Recursion
//        Given an integer n, return true if it is a power of four. Otherwise, return false.
//        An integer n is a power of four, if there exists an integer x such that n == 4x.
public class PowerOfFour {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfFour(0));
    }

    static class Solution {
        public boolean isPowerOfFour(int n) {
            if (n == 1) return true;
            if (n == 0 || n % 4 != 0) return false;
            return isPowerOfFour(n / 4);
        }
    }
}
