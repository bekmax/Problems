package leetcode.easy;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// Leetcode Problem N1295
// Related Topic: Array
//  Given an array nums of integers, return how many of them contain an even number of digits.
public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12, 234, 54, 8765, 1};

        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();

        System.out.println(solution.findNumbers(arr));
        System.out.println(solution2.findNumbers(arr));
    }

    static class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int i : nums){
                if (hasEvenDigits(i)) count++;
            }
            return count;
        }

        public boolean hasEvenDigits(int n){
            int digits = 0;
            while (n > 0){
                n = n / 10;
                digits++;
            }
            return digits % 2 == 0;
        }
    }

    static class Solution2{
        public int findNumbers(int[] nums){
            return (int) IntStream.of(nums)
                    .boxed()
                    .map(t -> String.valueOf(t))
                    .filter(t -> t.length() % 2 == 0)
                    .count();
        }
    }
}
