package leetcode.easy;

// Leetcode Problem N110
// Related Topic: Tree, Depth-First Search, Binary Tree
//        Given a binary tree, determine if it is height-balanced.
//        For this problem, a height-balanced binary tree is defined as:
//        a binary tree in which the left and right subtrees of every node
//        differ in height by no more than 1.

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isBalanced(TreeNode root) {
            if (root == null) return true;

            int depthLeft = calculateDepthOfTree(root.left);
            int depthRight = calculateDepthOfTree(root.right);

            return !(Math.abs(depthLeft - depthRight) > 1) && isBalanced(root.left) && isBalanced(root.right);
        }

        public int calculateDepthOfTree(TreeNode root) {
            if (root == null) return 0;

            int depthLeft = calculateDepthOfTree(root.left);
            int depthRight = calculateDepthOfTree(root.right);

            return 1 + Math.max(depthLeft, depthRight);
        }
    }
}
