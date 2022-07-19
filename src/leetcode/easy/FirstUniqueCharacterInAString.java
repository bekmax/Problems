package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

// Leetcode Problem N387
// Related Topic:
//        Given a string s, find the first non-repeating character in it and return its index.
//        If it does not exist, return -1.
public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "loveleutcodev";
        System.out.println(solution.firstUniqChar(s));
    }

    static class Solution {
        public int firstUniqChar(String s) {
            Map<Character, Integer> map = new HashMap<>();
            char[] charArr = s.toCharArray();
            for (char c : charArr) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for (int i = 0; i < charArr.length; i++) {
                if (map.get(charArr[i]) == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}
