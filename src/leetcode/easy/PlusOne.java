package leetcode.easy;

// Leetcode Problem N66
// Related Topic: Array, Math
//        You are given a large integer represented as an integer array digits,
//        where each digits[i] is the ith digit of the integer.
//        The digits are ordered from most significant to least significant in left-to-right order.
//        The large integer does not contain any leading 0's.
//        Increment the large integer by one and return the resulting array of digits.

public class PlusOne {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            int extra = 1;

            for (int i = digits.length - 1; i >= 0; i--) {
                int num = digits[i] + extra;
                if (num > 9) {
                    digits[i] = num % 10;
                    extra = (num - num % 10) / 10;
                } else {
                    digits[i] = num;
                    extra = 0;
                }
            }

            if (extra != 0) {
                int[] newArr = new int[digits.length + 1];
                newArr[0] = extra;
                for (int i = 0; i < digits.length; i++) {
                    newArr[i + 1] = digits[i];
                }
                return newArr;
            }
            return digits;
        }
    }
}
