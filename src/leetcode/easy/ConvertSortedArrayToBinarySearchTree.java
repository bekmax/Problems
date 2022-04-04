package leetcode.easy;

// Leetcode Problem N108
// Related Topic: Array, Divide and Conquer, Tree, Binary Search Tree, Binary Tree
//        Given an integer array nums where the elements are sorted in ascending order,
//        convert it to a height-balanced binary search tree.
//        A height-balanced binary tree is a binary tree in which the depth of the two
//        subtrees of every node never differs by more than one.

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = {-10,-3,0,5,9};

        solution.sortedArrayToBST(arr);
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
        public TreeNode sortedArrayToBST(int[] nums) {
            if(nums == null || nums.length == 0){
                return null;
            }
            return sortedArrayToBST(nums, 0, nums.length-1);
        }

        public TreeNode sortedArrayToBST(int[] arr, int start, int end){
            if(start > end) return null;

            int mid = start + (end - start)/2;

            TreeNode node = new TreeNode(arr[mid]);

            node.left = sortedArrayToBST(arr, start, mid-1);
            node.right = sortedArrayToBST(arr, mid+1, end);

            return node;
        }
    }
}
