package leetcode.easy;

// Leetcode Problem N53
// Related Topic: Array, Divide and Conquer, Dynamic Programming
//        Given an integer array nums, find the contiguous sub-array
//        (containing at least one number) which has the largest sum and return its sum.
//        A sub-array is a contiguous part of an array.

public class MaximumSubarray {
    public static void main(String[] args) {

        int[] a = {-2,1,-3,4,-1,2,1,-5,24};

        System.out.println("\n" + new Solution().maxSubArray(a));
    }

    static class Solution {
        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int maxUpToIndex = 0;

            for (int i = 0; i < nums.length; i++) {
                maxUpToIndex += nums[i];
                System.out.print(maxUpToIndex + " ");
                if (max < maxUpToIndex) {
                    max = maxUpToIndex;
                }

                if (maxUpToIndex < 0) {
                    maxUpToIndex = 0;
                }
            }
            return max;
        }
    }
}
