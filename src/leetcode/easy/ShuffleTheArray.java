package leetcode.easy;

// Leetcode Problem N1470
// Related Topic: Array
//        Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//        Return the array in the form [x1,y1,x2,y2,...,xn,yn].

public class ShuffleTheArray {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] shuffle(int[] nums, int n) {

            int[] shuffledArray = new int[2*n];
            int j = 0;

            for(int i=0; i<n; i++){
                shuffledArray[j++] = nums[i];
                shuffledArray[j++] = nums[i+n];
            }

            return shuffledArray;
        }
    }
}
