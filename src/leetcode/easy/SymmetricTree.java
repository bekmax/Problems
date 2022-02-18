package leetcode.easy;

// Leetcode Problem N101
// Related Topic: Tree, Depth-First Search, Breadth-First Search, Binary Tree
//        Given the root of a binary tree, check whether it is a mirror of itself
//        (i.e., symmetric around its center).

public class SymmetricTree {
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
        public boolean isSymmetric(TreeNode root) {
            return isSameTree(root.left, root.right);
        }

        public boolean isSameTree(TreeNode a, TreeNode b){
            if (a == null && b == null) {
                return true;
            } else if (a == null || b == null) {
                return false;
            } else if (a.val != b.val) {
                return false;
            } else {
                return isSameTree(a.left, b.right) && isSameTree(a.right, b.left);
            }
        }
    }
}
