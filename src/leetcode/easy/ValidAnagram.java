package leetcode.easy;

//Leetcode Problem N242
//Related Topic: Hash Table, String, Sorting
//        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
//        typically using all the original letters exactly once.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
        String s = "car";
        String t = "craa";

        System.out.println(solution1.isAnagram(s, t));
    }

    // Using HashMap
    static class Solution1 {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            HashMap<Character, Integer> sMap = new HashMap<>();
            HashMap<Character, Integer> tMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                if (!sMap.containsKey(s.charAt(i))) {
                    sMap.put(s.charAt(i), 1);
                } else {
                    sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
                }

                if (!tMap.containsKey(t.charAt(i))) {
                    tMap.put(t.charAt(i), 1);
                } else {
                    tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
                }
            }

            if (sMap.equals(tMap)) return true;
            return false;
        }
    }

    // Using Arrays sort
    static class Solution2 {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            char[] sArr = s.toCharArray();
            char[] tArr = t.toCharArray();

            Arrays.sort(sArr);
            Arrays.sort(tArr);

            for (int i = 0; i < sArr.length; i++) {
                if (sArr[i] != tArr[i]) return false;
            }
            return true;
        }
    }

}
