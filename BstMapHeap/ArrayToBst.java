// Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

// A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    // nums-> [-10, -3, 0, 5, 9];
    //          0    1  2  3  4
                 
    public static TreeNode createBinarySearchTree(int[] nums, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode newRoot = new TreeNode(nums[mid]);
        newRoot.left = createBinarySearchTree(nums, start, mid-1);
        newRoot.right = createBinarySearchTree(nums, mid+1, end);
        return newRoot;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = createBinarySearchTree(nums, 0, nums.length-1);
        return root;
    }
}