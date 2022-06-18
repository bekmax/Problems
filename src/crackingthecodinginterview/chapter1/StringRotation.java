package crackingthecodinginterview.chapter1;

//Assume you have a method isSubString which checks if one word is a substring of another.
//Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call
//to isSubString ("waterbottle" is a rotation of "erbottlewat")

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "water";
        String s2 = "aterw";

        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String s1s1 = s1 + s1;
        return isSubstring(s1s1, s2);
    }

    public static boolean isSubstring(String s1, String s2) {

        for (int i = 0; i < s1.length() - s2.length(); i++) {
            if (s1.startsWith(s2, i)) {
                return true;
            }
        }
        return false;
    }
}
