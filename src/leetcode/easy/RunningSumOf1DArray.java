package leetcode.easy;

// Leetcode Problem N1480
// Related Topic: Array
//        Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//        Return the running sum of nums.

public class RunningSumOf1DArray {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] runningSum(int[] nums) {
            int sum = 0;
            int[] runningSum = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                runningSum[i] = sum;
            }

            return runningSum;
        }
    }
}
