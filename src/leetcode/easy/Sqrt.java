package leetcode.easy;

// Leetcode Problem N69
// Related Topic: Math, Binary Search
//        Given a non-negative integer x, compute and return the square root of x.
//        Since the return type is an integer, the decimal digits are truncated,
//        and only the integer part of the result is returned.
//        Note: You are not allowed to use any built-in exponent function or operator,
//        such as pow(x, 0.5) or x ** 0.5.

public class Sqrt {
    public static void main(String[] args) {

        System.out.println(new Solution().mySqrt(1048577));

    }

    static class Solution {
        public int mySqrt(int x) {
            long start = 0;
            long end = x;

            while (start + 1 < end){
                long mid = end - (end - start)/2;
                if(mid * mid == x) return (int) mid;
                else if(mid * mid < x) start = mid;
                else end = mid;
            }

            if(end * end == x) return (int) end;
            return (int) start;
        }
    }
}
