package leetcode.easy;

// Leetcode Problem N404
// Related Topic: Tree, DFS, BFS, Binary Tree
//        Given the root of a binary tree, return the sum of all left leaves.
//        A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

public class SumOfLeftLeaves {
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
        public int sumOfLeftLeaves(TreeNode root) {
            int sum = 0;

            if (root != null) {
                if (isLeaf(root.left)) {
                    sum += root.left.val;
                } else {
                    sum += sumOfLeftLeaves(root.left);
                }

                sum += sumOfLeftLeaves(root.right);
            }
            return sum;
        }

        public boolean isLeaf(TreeNode node) {
            if (node == null) return false;
            if (node.left == null && node.right == null) return true;
            return false;
        }


    }
}
