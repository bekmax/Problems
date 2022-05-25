package leetcode.easy;

//Leetcode Problem N344
//Related Topic: Two Pointer, String, Recursion
//        Write a function that reverses a string. The input string is given as an array of characters s.
//        You must do this by modifying the input array in-place with O(1) extra memory.

public class ReverseString {
    public static void main(String[] args) {

        Solution solution = new Solution();
        char[] s = {'h','e','l','l','o'};
        solution.reverseString(s);

        System.out.println(s);
    }

    static class Solution {
        public void reverseString(char[] s) {
            int head = 0;
            int tail = s.length - 1;

            while (head < tail) {
                char c = s[head];
                s[head] = s[tail];
                s[tail] = c;
                head++;
                tail--;
            }
        }
    }
}
