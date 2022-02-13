// Given the root node of a binary search tree and a key, 
// add the key in the tree and return the root node.

// Note: The tree contains only unique values. Assume that key does not already exist in the BST.


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
	
// if there is no node initially root is null so inserting key means
// create a new node of data key and return that
// if key is greater than root value then insert it into the right of the root
// else in the left and lastly return the root of the node.
	
	Node insertBst(Node root, int key) {
	    if(root == null){
			return new Node(key);
		}
		if(key>root.data){
			root.right = insertBst(root.right, key);
		}else{
			root.left = insertBst(root.left, key);
		}
		return root;
	}
}