package leetcode.easy;

import java.util.*;

// Leetcode Problem N350
// Related Topic: Array, Hashtable, Two Pointer, Binary Search, Sorting
//        Given two integer arrays nums1 and nums2, return an array of their intersection.
//        Each element in the result must appear as many times as it shows in both arrays,
//        and you may return the result in any order.
public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        Solution1 solution1 = new Solution1();

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] res = solution1.intersect(nums1, nums2);

        if (res != null) {
            for (int i : res) {
                System.out.println(i);
            }
        }
    }

    static class Solution1 {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            List<Integer> list = new ArrayList<>();
            int index1 = 0;
            int index2 = 0;

            while (index1 < nums1.length && index2 < nums2.length) {
                if (nums1[index1] < nums2[index2]) {
                    index1++;
                } else if (nums1[index1] > nums2[index2]) {
                    index2++;
                } else {
                    list.add(nums1[index1]);
                    index1++;
                    index2++;
                }
            }

            int[] result = new int[list.size()];
            int index = 0;
            for (Integer i : list){
                result[index++] = i;
            }
            return result;
        }
    }


    // Hash Map approach - pretty slow and lots of code
    static class Solution2 {
        public int[] intersect(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map1 = new HashMap<>();
            Map<Integer, Integer> map2 = new HashMap<>();
            Map<Integer, Integer> result = new HashMap<>();
            for (int num : nums1) {
                if (map1.containsKey(num)) {
                    map1.put(num, map1.get(num) + 1);
                } else {
                    map1.put(num, 1);
                }
            }

            for (int num : nums2) {
                if (map2.containsKey(num)) {
                    map2.put(num, map2.get(num) + 1);
                } else {
                    map2.put(num, 1);
                }
            }
            int size = 0;
            for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
                if (map2.containsKey(entry.getKey())) {
                    result.put(entry.getKey(), Math.min(map2.get(entry.getKey()), entry.getValue()));
                    size += (int) Math.min(map2.get(entry.getKey()), entry.getValue());
                }
            }
            int[] res = new int[size];
            int index = 0;
            for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
                for (int i = 0; i < entry.getValue(); i++) {
                    res[index++] = entry.getKey();
                }
            }
            return res;
        }
    }
}
