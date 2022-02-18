package leetcode.easy;

// Leetcode Problem N1913
// Related Problem: Array, Sorting
//        The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
//        For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
//        Given an integer array nums, choose four distinct indices w, x, y, and z such that the product
//        difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
//        Return the maximum such product difference.

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {10, 10, 10, 10};
        System.out.println(solution.maxProductDifference(arr));
    }

    static class Solution {
        public int maxProductDifference(int[] nums) {
            Arrays.sort(nums);

            return nums[nums.length-1]*nums[nums.length-2] - nums[1]*nums[0];
        }
    }
}
