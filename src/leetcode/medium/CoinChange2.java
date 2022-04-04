package leetcode.medium;

// Leetcode Problem N518
// Related Topic: Array, Dynamic Programming
//        You are given an integer array coins representing coins of different denominations
//        and an integer amount representing a total amount of money.
//        Return the number of combinations that make up that amount.
//        If that amount of money cannot be made up by any combination of the coins, return 0.
//        You may assume that you have an infinite number of each kind of coin.
//        The answer is guaranteed to fit into a signed 32-bit integer.

public class CoinChange2 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int amount = 12;
        int[] coins = {1, 2, 5, 10, 20};

        System.out.println(solution.change(amount, coins));
    }

    static class Solution {
        public int change(int amount, int[] coins) {

            int[] dp = new int[amount + 1];
            dp[0] = 1;

            for (int c : coins) {
                for (int j = c; j <= amount; j++) {
                    dp[j] = dp[j] + dp[j - c];
                }
            }

            return dp[amount];
        }
    }
}
