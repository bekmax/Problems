package leetcode.easy;

// Leetcode Problem N1389
// Related Topic: Array, Simulation
//        Given two arrays of integers nums and index.
//        Your task is to create target array under the following rules:
//        Initially target array is empty.
//        From left to right read nums[i] and index[i],
//        insert at index index[i] the value nums[i] in target array.
//        Repeat the previous step until there are no elements to read in nums and index.
//        Return the target array.
//        It is guaranteed that the insertion operations will be valid.

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {

            int[] arr = {};
            for (int i = 0; i < index.length; i++) {
                int[] target = insert(arr, nums[i], index[i]);
                arr = target;
            }
            return arr;
        }

        public int[] insert(int[] arr, int val, int idx) {
            int[] newArr = new int[arr.length + 1];

            for (int i = 0; i < newArr.length; i++) {
                if (i < idx) {
                    newArr[i] = arr[i];
                } else if (i == idx) {
                    newArr[i] = val;
                } else {
                    newArr[i] = arr[i - 1];
                }
            }
            return newArr;
        }
    }
}
