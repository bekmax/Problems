package leetcode.easy;

// Leetcode Problem N412
// Related Topic: Math, String, Simulation
//        Given an integer n, return a string array answer (1-indexed) where:
//        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i (as a string) if none of the above conditions are true.

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.fizzBuzz(20));
    }

    static class Solution {
        public List<String> fizzBuzz(int n) {
            List<String> res = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    res.add("FizzBuzz");
                } else if (i % 3 == 0) {
                    res.add("Fizz");
                } else if (i % 5 == 0) {
                    res.add("Buzz");
                } else {
                    res.add("" + i);
                }
            }
            return res;
        }
    }
}
