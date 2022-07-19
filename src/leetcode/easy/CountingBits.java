package leetcode.easy;

// Leetcode Problem N338
// Related Topic:  Dynamic Programming, Bit Manipulation
//    Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
//    ans[i] is the number of 1's in the binary representation of i.
public class CountingBits {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                if ((i % 2) == 0) {
                    ans[i] = ans[i / 2];
                } else {
                    ans[i] = ans[i - 1] + 1;
                }
            }
            return ans;
        }
    }
}
