package leetcode.medium;

// Leetcode Problem N152
// Related Topic: Array, Dynamic Programming
//        Given an integer array nums, find a contiguous non-empty subarray within
//        the array that has the largest product, and return the product.
//        The test cases are generated so that the answer will fit in a 32-bit integer.
//        A subarray is a contiguous subsequence of the array.

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-2, 0, -2};
        System.out.println(solution.maxProduct(arr));
    }

    static class Solution {
        public int maxProduct(int[] nums) {
            int max = Integer.MIN_VALUE;
            for (int n : nums) {
                if (max < n) max = n;
            }

            int maxProductSoFar = 1;
            for (int i = 0; i < nums.length; i++) {
                maxProductSoFar *= nums[i];
                max = Math.max(max, maxProductSoFar);
                if (maxProductSoFar == 0) {
                    maxProductSoFar = 1;
                }
            }

            maxProductSoFar = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                maxProductSoFar *= nums[i];
                max = Math.max(max, maxProductSoFar);
                if (maxProductSoFar == 0) {
                    maxProductSoFar = 1;
                }
            }

            return max;
        }
    }
}
