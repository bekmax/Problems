package leetcode.easy;

// Leetcode Problem N1313
// Related Topic: Array
//        We are given a list nums of integers representing a list compressed with run-length encoding.
//        Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
//        For each such pair, there are freq elements with value val concatenated in a sublist.
//        Concatenate all the sub-lists from left to right to generate the decompressed list.
//        Return the decompressed list.

public class DecompressRLEList {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] decompressRLElist(int[] nums) {

            int count = 0;
            int cursor = 0;
            int value = 0;
            for(int i=0; i<nums.length-1; i+=2){
                count = count + nums[i];
            }

            int[] resultArr = new int[count];

            for(int j=0; j<nums.length-1; j+=2){
                value = nums[j+1];
                for(int k=0; k<nums[j]; k++){
                    resultArr[cursor++] = value;
                }
            }
            return resultArr;
        }
    }
}
