package leetcode.easy;

// Leetcode Problem N1
// Related topic: Array, Hash Table
//        Given an array of integers nums and an integer target,
//        return indices of the two numbers such that they add up to target.
//        You may assume that each input would have exactly one solution,
//        and you may not use the same element twice.
//        You can return the answer in any order.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        TwoSum.Solution1 solution1 = twoSum.new Solution1();
        TwoSum.Solution2 solution2 = twoSum.new Solution2();
        TwoSum.Solution3 solution3 = twoSum.new Solution3();

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        printArray(solution1.twoSum(arr, target));
        printArray(solution2.twoSum(arr, target));
        printArray(solution3.twoSum(arr, target));
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Time Complexity: O(N*N), Space complexity: O(1)
    class Solution1 {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            throw new IllegalStateException("No solution!");
        }
    }

    // Time Complexity: O(N*LogN), Space complexity: O(1)
    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            Arrays.sort(nums);
            int headPointer = 0;
            int tailPointer = nums.length - 1;

            for (int i = 0; i < nums.length; i++) {
                int sum = nums[headPointer] + nums[tailPointer];
                if (sum == target) {
                    return new int[]{headPointer, tailPointer};
                }
                if (target < sum) tailPointer--;
                if (target > sum) headPointer++;
            }
            throw new IllegalStateException("No solution!");
        }
    }

    // Time complexity: O(N), Space complexity: O(N)
    class Solution3 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int compliment = target - nums[i];

                if (map.containsKey(compliment)) {
                    return new int[]{map.get(compliment), i};
                }
                map.put(nums[i], i);
            }

            throw new IllegalStateException("No solution!");
        }
    }


}
