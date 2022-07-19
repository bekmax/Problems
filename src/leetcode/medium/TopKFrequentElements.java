package leetcode.medium;

// Leetcode Problem N347
// Related Topic: Array, Hashtable, Divide and Conquer, Sorting, Heap(Priority Queue), Bucket Sort, Counting, QuickSelect
//    Given an integer array nums and an integer k,return the k most frequent elements.
//    You may return the answer in any order.

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequentElements {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3};
        int[] result = solution2.topKFrequent(arr, 2);
        for (int r : result) {
            System.out.println(r);
        }
    }

    //Super slow solution using HashMap, Stream and Comparator
    static class Solution1 {
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new TreeMap<>();
            //Step 1 - Insert data into treemap
            for (int n : nums) {
                if (map.containsKey(n)) {
                    map.put(n, map.get(n) + 1);
                } else {
                    map.put(n, 1);
                }
            }

            //Sorted list
            List<Integer> list = map.entrySet()
                    .stream()
                    .sorted((s, t) -> t.getValue().compareTo(s.getValue()))
                    .map(Map.Entry::getKey)
                    .toList();

            //Return the result
            int arrLength = Math.min(k, list.size());
            int[] arr = new int[arrLength];
            for (int i = 0; i < arrLength; i++) {
                arr[i] = list.get(i);
            }
            return arr;
        }
    }

    //Faster solution using Priority Queue
    static class Solution2 {
        public int[] topKFrequent(int[] nums, int k) {
            //Step 1 - Insert data into HashMap
            Map<Integer, Integer> map = new HashMap<>();
            for (int n : nums) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }

            //Step 2 - Insert k number of elements from HashMap to Priority Queue
            PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() -
                    e2.getValue());
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                minHeap.add(entry);
                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }

            // Step 3 - Gather data into a return array
            int[] resultArr = new int[minHeap.size()];
            int index = 0;
            while (!minHeap.isEmpty()) {
                resultArr[index++] = minHeap.poll().getKey();
            }
            return resultArr;
        }
    }
}
