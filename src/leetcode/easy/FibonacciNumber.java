package leetcode.easy;

// Leetcode Problem N509
// Related Topic: Math, Dynamic Programming, Recursion, Memoization
//        The Fibonacci numbers, commonly denoted F(n) form a sequence,
//        called the Fibonacci sequence, such that each number is the sum of the two preceding ones,
//        starting from 0 and 1. That is,
//            F(0) = 0, F(1) = 1
//            F(n) = F(n - 1) + F(n - 2), for n > 1.
//        Given n, calculate F(n).
public class FibonacciNumber {
    public static void main(String[] args) {

    }
    // Dynamic method
    static class Solution1 {
        public int fib(int n) {
            int f1 = 0;
            int f2 = 1;
            int f = f1 + f2;
            for (int i = 2; i <= n+1; i++) {
                f = f1 + f2;
                f1 = f2;
                f2 = f;
            }
            return f1;
        }
    }

    // Recursive Method
    static class Solution2 {
        public int fib(int n) {
            if (n == 0) return 0;
            if (n == 1) return 1;
            return fib(n - 1) + fib(n - 2);
        }
    }
}
