package leetcode.hard;

// Leetcode Problem N154
// Related Topic: Array, Binary Search
//        Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
//        For example, the array nums = [0,1,4,4,5,6,7] might become:
//        [4,5,6,7,0,1,4] if it was rotated 4 times.
//        [0,1,4,4,5,6,7] if it was rotated 7 times.
//        Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]]
//        1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
//        Given the sorted rotated array nums that may contain duplicates,
//        return the minimum element of this array.
//        You must decrease the overall operation steps as much as possible.

public class FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,3,3,1};
        System.out.println(solution.findMin(arr));
    }

    static class Solution {
        public int findMin(int[] nums) {
            if(nums[0]<nums[nums.length-1]) return nums[0];

            for(int i = 0; i<nums.length-1; i++)
                if(nums[i+1]<nums[i]) return nums[i+1];

            return nums[0];
        }
    }
}
