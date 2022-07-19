package leetcode.easy;

import java.util.Arrays;

// Leetcode Problem N2154
// Related Topic: Array, Hashtable, Sorting, Simulation
//        You are given an array of integers nums.
//        You are also given an integer original which is the first number that needs to be searched for in nums.
//        You then do the following steps:
//        If original is found in nums, multiply it by two (i.e., set original = 2 * original).
//        Otherwise, stop the process.
//        Repeat this process with the new number as long as you keep finding the number.
//        Return the final value of original.
public class KeepMultiplyingFoundValuesByTwo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {5,3,6,1,12};

        System.out.println(solution.findFinalValue(arr, 3));
    }

    static class Solution {
        public int findFinalValue(int[] nums, int original) {
            Arrays.sort(nums);

            while (findNumberInSortedArray(nums, original, 0, nums.length - 1)) {
                original *= 2;
            }
            return original;
        }

        public boolean findNumberInSortedArray(int[] nums, int num, int left, int right) {
            if (right >= left) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == num) {
                    return true;
                } else if (nums[mid] > num) {
                    return findNumberInSortedArray(nums, num, left, mid - 1);
                } else {
                    return findNumberInSortedArray(nums, num, mid + 1, right);
                }

            }
            return false;
        }
    }
}
