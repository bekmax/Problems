package leetcode.easy;

// Leetcode Problem N144
// Related Topic: Stack, Tree, Depth-First Search, Binary Tree
//      Given the root of a binary tree, return the preorder traversal of its nodes' values.


import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {

        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        for (Integer i: solution.PreorderTraversal(root)){
            System.out.println(i);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Solution {
        public List<Integer> PreorderTraversal(TreeNode root) {

            List<Integer> list = new LinkedList<>();
            getPreorderTraversal(root, list);

            return list;
        }

        public void getPreorderTraversal(TreeNode node, List<Integer> list){

            if(node == null) return;

            list.add(node.val);

            getPreorderTraversal(node.left, list);

            getPreorderTraversal(node.right, list);

        }
    }
}
