package leetcode.easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {

    }

    // To be solved later
    static class Solution {
        public int[] frequencySort(int[] nums) {
            return null;
        }
    }


    static class Solution2 {
        public int[] frequencySort(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }

            List<Integer> list = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue()
                            .thenComparing(Map.Entry::getKey, Comparator.reverseOrder()))
                    .map(Map.Entry::getKey)
                    .toList();
            int index = 0;
            for (Integer i : list) {
                int count = map.get(i);
                for (int j = 0; j < count; j++) {
                    nums[index++] = i;
                }
            }
            return nums;
        }
    }
}
