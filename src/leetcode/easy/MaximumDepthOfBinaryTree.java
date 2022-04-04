package leetcode.easy;

// Leetcode Problem N104
// Related Topic: Tree, DFS, BFS, Binary Tree
//        Given the root of a binary tree, return its maximum depth.
//        A binary tree's maximum depth is the number of nodes along the
//        longest path from the root node down to the farthest leaf node.

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    static class TreeNode {
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

    static class Solution {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                int depth1 = maxDepth(root.left);
                int depth2 = maxDepth(root.right);

                return depth1 > depth2 ? depth1 + 1 : depth2 + 1;
            }
        }
    }
}
