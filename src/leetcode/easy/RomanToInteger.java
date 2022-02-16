package leetcode.easy;

// Leetcode Problem N13
// Related Topic: Hash Table, Math, String
//        Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//            Symbol       Value
//            I             1
//            V             5
//            X             10
//            L             50
//            C             100
//            D             500
//            M             1000
//        For example, 2 is written as II in Roman numeral, just two one's added together.
//        12 is written as XII, which is simply X + II. The number 27 is written as XXVII,
//        which is XX + V + II.
//        Roman numerals are usually written largest to smallest from left to right.
//        However, the numeral for four is not IIII. Instead, the number four is written as IV.
//        Because the one is before the five we subtract it making four.
//        The same principle applies to the number nine, which is written as IX.
//        There are six instances where subtraction is used:
//
//            I can be placed before V (5) and X (10) to make 4 and 9.
//            X can be placed before L (50) and C (100) to make 40 and 90.
//            C can be placed before D (500) and M (1000) to make 400 and 900.
//            Given a roman numeral, convert it to an integer.


import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        Solution2 solution = new Solution2();

        int result = solution.romanToInt("LXVIII");

        System.out.println(result);
    }

    static class Solution {
        public int romanToInt(String s) {
            char[] charArr = s.toCharArray();
            int number = 0;
            int result = 0;

            for (int i = charArr.length - 1; i >= 0; i--) {
                switch (charArr[i]) {
                    case 'I': number = 1;   break;
                    case 'V': number = 5;   break;
                    case 'X': number = 10;  break;
                    case 'L': number = 50;  break;
                    case 'C': number = 100; break;
                    case 'D': number = 500; break;
                    case 'M': number = 1000; break;
                }

                if (4 * number < result) {
                    result -= number;
                } else {
                    result += number;
                }
            }
            return result;
        }
    }

    static class Solution2 {
        public int romanToInt(String s){
            Map<Character, Integer> rMap = new HashMap<>();
                rMap.put('I', 1);
                rMap.put('V', 5);
                rMap.put('X', 10);
                rMap.put('L', 50);
                rMap.put('C', 100);
                rMap.put('D', 500);
                rMap.put('M', 1000);

            int number = 0;
            int temp = 0;
            int result = (int) rMap.get(s.charAt(s.length()-1));

            for (int i = s.length()-2; i >= 0 ; i--) {
                number = (int) rMap.get(s.charAt(i));
                temp = (int) rMap.get(s.charAt(i+1));

                if(number < temp) result -= number;
                else result += number;
            }
            return result;
        }
    }
}
