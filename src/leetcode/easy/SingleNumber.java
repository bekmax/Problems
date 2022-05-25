package leetcode.easy;

// Leetcode Problem N136
// Related Topic: Array, Bit Manipulation
//        Given a non-empty array of integers nums, every element appears twice except for one.
//        Find that single one.
//        You must implement a solution with a linear runtime complexity and use only constant extra space.

public class SingleNumber {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4,5,5,7,7};
        Solution solution = new Solution();
        System.out.println(solution.singleNumber(arr));
    }

    static class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int i : nums) {
                result = result ^ i;
            }
            return result;
        }
    }
}
