package leetcode.easy;

// Leetcode Problem N1588
// Related Topic: Array, Math, Prefix Sum
//        Given an array of positive integers arr, calculate the sum of all possible odd-length subarrays.
//        A subarray is a contiguous subsequence of the array.
//        Return the sum of all odd-length subarrays of arr.

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {

    }

    static class Solution {
        public int sumOddLengthSubarrays(int[] arr) {

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    if (i == j) {
                        sum += arr[j];
                    } else if ((j - i) % 2 == 0) {
                        for (int k = i; k <= j; k++) {
                            sum += arr[k];
                        }
                    }
                }
            }
            return sum;
        }
    }
}
