package leetcode.easy;

// Leetcode Problem N2283
// Related Topic: Hashtable, String, Counting
//        You are given a 0-indexed string num of length n consisting of digits.
//        Return true if for every index i in the range 0 <= i < n, the digit i occurs
//        num[i] times in num, otherwise return false.
import java.util.HashMap;
import java.util.Map;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "5210010007";

        System.out.println(solution.digitCount(s));
    }

    static class Solution {
        public boolean digitCount(String num) {
            Map<Integer, Integer> map = new HashMap<>();
            char[] charArr = num.toCharArray();
            for (char c : charArr) {
                int a = Character.getNumericValue(c);
                map.put(a, map.getOrDefault(a, 0) + 1);
            }

            System.out.println(map);
            for (int i = 0; i < charArr.length; i++) {
                char c = charArr[i];
                int a = Character.getNumericValue(c);
                if (map.containsKey(i)) {
                    if (map.get(i) != a) {
                        return false;
                    }
                } else {
                    if (a != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
