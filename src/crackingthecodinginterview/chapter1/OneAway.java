package crackingthecodinginterview.chapter1;

// There are three types of edits that can be performed on strings, insert a character,
// remove a character, or replace a character. Given two strings, write a function to check
// if they are one edit (zero edits) away.
public class OneAway {
    public static void main(String[] args) {
        String s1 = "pla";
        String s2 = "pta";

        System.out.println(isOneEditAway(s1, s2));
    }

    public static boolean isOneEditAway(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        if (Math.abs(s1.length() - s2.length()) > 1) return false;

        String str1 = s1.length() < s2.length() ? s1 : s2;
        String str2 = s1.length() < s2.length() ? s2 : s1;

        boolean foundDiff = false;
        int index1 = 0;
        int index2 = 0;

        while (index1 < str1.length() && index2 < str2.length()) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (foundDiff) return false;
                foundDiff = true;

                if (str1.length() == str2.length()) {
                    index1++;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }
}
