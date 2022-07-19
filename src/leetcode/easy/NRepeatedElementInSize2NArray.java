package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class NRepeatedElementInSize2NArray {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        int[] arr = {2, 1, 2, 5, 3, 2};

        System.out.println(solution2.repeatedNTimes(arr));
    }

    // HashMap solution - slow
    static class Solution1 {
        public int repeatedNTimes(int[] nums) {
            int n = nums.length / 2;
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == n) {
                    return entry.getKey();
                }
            }
            throw new IllegalStateException("No solution!");
        }
    }

    // HashMap solution - fast
    static class Solution2 {
        public int repeatedNTimes(int[] nums) {
            int n = nums.length / 2;
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                if (!map.containsKey(num)) {
                    map.put(num, 1);
                } else {
                    return num;
                }
            }

            throw new IllegalStateException("No solution!");
        }
    }
}
