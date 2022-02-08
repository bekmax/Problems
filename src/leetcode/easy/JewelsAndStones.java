package leetcode.easy;

// Leetcode Problem N771
// Related Topic: String, Hash Table
//        You're given strings jewels representing the types of stones that are jewels,
//        and stones representing the stones you have. Each character in stones
//        is a type of stone you have. You want to know how many of the stones you have are also jewels.
//        Letters are case-sensitive, so "a" is considered a different type of stone from "A".

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {

    }

    // Nested Loop approach
    static class Solution1 {
        public int numJewelsInStones(String jewels, String stones) {

            int count = 0;

            for (int i = 0; i < jewels.length(); i++) {
                for (int j = 0; j < stones.length(); j++) {
                    if (jewels.charAt(i) == stones.charAt(j)) {
                        count++;
                    }
                }
            }

            return count;
        }
    }

    // Using HashSet
    static class Solution2 {
        public int numJewelsInStones(String jewels, String stones) {
            Set<Character> jewelSet = new HashSet<>();
            int countOfJewels = 0;

            for (int i = 0; i < jewels.length(); i++) {
                jewelSet.add(jewels.charAt(i));
            }

            for (int i = 0; i < stones.length(); i++) {
                if (jewelSet.contains(stones.charAt(i))) {
                    countOfJewels++;
                }
            }

            return countOfJewels;
        }
    }
}
