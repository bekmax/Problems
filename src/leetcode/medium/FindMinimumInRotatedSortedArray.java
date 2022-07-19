package leetcode.medium;

// Leetcode Problem N153
// Related Topic: Array, Binary Search
//        Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
//        For example, the array nums = [0,1,2,4,5,6,7] might become:
//        [4,5,6,7,0,1,2] if it was rotated 4 times.
//        [0,1,2,4,5,6,7] if it was rotated 7 times.
//        Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]]
//        1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//        Given the sorted rotated array nums of unique elements, return the minimum element of this array.
//        You must write an algorithm that runs in O(log n) time.

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3};
        System.out.println(solution.findMin(arr));
    }

    static class Solution {
        public int findMin(int[] nums) {
            return binarySearch(nums, 0, nums.length - 1);
        }

        public int binarySearch(int[] nums, int left, int right) {
            if (right < left) {
                return nums[0];
            }
            if (right == left) {
                return nums[left];
            }

            int mid = left + (right - left) / 2;

            if (mid < right && nums[mid + 1] < nums[mid]) {
                return nums[mid + 1];
            }
            if (mid > left && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[right] > nums[mid]) {
                return binarySearch(nums, left, mid - 1);
            }
            return binarySearch(nums, mid + 1, right);
        }
    }
}
