Delete Node in a Binary Search Tree (BST)
Problem Statement:
Given the root node of a binary search tree and a key, remove the key from the tree and return the root node.

if the node to be deleted is leaf node simply return null 
if the node to be deleted has one child either left or right 
if the left child is not null then return right because right will be null and in this case
we can delete that node
if the right child is not null then return left child

if the node to be deleted has two child then find the predecssor of inordersuccesor
of that child and replace the node to be deleted with its predeccor or successor
and delete that node. 

code ->

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
	Node getInorderSuccessor(Node root){
		
    root = root.right;
    while(root != null && root.left != null) {
        root = root.left;
    }
    return root;
		
	}

	Node removeFromBst(Node root, int key) {
	    if(root == null){
			return null;
		}
        if(key > root.data){
			root.right = removeFromBst(root.right, key);
		}else if(key < root.data){
			root.left = removeFromBst(root.left, key);
		}else{
			if(root.left == null){
				return root.right;
			}
			if(root.right == null){
				return root.left;
			}
			
			Node inorderSuccessor = getInorderSuccessor(root);
			root.data = inorderSuccessor.data;
			root.right = removeFromBst(root.right, inorderSuccessor.data);
		}
		return root;
	}
}