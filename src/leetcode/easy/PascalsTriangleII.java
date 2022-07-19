package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Leetcode Problem N119
// Related Topic: Array, Dynamic Programming
//        Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
//        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
public class PascalsTriangleII {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> list = solution.getRow(32);

        for(Integer i : list){
            System.out.print(i + " ");
        }
    }

    static class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<List<Integer>> pascal = new ArrayList<List<Integer>>();
            List<Integer> row1 = new ArrayList<>(Arrays.asList(1));
            List<Integer> row2 = new ArrayList<>(Arrays.asList(1, 1));
            pascal.add(row1);
            if (rowIndex == 0) return pascal.get(0);
            pascal.add(row2);
            if (rowIndex == 1) return pascal.get(1);

            for (int i = 2; i <= rowIndex; i++) {
                int size = pascal.get(i-1).size();
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for (int j = 1; j < size; j++) {
                    row.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
                }
                row.add(1);
                pascal.add(row);
            }
            return pascal.get(rowIndex);
        }
    }
}
