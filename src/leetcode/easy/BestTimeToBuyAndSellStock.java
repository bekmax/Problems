package leetcode.easy;

// Leetcode Problem N121
// Related Topic: Array, Dynamic Programming
//        You are given an array prices where prices[i] is the price of a given stock on the ith day.
//        You want to maximize your profit by choosing a single day to buy one stock and choosing
//        a different day in the future to sell that stock.
//        Return the maximum profit you can achieve from this transaction.
//        If you cannot achieve any profit, return 0.

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] prices = {7,1,5,3,6,4};

        System.out.println(solution.maxProfit(prices));
    }

    static class Solution {
        public int maxProfit(int[] prices) {

            int minPrice = Integer.MAX_VALUE;
            int profit = 0;
            int profitSoFar = 0;

            for (int i = 0; i < prices.length; i++) {
                if(minPrice > prices[i]){
                    minPrice = prices[i];
                }
                profitSoFar = prices[i] - minPrice;

                if(profitSoFar > profit){
                    profit = profitSoFar;
                }
            }
            return profit;
        }
    }
}
