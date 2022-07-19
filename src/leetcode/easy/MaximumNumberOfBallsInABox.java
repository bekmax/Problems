package leetcode.easy;

// Leetcode Problem N1742
// Related Topic: Hashtable, Math, Counting
//        You are working in a ball factory where you have n balls numbered from lowLimit
//        up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1), and an infinite number
//        of boxes numbered from 1 to infinity.
//        Your job at this factory is to put each ball in the box with a number equal to the
//        sum of digits of the ball's number. For example, the ball number 321 will be put in
//        the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.
//        Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallsInABox {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.countBalls(1, 100000));
    }

    // HashMap approach - pretty slow
    static class Solution1 {
        public int countBalls(int lowLimit, int highLimit) {
            Map<Integer, Integer> map = new HashMap<>();
            int max = Integer.MIN_VALUE;

            for (int i = lowLimit; i <= highLimit; i++) {
                map.put(getDigitSum(i), map.getOrDefault(getDigitSum(i), 0) + 1);
                if (map.get(getDigitSum(i)) > max) {
                    max = map.get(getDigitSum(i));
                }
            }
            return max;
        }

        public int getDigitSum(int n) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }

    static class Solution2 {
        public int countBalls(int lowLimit, int highLimit) {
            int[] arr = new int[100001];
            int maxIndex = Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = lowLimit; i <= highLimit; i++) {
                int k = getDigitSum(i);
                if (maxIndex < k) maxIndex = k;
                arr[k]++;
            }
            for (int i = 0; i <= maxIndex; i++) {
                if (max < arr[i]) max = arr[i];
            }
            return max;
        }

        public int getDigitSum(int n) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
}
