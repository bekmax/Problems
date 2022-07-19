package leetcode.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Leetcode Problem N2215
// Related Topic: Array, Hashtable
//        Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
//        answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
//        answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
//        Note that the integers in the lists may be returned in any order.
public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            List<List<Integer>> res = new ArrayList<List<Integer>>();
            Set<Integer> setNums1 = new HashSet<>();
            for (int n : nums1) {
                setNums1.add(n);
            }
            Set<Integer> intersection = new HashSet<>();
            for (int n : nums2) {
                if (setNums1.contains(n)) {
                    intersection.add(n);
                }
            }

            Set<Integer> set1 = new HashSet<>();
            for (int i : nums1) {
                if (!intersection.contains(i)) {
                    set1.add(i);
                }
            }
            Set<Integer> set2 = new HashSet<>();
            for (int i : nums2) {
                if (!intersection.contains(i)) {
                    set2.add(i);
                }
            }

            res.add(set1.stream().toList());
            res.add(set2.stream().toList());
            return res;
        }
    }
}
