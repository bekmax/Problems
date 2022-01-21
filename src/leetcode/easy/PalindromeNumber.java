package leetcode.easy;

// Leetcode problem N9
// Related Topic: Math
//        Given an integer x, return true if x is palindrome integer.
//        An integer is a palindrome when it reads the same backward as forward.
//        For example, 121 is a palindrome while 123 is not.

public class PalindromeNumber {
    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();

        System.out.println(solution1.isPalindrome(222));
        System.out.println(solution2.isPalindrome(123));
    }

    static class Solution1 {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            } else if (x >= 0 && x <= 9) {
                return true;
            } else {
                int initialValue = x;
                int reversedValue = 0;

                while (x != 0) {
                    reversedValue = reversedValue * 10 + x % 10;
                    x = x / 10;
                }
                return initialValue == reversedValue;
            }
        }
    }

    static class Solution2 {
        public boolean isPalindrome(int x){
            String s = Integer.toString(x);
            int headIndex = 0;
            int tailIndex = s.length()-1;

            while(headIndex < tailIndex){
                if(s.charAt(headIndex) != s.charAt(tailIndex)){
                    return false;
                }
                headIndex++;
                tailIndex--;
            }
            return true;
        }
    }
}
