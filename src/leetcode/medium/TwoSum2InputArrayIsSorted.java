package leetcode.medium;

// Leetcode Problem N167
// Related Topic: Array, Two Pointer, Binary Search
//        Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
//        find two numbers such that they add up to a specific target number.
//        Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//        Return the indices of the two numbers, index1 and index2,
//        added by one as an integer array [index1, index2] of length 2.
//        The tests are generated such that there is exactly one solution.
//        You may not use the same element twice. Your solution must use only constant extra space.

public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int headPointer = 0;
            int tailPointer = numbers.length - 1;

            for (int i = 0; i < numbers.length; i++) {
                int sum = numbers[headPointer] + numbers[tailPointer];
                if (sum == target) {
                    return new int[]{headPointer + 1, tailPointer + 1};
                }
                if (target < sum) tailPointer--;
                if (target > sum) headPointer++;
            }
            throw new IllegalStateException("No solution!");
        }
    }
}
