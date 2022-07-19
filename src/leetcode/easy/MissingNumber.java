package leetcode.easy;

// Leetcode Problem N268
// Related Topic: Array, Hashtable, Math, Binary Search, Bit Manipulation, Sorting
//        Given an array nums containing n distinct numbers in the range [0, n],
//        return the only number in the range that is missing from the array.
public class MissingNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 0, 1};
        System.out.println(solution.missingNumber(arr));
    }

    static class Solution {
        public int missingNumber(int[] nums) {
            int[] arr = new int[nums.length + 1];

            for (int i = 0; i < nums.length; i++) {
                arr[nums[i]]++;
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) return i;
            }
            throw new IllegalStateException();
        }
    }
}
