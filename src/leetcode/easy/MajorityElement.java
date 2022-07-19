package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Leetcode Problem N169
// Related Topic: Array, Hash Table, Divide and Conquer, Sorting, Counting
//        Given an array nums of size n, return the majority element.
//        The majority element is the element that appears more than ⌊n / 2⌋ times.
//        You may assume that the majority element always exists in the array.
public class MajorityElement {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 3, 4};

        int result = solution.majorityElement(arr);
        System.out.println(result);
    }

    static class Solution {
        public int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            int occurrence = nums.length / 2;

            for (int i : nums) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }

            Map.Entry<Integer, Integer> maxEntry = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (maxEntry == null || entry.getValue()
                        .compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }
            }
            return maxEntry.getKey();
        }
    }

    static class Solution2 {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length/2];
        }
    }
}
