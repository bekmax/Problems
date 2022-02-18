package leetcode.easy;

// Leetcode Problem N1572
// Related Topic: Array, Matrix
//        Given a square matrix mat, return the sum of the matrix diagonals.
//        Only include the sum of all the elements on the primary diagonal and
//        all the elements on the secondary diagonal that are not part of the primary diagonal.

public class MatrixDiagonalSum {
    public static void main(String[] args) {

    }

    static class Solution {
        public int diagonalSum(int[][] mat) {

            int sum = 0;
            int n = mat.length;
            if (mat.length % 2 == 0) {
                for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
                    sum += mat[i][i];
                    sum += mat[i][j];
                }
            } else {
                for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
                    sum += mat[i][i];
                    sum += mat[i][j];
                }
                sum -= mat[n / 2][n / 2];
            }

            return sum;
        }
    }
}
