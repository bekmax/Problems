package leetcode.easy;

//Leetcode Problem N219
//Related Topic: Array, Hash Table, Sliding Window
//        Given an integer array nums and an integer k, return true if there are two distinct
//        indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,0,1,1};
        int k = 13;

        System.out.println(solution.containsNearbyDuplicate(arr, k));
    }

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> myMap = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (!myMap.containsKey(nums[i])) {
                    myMap.put(nums[i], i);
                } else {
                    if (Math.abs(i - myMap.get(nums[i])) <= k) {
                        return true;
                    } else {
                        myMap.put(nums[i], i);
                    }
                }
            }
            return false;
        }
    }
}
