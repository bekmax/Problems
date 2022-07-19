package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

// Leetcode Problem N367
// Related Topic: Math, Binary Search
//        Given a positive integer num, write a function which returns True if num is a perfect square else False.
//        Follow up: Do not use any built-in library function such as sqrt.
public class ValidPerfectSquare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPerfectSquare(2147483647));
        System.out.println(solution.isPerfectSquare(25));
        System.out.println(solution.isPerfectSquare(16));
        System.out.println(solution.isPerfectSquare(49));

    }

    static class Solution {
        public boolean isPerfectSquare(int num) {
            long start = 1, end = num;
            while (start <= end) {
                long mid = start + (end - start) / 2;
                if (mid * mid == num)
                    return true;
                else if (mid * mid > num)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            return false;
        }
    }
}
