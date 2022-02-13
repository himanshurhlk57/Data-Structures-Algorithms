A binary tree is considered symmetric if it is a mirror image of itself, i.e, it is symmetric around its root node.

Given the root node of a binary tree, determine whether it's symmetric.



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
	boolean isSymmetric(Node root) {
	    if(root == null){
			return true;
		}
		return isSymmetricUtil(root.left, root.right);
	}
	
	boolean isSymmetricUtil(Node left, Node right){
		if(left == null && right == null){
			return true;
		}
        if(left == null || right == null){
			return false;
		}
		if(left.data!=right.data){
			return false;
		}
		if(isSymmetricUtil(left.left, right.right) == false){
			return false;
		}
		if( isSymmetricUtil(left.right, right.left) == false){
			return false;
		}
		return true;
	}
}