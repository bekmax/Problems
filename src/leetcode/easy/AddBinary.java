package leetcode.easy;

// Leetcode Problem N67
// Related Topic: Math, String, Bit Manipulation, Simulation
//        Given two binary strings a and b, return their sum as a binary string.

public class AddBinary {
    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.addBinary("111", "101001"));
    }

    static class Solution {
        public String addBinary(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int aL = a.length() - 1;
            int bL = b.length() - 1;
            int carry = 0;

            while (aL >= 0 || bL >= 0) {
                int sum = carry;

                if (aL >= 0) {
                    sum += (int) (a.charAt(aL--) - '0');
                }

                if (bL >= 0) {
                    sum += (int) (b.charAt(bL--) - '0');

                }
                sb.insert(0, sum % 2);
                carry = sum / 2;
            }

            if (carry > 0) {
                sb.insert(0, carry);
            }
            return sb.toString();
        }
    }
}
