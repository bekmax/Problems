package leetcode.medium;

// Leetcode Problem N238
// Related Topic: Array, Prefix Sum
//        Given an integer array nums, return an array answer such that answer[i]
//        is equal to the product of all the elements of nums except nums[i].
//        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//        You must write an algorithm that runs in O(n) time and without using the division operation.

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        int[] arr = {1, 2, 3, 4};
        int[] result = solution2.productExceptSelf(arr);
        for (int r : result) {
            System.out.println(r);
        }
    }

    // Brute Force solution - Time Limit Exceeded
    static class Solution1 {
        public int[] productExceptSelf(int[] nums) {
            int[] resultArr = new int[nums.length];

            for (int i = 0; i < resultArr.length; i++) {
                int left = 1;
                int right = 1;

                for (int j = i - 1; j >= 0; j--) {
                    left *= nums[j];
                }
                for (int j = i + 1; j < nums.length; j++) {
                    right *= nums[j];
                }
                resultArr[i] = left * right;
            }
            return resultArr;
        }
    }

    static class Solution2 {
        public int[] productExceptSelf(int[] nums) {
            int[] resultArr = new int[nums.length];
            int[] left = new int[nums.length];
            int[] right = new int[nums.length];
            int leftMultiple = 1;
            int rightMultiple = 1;
            for (int i = 0; i < nums.length; i++) {
                left[i] = leftMultiple;
                leftMultiple *= nums[i];
            }
            for (int i = nums.length - 1; i >= 0; i--) {
                right[i] = rightMultiple;
                rightMultiple *= nums[i];
            }
            for (int i = 0; i < resultArr.length; i++) {
                resultArr[i] = left[i] * right[i];
            }
            return resultArr;
        }
    }
}
