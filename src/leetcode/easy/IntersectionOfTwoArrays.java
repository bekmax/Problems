package leetcode.easy;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

// Leetcode Problem N349
// Related Topic: Array, Hashtable, Two Pointer, Binary Search, Sorting
//        Given two integer arrays nums1 and nums2, return an array of their intersection.
//        Each element in the result must be unique and you may return the result in any order.
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] res = solution.intersection(nums1, nums2);

        if (res != null) {
            for (int i : res) {
                System.out.println(i);
            }
        }
    }

    static class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> result = new HashSet<>();
            for (int n : nums1) {
                set1.add(n);
            }

            for (int n : nums2) {
                if (set1.contains(n)) {
                    result.add(n);
                }
            }

            int[] res = new int[result.size()];
            int index = 0;
            for (Integer i : result){
                res[index++] = i;
            }

            return res;
        }
    }
}
