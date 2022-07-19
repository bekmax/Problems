package leetcode.easy;

// Leetcode Problem N1299
// Related Topic: Array
//        Given an array arr, replace every element in that array with the greatest
//        element among the elements to its right, and replace the last element with -1.
//        After doing so, return the array.
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] replaceElements(int[] arr) {
            int max = arr[arr.length - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                int num = arr[i];
                arr[i] = max;
                if (num > max) max = num;
            }
            arr[arr.length - 1] = -1;
            return arr;
        }
    }

    // Brute force
    static class Solution2 {
        public int[] replaceElements(int[] arr) {
            for (int i = 0; i < arr.length - 2; i++) {
                int max = arr[i + 1];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > max) max = arr[j];
                }
                arr[i] = max;
            }
            arr[arr.length - 1] = -1;
            return arr;
        }
    }
}
