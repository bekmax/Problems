package leetcode.easy;

// Leetcode Problem N1431
// Related Topic: Array
//        There are n kids with candies. You are given an integer array candies,
//        where each candies[i] represents the number of candies the ith kid has,
//        and an integer extraCandies, denoting the number of extra candies that you have.
//        Return a boolean array result of length n, where result[i] is true if,
//        after giving the ith kid all the extraCandies,
//        they will have the greatest number of candies among all the kids, or false otherwise.
//        Note that multiple kids can have the greatest number of candies.

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

    }

    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

            List<Boolean> result = new ArrayList<Boolean>(candies.length + 1);

            int[] extraAdded = new int[candies.length];
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < candies.length; i++) {
                extraAdded[i] = candies[i] + extraCandies;
                result.add(false);
                if (candies[i] >= max) {
                    max = candies[i];
                }
            }

            for (int i = 0; i < candies.length; i++) {
                if (extraAdded[i] >= max) {
                    result.set(i, true);
                }
            }

            return result;
        }
    }
}
