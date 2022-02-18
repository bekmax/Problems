package leetcode.easy;

// Leetcode Problem N1732
// Related Topic: Array, Prefix Sum
//        There is a biker going on a road trip.
//        The road trip consists of n + 1 points at different altitudes.
//        The biker starts his trip on point 0 with altitude equal 0.
//        You are given an integer array gain of length n where gain[i] is the net gain in
//        altitude between points i and i + 1 for all (0 <= i < n).
//        Return the highest altitude of a point.

public class FindTheHighestAltitude {
    public static void main(String[] args) {

    }

    static class Solution {
        public int largestAltitude(int[] gain) {
            int[] altitude = new int[gain.length + 1];
            altitude[0] = 0;
            for (int i = 1; i < altitude.length; i++) {
                altitude[i] = altitude[i - 1] + gain[i - 1];
            }

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < altitude.length; i++) {
                if (max < altitude[i]) {
                    max = altitude[i];
                }
            }

            return max;
        }
    }
}
