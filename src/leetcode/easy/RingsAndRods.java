package leetcode.easy;

// Leetcode Problem N2103
// Related Topic: Hash Table, String
//        There are n rings and each ring is either red, green, or blue.
//        The rings are distributed across ten rods labeled from 0 to 9.
//        You are given a string rings of length 2n that describes the n rings that are placed onto the rods.
//        Every two characters in rings forms a color-position pair that is used to describe each ring where:
//        The first character of the ith pair denotes the ith ring's color ('R', 'G', 'B').
//        The second character of the ith pair denotes the rod that the ith ring is placed on ('0' to '9').
//        For example, "R3G2B1" describes n == 3 rings: a red ring placed onto the rod labeled 3,
//        a green ring placed onto the rod labeled 2, and a blue ring placed onto the rod labeled 1.
//        Return the number of rods that have all three colors of rings on them.

import java.util.ArrayList;
import java.util.HashMap;

public class RingsAndRods {
    public static void main(String[] args) {

    }

    static class Solution {
        public int countPoints(String rings) {
            HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();

            for (int i = 0; i < rings.length(); i += 2) {
                String key = String.valueOf(rings.charAt(i + 1));
                String value = String.valueOf(rings.charAt(i));

                if (!hashMap.containsKey(key)) {
                    ArrayList<String> colors = new ArrayList<String>();
                    colors.add(value);
                    hashMap.put(key, colors);
                } else {
                    ArrayList<String> colors = hashMap.get(key);
                    if (!colors.contains(value)) {
                        colors.add(value);
                    }
                    hashMap.replace(key, colors);
                }
            }

            int count = 0;
            for (HashMap.Entry<String, ArrayList<String>> entry : hashMap.entrySet()) {
                if (entry.getValue().size() == 3) count++;
            }

            return count;

        }
    }
}
