package leetcode.easy;

//Leetcode Problem N217
//Related Topic: Array, Hash Table, Sorting
//        Given an integer array nums, return true if any value appears at least twice in the array,
//        and return false if every element is distinct.

import java.util.HashSet;

public class ContainsDuplicates {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,4,5,6,1};

        System.out.println(solution.containsDuplicate(arr));
    }

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> mySet = new HashSet<Integer>();

            for (int i : nums) {
                if (mySet.contains(i)) return true;
                else {
                    mySet.add(i);
                }
            }
            return false;
        }
    }
}
