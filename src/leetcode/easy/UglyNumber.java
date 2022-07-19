package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Leetcode Problem N263
// Related Topic: Math
//        An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
//        Given an integer n, return true if n is an ugly number.
public class UglyNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isUgly(10));
    }

    static class Solution {
        public boolean isUgly(int n) {
            if (n <= 0) return false;
            else if (n == 1) {
                return true;
            } else {
                int divider = 2;
                while (n > 1) {
                    if (divider > 5) return false;

                    if (n % divider != 0) {
                        divider++;
                    } else {
                        n /= divider;
                    }

                }
                return true;
            }
        }
    }
}
