package leetcode.easy;

// Leetcode Problem N202
// Related Topic: Hash Table, Math, Two Pointers
//        Write an algorithm to determine if a number n is happy.
//        A happy number is a number defined by the following process:
//        Starting with any positive integer, replace the number by the sum of the squares of its digits.
//        Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//        Those numbers for which this process ends in 1 are happy.
//        Return true if n is a happy number, and false if not.

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isHappy(2));
    }

    static class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> mySet = new HashSet<Integer>();
            while (n != 1) {
                if (!mySet.add(n)) return false;
                n = getNewNumber(n);
            }
            return true;
        }

        public int getNewNumber(int num) {
            int sum = 0;
            while (num != 0) {
                sum += (int) Math.pow(num % 10, 2);
                num /= 10;
            }
            return sum;
        }
    }
}
