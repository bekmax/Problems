package leetcode.easy;

// Leetcode Problem N1979
// Related Topic: Array, Math, Number Theory
//        Given an integer array nums, return the greatest common divisor of the smallest
//        number and largest number in nums.
//        The greatest common divisor of two numbers is the largest positive integer
//        that evenly divides both numbers.
public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,4,5,6,7,8,9,10};

        System.out.println(solution.findGCD(arr));
    }

    static class Solution {
        public int findGCD(int[] nums) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) max = nums[i];
                if (nums[i] < min) min = nums[i];
            }

            int num;
            while (max % min > 0){
                num = max % min;
                max = min;
                min = num;
            }
            return min;
        }
    }
}
