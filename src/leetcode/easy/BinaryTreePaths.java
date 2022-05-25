package leetcode.easy;

//Leetcode Problem N257
//Related Topic: String, Backtracking, Tree, DFS, Binary Tree
//        Given the root of a binary tree, return all root-to-leaf paths in any order.
//        A leaf is a node with no children.

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> paths = new ArrayList<>();
            if (root == null) return paths;

            gatherAllPathsInList(root, "", paths);
            return paths;
        }

        public void gatherAllPathsInList(TreeNode root, String path, List<String> paths) {
            path += root.val;
            if (root.left == null && root.right == null) {
                paths.add(path);
                return;
            }
            if (root.left != null) {
                gatherAllPathsInList(root.left, path + "->", paths);
            }
            if (root.right != null) {
                gatherAllPathsInList(root.right, path + "->", paths);
            }
        }

    }
}
