package leetcode.easy;

// Leetcode Problem N168
// Related Topic: Math, String
//    Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

import java.util.ArrayList;
import java.util.List;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String res = solution.convertToTitle(28);
        System.out.println(res);
    }

    static class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder sb = new StringBuilder();
            while (columnNumber > 0){
                columnNumber--;
                int n = columnNumber % 26;
                columnNumber /= 26;
                char c = (char) ('A' + n);
                sb.append(c);
            }

            return sb.reverse().toString();
        }

    }
}
