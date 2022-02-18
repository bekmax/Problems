package leetcode.easy;

// Leetcode Problem N125
// Related Topic: Two Pointers, String
//        A phrase is a palindrome if, after converting all uppercase letters into
//        lowercase letters and removing all non-alphanumeric characters,
//        it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//        Given a string s, return true if it is a palindrome, or false otherwise.

public class ValidPalindrome {
    public static void main(String[] args) {

        Solution1 solution = new Solution1();
        String s = "A man, a plan, a canal: ?Panama";
        System.out.println(solution.isPalindrome(s));

        String s1 = "race a car";
        System.out.println(solution.isPalindrome(s1));

        String s2 = " ";
        System.out.println(solution.isPalindrome(s2));
    }

    static class Solution1 {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left < right){
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
                    left++;
                }
                while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
                    right--;
                }

                if(left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
