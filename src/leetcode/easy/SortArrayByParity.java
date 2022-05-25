package leetcode.easy;

//Leetcode Problem N905
//Related Topic: Array, Two Pointers, Sorting
//        Given an integer array nums, move all the even integers at the
//        beginning of the array followed by all the odd integers.
//        Return any array that satisfies this condition.

public class SortArrayByParity {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7,8,9};

        nums = solution.sortArrayByParity(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    static class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int head = 0;
            int tail = nums.length - 1;

            while (head < tail) {
                if (nums[head] % 2 == 0 && nums[tail] % 2 == 0) {
                    head++;
                } else if (nums[head] % 2 != 0 && nums[tail] % 2 != 0) {
                    tail--;
                } else if (nums[head] % 2 == 0 && nums[tail] % 2 != 0) {
                    head++;
                    tail--;
                } else {
                    int temp = nums[head];
                    nums[head] = nums[tail];
                    nums[tail] = temp;
                    head++;
                    tail--;
                }
            }
            return nums;
        }
    }
}
