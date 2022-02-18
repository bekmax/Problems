package leetcode.easy;

// Leetcode Problem N2006
// Related Topic: Array, Hash Table, Counting
//        Given an integer array nums and an integer k, return the number of pairs (i, j)
//        where i < j such that |nums[i] - nums[j]| == k.
//        The value of |x| is defined as:
//        x if x >= 0.
//        -x if x < 0.

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {

    }

    static class Solution {
        public int countKDifference(int[] nums, int k) {
            int count = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int diff = nums[i] - nums[j];
                    if (diff == k || diff == -k) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
