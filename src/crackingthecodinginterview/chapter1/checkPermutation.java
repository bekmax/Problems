package crackingthecodinginterview.chapter1;

// Given two strings write a method to decide if one is a permutation of the other

import java.util.Arrays;

public class checkPermutation {
    public static void main(String[] args) {
        String s1 = "toyota";
        String s2 = "yotota";

        System.out.println(isPermutation(s1, s2));

        System.out.println(isPermutation2(s1, s2));
    }

    // We use sorting character arrays
    // Time Complexity O(NlogN)
    // Space Complexity O(1)
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        for (int i = 0; i < charArr1.length; i++) {
            if (charArr1[i] != charArr2[i]) return false;
        }
        return true;
    }

    // We use ASCII character set
    // Time Complexity O(N)
    // Space Complexity O(1)
    public static boolean isPermutation2(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] charArray = new int[128];

        for (int i = 0; i < s1.length(); i++) {
            charArray[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            charArray[s1.charAt(i)]--;
            if (charArray[s1.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }
}
