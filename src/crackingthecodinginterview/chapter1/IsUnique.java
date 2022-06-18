package crackingthecodinginterview.chapter1;

// Implement an algorithm to determine if a string has all unique characters
// What if you cannot use additional datastructures

import java.util.HashSet;

public class IsUnique {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "what's up";
        System.out.println(isUniqueChar(s1));
        System.out.println(isUniqueChar(s2));

        System.out.println(isUniqueChar2(s1));
        System.out.println(isUniqueChar2(s2));

        System.out.println(isUniqueChar3(s1));
        System.out.println(isUniqueChar3(s2));
    }

    // Implements HashSet
    // Time Complexity  O(N)
    // Space Complexity O(N)
    public static boolean isUniqueChar(String s) {
        HashSet<Character> characterHashSet = new HashSet<Character>();

        for (char c : s.toCharArray()) {
            if (!characterHashSet.contains(c)) {
                characterHashSet.add(c);
            } else {
                return false;
            }
        }
        return true;
    }

    // Implements nested for loops
    // Time Complexity O(N*N)
    // Space Complexity O(1);
    public static boolean isUniqueChar2(String s) {
        char[] charArr = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (charArr[i] == charArr[j]) return false;
            }
        }
        return true;
    }

    // We assume that string is based on ASCII characters
    // so there can be at most 128 unique characters
    // Time Complexity O(N), possibly O(1)
    // Space Complexity O(1)
    public static boolean isUniqueChar3(String s) {
        if (s.length() > 128) return false;

        boolean[] arr = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (arr[val]) return false;
            arr[val] = true;
        }
        return true;
    }
}
