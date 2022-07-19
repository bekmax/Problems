package leetcode.easy;

// Leetcode Problem N2206
// Related Topic: Array, Hashtable, Bit Manipulation, Counting
//        You are given an integer array nums consisting of 2 * n integers.
//        You need to divide nums into n pairs such that:
//        Each element belongs to exactly one pair.
//        The elements present in a pair are equal.
//        Return true if nums can be divided into n pairs, otherwise return false.
import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        int[] arr = {3, 2, 3, 2, 2, 2, 500, 500};

        System.out.println(solution2.divideArray(arr));
    }

    // Solution using HashMap - slow
    static class Solution1 {
        public boolean divideArray(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int n : nums) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() % 2 != 0) return false;
            }
            return true;
        }
    }

    // Simple solution - faster
    static class Solution2 {
        public boolean divideArray(int[] nums) {
            int[] arr = new int[501];

            for (int n : nums) {
                arr[n]++;
            }

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] % 2 != 0) return false;
            }
            return true;
        }
    }
}
