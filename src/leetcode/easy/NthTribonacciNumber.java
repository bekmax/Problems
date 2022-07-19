package leetcode.easy;

// Leetcode Problem N1137
// Related Topic: Math, Dynamic Programming, Memoization
//        The Tribonacci sequence Tn is defined as follows:
//        T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
//        Given n, return the value of Tn.
public class NthTribonacciNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.tribonacci(5));
    }

    static class Solution {
        public int tribonacci(int n) {
            int t0 = 0;
            int t1 = 1;
            int t2 = 1;

            if (n == 0) return 0;
            if (n == 1) return 1;
            if (n == 2) return 1;

            for (int i = 3; i <= n; i++) {
                int t = t2 + t1 + t0;
                t0 = t1;
                t1 = t2;
                t2 = t;
            }
            return t2;
        }
    }
}
