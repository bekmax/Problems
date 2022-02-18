package leetcode.easy;

// Leetcode Problem N1512
// Related Topic: Array, HashTable, Math, Counting
//        Given an array of integers nums, return the number of good pairs.
//        A pair (i, j) is called good if nums[i] == nums[j] and i < j.

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {

    }

    static class Solution1 {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;
            for(int i=0; i<nums.length-1; i++){
                for (int j=i+1; j<nums.length; j++){
                    if(nums[i] == nums[j] && i<j){
                        count++;
                    }
                }
            }
            return count;
        }
    }

    static class Solution2 {
        public int numIdenticalPairs(int[] nums) {
            int count = 0;

            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if(!map.containsKey(nums[i])){
                    map.put(nums[i], 0);
                }
                else{
                    map.put(nums[i], map.get(nums[i])+1);
                    count += map.get(nums[i]);
                }
            }

            return count;
        }
    }
}
