package leetcode.medium;

// Leetcode Problem N49
// Related Topic: Array, Hashtable, String, Sorting
//        Given an array of strings strs, group the anagrams together.
//        You can return the answer in any order.
//        An Anagram is a word or phrase formed by rearranging the letters
//        of a different word or phrase, typically using all the original letters exactly once.

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(solution.groupAnagrams(strs));
    }

    // Solution using HashMap and Sorting
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String s : strs) {
                String sortedString = sortString(s);
                if (map.containsKey(sortedString)) {
                    map.get(sortedString).add(s);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(s);
                    map.put(sortedString, list);
                }
            }

            return new ArrayList<>(map.values());
        }

        public String sortString(String s) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return String.valueOf(ch);
        }
    }
}
