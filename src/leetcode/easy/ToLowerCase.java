package leetcode.easy;

// Leetcode Problem N709
// Related Topic: String
//        Given a string s, return the string after replacing every
//        uppercase letter with the same lowercase letter.

public class ToLowerCase {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.toLowerCase("Hello"));
    }

    static class Solution {
        public String toLowerCase(String s) {
            char[] charArr = s.toCharArray();

            for (int i = 0; i < charArr.length; i++){
                if(charArr[i] >= 65 && charArr[i] <=90){
                    charArr[i] = (char) (charArr[i] + 32);
                }
            }

            return new String(charArr);
        }
    }
}
