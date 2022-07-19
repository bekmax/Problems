package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

// Leetcode Problem N1748
//// Related Topic: Array, Hashtable, Counting
//        You are given an integer array nums.
//        The unique elements of an array are the elements that appear exactly once in the array.
//        Return the sum of all the unique elements of nums.
public class SumOfUniqueElements {
    public static void main(String[] args) {

    }

    static class Solution {
        public int sumOfUnique(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();

            for(int i: nums){
                if(map.containsKey(i)){
                    map.put(i, map.get(i)+1);
                } else{
                    map.put(i, 1);
                }
            }

            return map.entrySet()
                    .stream()
                    .filter(t->t.getValue() == 1)
                    .map(t-> t.getKey())
                    .reduce(0, Integer::sum);
        }
    }

    static class Solution2{
        public int sumOfUnique(int[] nums) {
            int[] arr = new int[101];

            for (int i = 0; i < nums.length; i++) {
                arr[nums[i]]++;
            }

            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) sum+= i;
            }
            return sum;
        }
    }
}
