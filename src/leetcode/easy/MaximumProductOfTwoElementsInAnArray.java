package leetcode.easy;

//Leetcode Problem N1464
//Related Topic: Array, Sorting, Heap(Priority Queue)
//        Given the array of integers nums, you will choose two different indices i and j of that array.
//        Return the maximum value of (nums[i]-1)*(nums[j]-1).

public class MaximumProductOfTwoElementsInAnArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,6,2,3,4,5};
        System.out.println(solution.maxProduct(arr));
    }

    static class Solution {
        public int maxProduct(int[] nums) {
            int max1 = nums[0];
            int index1 = 0;

            for (int i = 1; i < nums.length; i++) {
                if (max1 < nums[i]) {
                    max1 = nums[i];
                    index1 = i;
                }
            }

            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (i == index1) continue;
                if (max2 < nums[i]) {
                    max2 = nums[i];
                }
            }
            return (max1 - 1) * (max2 - 1);
        }
    }
}
