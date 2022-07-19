package leetcode.easy;

// Leetcode Problem N283
// Related Topic: Array, Two Pointers
//        Given an integer array nums, move all 0's to the end of it while maintaining
//        the relative order of the non-zero elements.
//        Note that you must do this in-place without making a copy of the array.
public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 0, 1, 0, 3, 12};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            int lastNonZeroFoundAt = 0;
            // If the current element is not 0, then we need to
            // append it just in front of last non 0 element we found.
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[lastNonZeroFoundAt++] = nums[i];
                }
            }
            // After we have finished processing new elements,
            // all the non-zero elements are already at beginning of array.
            // We just need to fill remaining array with 0's.
            for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
                nums[i] = 0;
            }

        }


    }
}
