package leetcode.easy;

// Leetcode Problem N118
// Related Topic: Array, Dynamic Programming
//        Given an integer numRows, return the first numRows of Pascal's triangle.
//        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> listOfLists = solution.generate(5);

        for (List<Integer> l : listOfLists) {
            System.out.println(l);
        }
    }
    // Has a particular generate method
    static class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> pascal = new ArrayList<List<Integer>>();
            List<Integer> row1 = new ArrayList<>(Arrays.asList(1));
            List<Integer> row2 = new ArrayList<>(Arrays.asList(1, 1));
            pascal.add(row1);
            if (numRows == 1) return pascal;
            pascal.add(row2);
            if (numRows == 2) return pascal;

            for (int i = 2; i < numRows; i++) {
                int size = pascal.get(i-1).size();
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for (int j = 1; j < size; j++) {
                    row.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
                }
                row.add(1);
                pascal.add(row);
            }
            return pascal;
        }
    }
}
