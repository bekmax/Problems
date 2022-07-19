package leetcode.easy;

// Leetcode Problem N231
// Related Topic: Math, Bit Manipulation, Recursion
//        Given an integer n, return true if it is a power of two. Otherwise, return false.
//        An integer n is a power of two, if there exists an integer x such that n == 2x.
public class PowerOfTwo {
    public static void main(String[] args) {

    }

    static class Solution {
        public boolean isPowerOfTwo(int n) {

            // terminate condition
            if(n == 1) return true;
            if(n == 0) return false;

            // recursion
            if(n % 2 == 0){
                return isPowerOfTwo(n / 2);
            }
            else{
                return false;
            }
        }
    }
}
