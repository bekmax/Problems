package leetcode.easy;

// Leetcode Problem N704
// Related Topic: Array, Binary Search
//        Given an array of integers nums which is sorted in ascending order, and an integer target,
//        write a function to search target in nums. If target exists, then return its index.
//        Otherwise, return -1. You must write an algorithm with O(log n) runtime complexity.
public class BinarySearch {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-1, 0, 3, 5, 9, 12};
        System.out.println(solution.search(arr, -1));
        System.out.println(solution.search(arr, 0));
        System.out.println(solution.search(arr, 3));
        System.out.println(solution.search(arr, 12));
    }

    static class Solution {
        public int search(int[] nums, int target) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        public int binarySearch(int[] arr, int l, int r, int target) {

            if (l <= r) {
                int mid = (r - l) / 2 + l;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    return binarySearch(arr, l, mid - 1, target);
                } else {
                    return binarySearch(arr, mid + 1, r, target);
                }
            } else {
                return -1;
            }

        }
    }
}
