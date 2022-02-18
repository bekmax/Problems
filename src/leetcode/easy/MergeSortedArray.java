package leetcode.easy;

// Leetcode Problem N88
// Related Topic: Array, Two Pointers, Sorting
//        You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
//        and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//        Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//        The final sorted array should not be returned by the function,
//        but instead be stored inside the array nums1. To accommodate this,
//        nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
//        and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

public class MergeSortedArray {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums1 = {0, 0};
        int[] nums2 = {4,6};
        solution.merge(nums1, 0, nums2, 2);
    }

    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int lastIndex = m + n - 1;

            while (m > 0 && n > 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[lastIndex] = nums1[m - 1];
                    m--;
                } else {
                    nums1[lastIndex] = nums2[n - 1];
                    n--;
                }
                lastIndex--;
            }

            while (n > 0) {
                nums1[lastIndex] = nums2[n-1];
                n--;
                lastIndex--;
            }

            print(nums1);
        }

        public void print(int[] arr){
            for (int i: arr){
                System.out.print(i + " ");
            }
        }
    }
}
