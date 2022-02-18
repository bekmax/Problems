package leetcode.easy;

// Leetcode Problem N1365
// Related Topic: Array, Hash Table, Sorting, Counting
//        Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
//        That is, for each nums[i] you have to count the number of
//        valid j's such that j != i and nums[j] < nums[i].
//        Return the answer in an array.


import java.util.*;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {8,1,2,2,3};
        int[] result = solution.smallerNumbersThanCurrent(arr);

        for (int i: result){
           System.out.print(i+" ");
        }
    }

    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] result = new int[nums.length];
            int count = 0;

            for (int i=0; i<nums.length; i++){
                for (int j=0; j<nums.length; j++){
                    if(i == j) continue;
                    if(nums[i]>nums[j]){
                        count++;
                    }
                }
                result[i] = count;
                count = 0;
            }

            return result;
        }
    }
}