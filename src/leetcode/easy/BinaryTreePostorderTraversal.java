package leetcode.easy;

// Leetcode Problem N145
// Related Topic: Stack, Tree, Depth-First Search, Binary Tree
//      Given the root of a binary tree, return the postorder traversal of its nodes' values.


import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {

        Solution solution = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        for (Integer i: solution.PostorderTraversal(root)){
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
        public List<Integer> PostorderTraversal(TreeNode root) {

            List<Integer> list = new LinkedList<>();
            getPostorderTraversal(root, list);

            return list;
        }

        public void getPostorderTraversal(TreeNode node, List<Integer> list){

            if(node == null) return;

            getPostorderTraversal(node.left, list);

            getPostorderTraversal(node.right, list);

            list.add(node.val);
        }
    }
}
