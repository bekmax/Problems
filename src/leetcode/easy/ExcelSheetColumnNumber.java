package leetcode.easy;

// Leetcode Problem N171
// Related Topic: Math, String
//    Given a string columnTitle that represents the column title as appears in an Excel sheet,
//    return its corresponding column number.
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.titleToNumber("ZY"));
    }

    static class Solution {
        public int titleToNumber(String columnTitle) {
            int num = 0;
            int degree = 0;
            for (int i = columnTitle.length()-1; i >= 0; i--) {
                num += ((int) Math.pow(26, degree++)) * (columnTitle.charAt(i) - 64);
            }
            return num;
        }
    }
}
