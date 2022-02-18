package leetcode.easy;

// Leetcode Problem N2000
// Related Topic: Two Pointers, String
//        Given a 0-indexed string word and a character ch, reverse the segment of word that starts
//        at index 0 and ends at the index of the first occurrence of ch (inclusive).
//        If the character ch does not exist in word, do nothing.
//        For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that
//        starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
//        Return the resulting string.

public class ReversePrefixOfWord {
    public static void main(String[] args) {

    }

    static class Solution {
        public String reversePrefix(String word, char ch) {
            StringBuilder builder = new StringBuilder();
            int occurIndex = word.indexOf(ch);

            if (occurIndex == -1) return word;
            else {
                builder.append(word.substring(0, occurIndex + 1));
                builder.reverse();
                builder.append(word.substring(occurIndex + 1, word.length()));
            }

            return builder.toString();
        }
    }
}
