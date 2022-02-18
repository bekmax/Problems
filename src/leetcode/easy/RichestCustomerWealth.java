package leetcode.easy;

// Leetcode Problem N1672
// Related Topic: Array, Matrix
//        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
//        the ith customer has in the jth bank. Return the wealth that the richest customer has.
//        A customer's wealth is the amount of money they have in all their bank accounts.
//        The richest customer is the customer that has the maximum wealth.

public class RichestCustomerWealth {
    public static void main(String[] args) {

    }

    static class Solution {
        public int maximumWealth(int[][] accounts) {
            int maxWealth = Integer.MIN_VALUE;
            int sum = 0;

            for (int i = 0; i < accounts.length; i++) {
                for (int j = 0; j < accounts[i].length; j++) {
                    sum += accounts[i][j];
                }
                if (maxWealth < sum) {
                    maxWealth = sum;
                }
                sum = 0;
            }

            return maxWealth;
        }
    }
}
