package leetcode.easy;

// Leetcode Problem N2094
// Related Topic: Array, Hashtable , Sorting, Enumeration
//        You are given an integer array digits, where each element is a digit.
//        The array may contain duplicates.
//        You need to find all the unique integers that follow the given requirements:
//        The integer consists of the concatenation of three elements from digits in any arbitrary order.
//        The integer does not have leading zeros.
//        The integer is even.
//        For example, if the given digits were [1, 2, 3], integers 132 and 312 follow the requirements.
//        Return a sorted array of the unique integers.


import java.util.*;

public class FindThreeDigitEvenNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 1, 3, 0};

        int[] result = solution.findEvenNumbers(arr);

        if (result != null) {
            for (int i : result) {
                System.out.print(i + " ");
            }
        }

    }

    static class Solution {
        public int[] findEvenNumbers(int[] digits) {
            Map<Integer, Integer> digitMap = new TreeMap<>();
            List<Integer> result = new ArrayList<>();
            for (int i : digits) {
                if (digitMap.containsKey(i)) {
                    digitMap.put(i, digitMap.get(i) + 1);
                } else {
                    digitMap.put(i, 1);
                }
            }

            Map<Integer, Integer> numMap;
            for (int i = 100; i < 1000; i += 2) {
                numMap = getNumberMap(i);
                if (checkTwoMaps(numMap, digitMap)) {
                    result.add(i);
                }
            }

            return result.stream().mapToInt(t -> t).toArray();
        }

        public boolean checkTwoMaps(Map<Integer, Integer> num, Map<Integer, Integer> digit) {
            for (Map.Entry<Integer, Integer> n : num.entrySet()) {
                if (!digit.containsKey(n.getKey())) return false;
                if (n.getValue() > digit.get(n.getKey())) {
                    return false;
                }
            }
            return true;
        }

        public Map<Integer, Integer> getNumberMap(int n) {
            Map<Integer, Integer> res = new TreeMap<>();
            while (n > 0) {
                int i = n % 10;
                n /= 10;
                if (res.containsKey(i)) {
                    res.put(i, res.get(i) + 1);
                } else {
                    res.put(i, 1);
                }
            }
            return res;
        }


    }
}
