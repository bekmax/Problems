package leetcode.easy;

// Leetcode Problem N1309
// Related Topic: String
//        You are given a string s formed by digits and '#'.
//        We want to map s to English lowercase characters as follows:
//        Characters ('a' to 'i') are represented by ('1' to '9') respectively.
//        Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
//        Return the string formed after mapping.
//        The test cases are generated so that a unique mapping will always exist.

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.freqAlphabets("10#14#20#123#5"));
    }

    static class Solution {
        public String freqAlphabets(String s) {
            StringBuilder builder = new StringBuilder();
            int i = s.length()-1;
            while (i>=0){
                if(s.charAt(i) == '#'){
                    builder.append((char)('a'+ (s.charAt(i-1)-'0')+(s.charAt(i-2)-'0')*10-1 ));
                    i-=3;
                }else{
                    builder.append((char)('a'+ (s.charAt(i)-'0')-1));
                    i--;
                }
            }
            return builder.reverse().toString();
        }
    }
}
