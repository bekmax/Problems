package leetcode.easy;

// Leetcode problem N448
// Related Topic: Array, Hash Table
//        Given an array nums of n integers where nums[i] is in the range [1, n],
//        return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.*;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, 8, 6, 3, 2};

        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        Solution3 solution3 = new Solution3();
        List<Integer> list = solution3.findDisappearedNumbers(arr);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    // Solution with extra space and O(n) time
    static class Solution1 {
        public List<Integer> findDisappearedNumbers(int[] nums) {

            int[] list = new int[nums.length + 1];
            List<Integer> resList = new LinkedList<Integer>();

            for (int i = 0; i < nums.length; i++) {
                list[nums[i]] = -1;
            }

            for (int i = 1; i <= nums.length; i++) {
                if (list[i] != -1) {
                    resList.add(i);
                }
            }

            return resList;
        }
    }

    // Solution with O(1) space and O(N) time
    static class Solution2 {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]) - 1;

                nums[index] = nums[index] < 0 ? nums[index] : -nums[index];
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    list.add(i + 1);
                }
            }
            return list;
        }
    }

    // Solution with HashSet
    static class Solution3 {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int n = nums.length;
            Set<Integer> set = new HashSet<>();

            for (int i = 1; i <= n; i++) {
                set.add(i);
            }

            for (int i = 0; i < n; i++) {
                if (set.contains(nums[i])) {
                    set.remove(nums[i]);
                }
            }

            List<Integer> list = new LinkedList<>();
            for (Integer i : set) {
                list.add(i);
            }
            return list;
        }
    }
}
