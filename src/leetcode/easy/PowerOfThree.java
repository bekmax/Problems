package leetcode.easy;

// Leetcode Problem N326
// Related Topic: Math, Recursion
//        Given an integer n, return true if it is a power of three. Otherwise, return false.
//        An integer n is a power of three, if there exists an integer x such that n == pow(3, x).
public class PowerOfThree {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isPowerOfThree(int n) {
            if(n == 0) return false;

            if(n == 1) return true;

            if(n % 3 != 0) return false;

            return isPowerOfThree(n/3);
        }
    }
}
