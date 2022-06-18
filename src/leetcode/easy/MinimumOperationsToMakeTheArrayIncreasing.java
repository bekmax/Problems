package leetcode.easy;

//Leetcode Problem N1827
//Related Topic: Array, Greedy
//        You are given an integer array nums (0-indexed).
//        In one operation, you can choose an element of the array and increment it by 1.
//        For example, if nums = [1,2,3], you can choose to increment nums[1] to make nums = [1,3,3].
//        Return the minimum number of operations needed to make nums strictly increasing.

public class MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3,2,1};
        System.out.println(solution.minOperations(arr));
    }

    static class Solution {
        public int minOperations(int[] nums) {
            int operationsCount = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]) {
                    operationsCount += (nums[i] - nums[i + 1]);
                    operationsCount++;
                    nums[i + 1] = nums[i] + 1;
                }
            }
            return operationsCount;
        }
    }
}
