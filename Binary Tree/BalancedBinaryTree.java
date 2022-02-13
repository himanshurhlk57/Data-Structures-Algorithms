Balanced Binary Tree
Problem Statement:
A binary tree is considered balanced 
if the difference between the heights of the left and the right subtree is not more than 1 for any given node.

Given the root node of a binary tree, determine whether it's height balanced.






class Solution {
	/* This is the Node class definition
	
	class Node {
		public Node left;
		public Node right;
		public int data;

		public Node(int data) {
			this.data = data;
		}
	}
	*/
	int getDepth(Node root) {
		if(root == null) {
			return 0;
		}
		int leftSubtreeDepth = getDepth(root.left);
		int rightSubtreeDepth = getDepth(root.right);
		return Math.max(leftSubtreeDepth, rightSubtreeDepth) + 1;
	}
	boolean isBinaryTreeBalanced(Node root) {
	    if (root == null) {
			return true;
		}
		int leftSubtreeDepth = getDepth(root.left);
		int rightSubtreeDepth = getDepth(root.right);
		if(Math.abs(leftSubtreeDepth - rightSubtreeDepth) <= 1 && isBinaryTreeBalanced(root.left) && isBinaryTreeBalanced(root.right)) {
			return true;
		}
		return false;
	}
}
Optimal Approach
The 