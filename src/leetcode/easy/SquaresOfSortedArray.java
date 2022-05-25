package leetcode.easy;

import java.util.Arrays;

//Leetcode Problem N977
//Related Topic: Array, Two Pointer, Sorting
//        Given an integer array nums sorted in non-decreasing order,
//        return an array of the squares of each number sorted in non-decreasing order.
public class SquaresOfSortedArray {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int nums[] = {1};

        for (int i : solution.sortedSquares(nums)) {
            System.out.print(i + " ");
        }
    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int head = 0;
            int tail = nums.length - 1;
            int[] result = new int[nums.length];
            int index = nums.length - 1;

            while (head <= tail) {
                if (nums[head] * nums[head] > nums[tail] * nums[tail]) {
                    result[index--] = nums[head] * nums[head];
                    head++;
                } else {
                    result[index--] = nums[tail] * nums[tail];
                    tail--;
                }
            }
            return result;
        }
    }
}
