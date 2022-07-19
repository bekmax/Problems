package leetcode.easy;

// Leetcode Problem N228
// Related Topic: Array
//        You are given a sorted unique integer array nums.
//        A range [a,b] is the set of all integers from a to b (inclusive).
//        Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
//        That is, each element of nums is covered by exactly one of the ranges, and there is
//        no integer x such that x is in one of the ranges but not in nums.
//        Each range [a,b] in the list should be output as:
//        "a->b" if a != b
//        "a" if a == b

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 2, 3, 4, 6, 8, 9};
        int[] arr1 = {};
        System.out.println(solution.summaryRanges(arr1));
    }

    static class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> ranges = new ArrayList<>();
            if (nums.length != 0) {
                int a = nums[0];
                int b = nums[0];
                for (int i = 1; i < nums.length; i++) {
                    if (b != nums[i] - 1) {
                        if (a == b) {
                            ranges.add(""+a);
                        } else {
                            ranges.add(a + "->" + b);
                        }
                        a = nums[i];
                    }
                    b = nums[i];
                }
                if (a == b) {
                    ranges.add(""+a);
                } else {
                    ranges.add(a + "->" + b);
                }
            }

            return ranges;
        }
    }
}
