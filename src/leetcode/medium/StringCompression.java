package leetcode.medium;

//Leetcode Problem N443
//Related Topic: Two Pointer, String
//        Given an array of characters chars, compress it using the following algorithm:
//        Begin with an empty string s. For each group of consecutive repeating characters in chars:
//        If the group's length is 1, append the character to s.
//        Otherwise, append the character followed by the group's length.
//        The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
//        After you are done modifying the input array, return the new length of the array.
//        You must write an algorithm that uses only constant extra space.

public class StringCompression {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(solution.compress(chars));
    }

    static class Solution {
        public int compress(char[] chars) {
            String s = new String(chars);
            if (s == null || s.length() == 0) return 0;
            StringBuilder res = new StringBuilder();

            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                count++;

                if ((i + 1) >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
                    res.append(s.charAt(i));
                    StringBuilder sb = new StringBuilder();
                    if (count == 1) {
                        count = 0;
                        continue;
                    }
                    while (count > 0) {
                        sb.append(count % 10);
                        count /= 10;
                    }
                    res.append(sb.reverse());
                }
            }

            String compressed = res.toString();
            for (int i = 0; i < compressed.length(); i++) {
                chars[i] = compressed.charAt(i);
            }
            return compressed.length();
        }
    }
}
