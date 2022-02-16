package leetcode.easy;

// Leetcode Problem N35
// Related Topic: Array, Binary Search
//        Given a sorted array of distinct integers and a target value,
//        return the index if the target is found.
//        If not, return the index where it would be if it were inserted in order.
//        You must write an algorithm with O(log n) runtime complexity.

public class SearchInsertPosition {
    public static void main(String[] args) {

    }

    static class Solution {
        public int searchInsert(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;
            int mid = left + ((right - left) / 2);
            while (left <= right) {
                mid = left + ((right - left) / 2);

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                }
            }
            return nums[mid] > target ? mid : mid + 1;
        }
    }
}
