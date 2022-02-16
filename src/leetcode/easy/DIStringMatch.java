package leetcode.easy;

// Leetcode Problem N942
// Related Topic: Array, Math, Two Pointers, String, Greedy
//        A permutation perm of n + 1 integers of all the integers
//        in the range [0, n] can be represented as a string s of length n where:
//        s[i] == 'I' if perm[i] < perm[i + 1], and
//        s[i] == 'D' if perm[i] > perm[i + 1].
//        Given a string s, reconstruct the permutation perm and return it.
//        If there are multiple valid permutations perm, return any of them.

public class DIStringMatch {
    public static void main(String[] args) {

    }

    static class Solution {
        public int[] diStringMatch(String s) {

            int lowCount = 0;
            int highCount = s.length();

            int[] resultArr = new int[s.length() + 1];

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'I') {
                    resultArr[i] = lowCount++;
                } else {
                    resultArr[i] = highCount--;
                }
            }

            resultArr[s.length()] = lowCount;

            return resultArr;
        }
    }
}
