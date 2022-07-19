package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

// Leetcode Problem N383
// Related Topic: Hashtable, String, Counting
//        Given two strings ransomNote and magazine, return true if ransomNote can be
//        constructed by using the letters from magazine and false otherwise.
//        Each letter in magazine can only be used once in ransomNote.
public class RansomNote {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();
        String ransomNote = "aaa";
        String magazine = "aba";
        System.out.println(solution2.canConstruct(ransomNote, magazine));
    }

    // HashMap solution - slow
    static class Solution1 {
        public boolean canConstruct(String ransomNote, String magazine) {
            Map<Character, Integer> mMap = new HashMap<>();

            for (char m : magazine.toCharArray()) {
                mMap.put(m, mMap.getOrDefault(m, 0) + 1);
            }

            for (char r : ransomNote.toCharArray()) {
                if (!mMap.containsKey(r)) return false;
                if (mMap.get(r) == 0) return false;
                mMap.put(r, mMap.get(r) - 1);
            }
            return true;
        }
    }

    static class Solution2 {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] charArr = new int[26];

            for (char m : magazine.toCharArray()) {
                charArr[m - 'a']++;
            }

            for (char r : ransomNote.toCharArray()) {
                charArr[r - 'a']--;
                if (charArr[r - 'a'] < 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
