package leetcode.easy;

// Leetcode Problem N724
// Related Topic: Array, Prefix Sum
//        Given an array of integers nums, calculate the pivot index of this array.
//        The pivot index is the index where the sum of all the numbers strictly to
//        the left of the index is equal to the sum of all the numbers strictly to the index's right.
//        If the index is on the left edge of the array, then the left sum is 0 because
//        there are no elements to the left.
//        This also applies to the right edge of the array.
//        Return the leftmost pivot index. If no such index exists, return -1.
public class FindPivotIndex {
    public static void main(String[] args) {

    }

    static class Solution {
        public int pivotIndex(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int sumLeft = 0;
                int sumRight = 0;
                for (int j = i - 1; j >= 0; j--) {
                    sumLeft += nums[j];
                }
                for (int j = i + 1; j < nums.length; j++) {
                    sumRight += nums[j];
                }
                if (sumLeft == sumRight) return i;
            }
            return -1;
        }
    }

    static class Solution2 {
        public int pivotIndex(int[] nums) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int i = 1; i < nums.length; i++) {
                int num = nums[i];
                sumRight += num;
            }

            for (int i = 0; i < nums.length; i++) {
                if (sumLeft == sumRight) return i;
                sumLeft += nums[i];
                if (i != nums.length - 1) {
                    sumRight -= nums[i + 1];
                } else {
                    sumRight = 0;
                }
            }
            return -1;
        }
    }
}
