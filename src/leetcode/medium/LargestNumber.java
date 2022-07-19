package leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

// Leetcode Problem N179
// Related Topic: String, Greedy, Sorting
//        Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
//        Since the result may be very large, so you need to return a string instead of an integer.
public class LargestNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {0, 0, 1, 3};
        System.out.println(solution.largestNumber(arr));
    }

    static class Solution {
        public String largestNumber(int[] nums) {
            String[] strArr = new String[nums.length];
            int index = 0;
            for (int i : nums) {
                strArr[index++] = String.valueOf(i);
            }

            Arrays.sort(strArr, new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    String s = s1 + s2;
                    String t = s2 + s1;
                    return t.compareTo(s);
                }
            });
            if (strArr[0].equals("0")) {
                return "0";
            }
            StringBuilder sb = new StringBuilder();
            for (String s : strArr) {
                sb.append(s);
            }
            return sb.toString();
        }
    }
}
