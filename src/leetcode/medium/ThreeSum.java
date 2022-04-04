package leetcode.medium;

// Leetcode Problem N15
// Related Topic: Array, Two Pointers, Sorting
//        Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
//        such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//        Notice that the solution set must not contain duplicate triplets.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

    }

    // Brute Force with three nested loops
    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> resultSet = new ArrayList<List<Integer>>();

            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> result = new ArrayList<Integer>();
                            result.add(nums[i]);
                            result.add(nums[j]);
                            result.add(nums[k]);

                            if(!resultSet.contains(result)){
                                resultSet.add(result);
                            }
                        }
                    }
                }
            }
            return resultSet;
        }
    }
}
