package leetcode.easy;

// Leetcode Problem N1413
// Related Topic: Array, Prefix Sum
//        Given an array of integers nums, you start with an initial positive value startValue.
//        In each iteration, you calculate the step by step sum of startValue plus elements in nums (from left to right).
//        Return the minimum positive value of startValue such that the step by step sum is never less than 1.
public class MinimumValueToGetPositiveStepByStepSum {
    public static void main(String[] args) {

    }

    static class Solution {
        public int minStartValue(int[] nums) {
            int startValue = 0;
            int minSum = nums[0];

            for (int n : nums) {
                startValue += n;
                if (minSum > startValue) {
                    minSum = startValue;
                }
            }

            if (minSum >= 1) {
                return 1;
            } else {
                return 1 - minSum;
            }
        }
    }
}
