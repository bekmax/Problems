package leetcode.easy;

// Leetcode problem N461
// Related Topic: Bit Manipulation
//        The Hamming distance between two integers is the number of
//        positions at which the corresponding bits are different.
//        Given two integers x and y, return the Hamming distance between them.

public class HammingDistance {
    public static void main(String[] args) {

        Solution1 solution1 = new Solution1();
        Solution2 solution2 = new Solution2();

        System.out.println(solution1.hammingDistance(3, 4));
    }

    // Bit Manipulation approach
    static class Solution1 {
        public int hammingDistance(int x, int y) {
            int diff = x ^ y;
            int result = 0;

            while (diff > 0) {
                result += diff & 1;
                diff >>= 1;
            }
            return result;
        }
    }

    // Solution with String
    static class Solution2 {
        public int hammingDistance(int x, int y) {

            int result = 0;

            String xString = Integer.toBinaryString(x);
            String xString32bit =
                    String.format("%32s", xString).replaceAll(" ", "0");

            String yString = Integer.toBinaryString(y);
            String yString32bit =
                    String.format("%32s", yString).replaceAll(" ", "0");

            for (int i = 0; i < xString32bit.length(); i++) {
                if (xString32bit.charAt(i) != yString32bit.charAt(i)) {
                    result++;
                }
            }
            return result;
        }
    }
}
