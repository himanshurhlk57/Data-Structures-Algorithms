nvert Binary Tree
Problem Statement:
Given a binary tree, invert it.

Tree Inversion means that the left child becomes the right child and vice versa. This happens recursively for the subtrees.

Approach (BFS)
Traverse the given tree using level order traversal and swap the left and right child of each node.

Analysis
Time Complexity: O(n)
Auxiliary Space Complexity: O(n)


class Solution {
	void invertTree(Node root) {
    	Queue<Node> treeNodes = new LinkedList<Node> ();
		treeNodes.add(root);
		while (!treeNodes.isEmpty()) {
			Node currNode = treeNodes.peek();
			treeNodes.poll();
			Node tempNode = currNode.left;
			currNode.left = currNode.right;
			currNode.right = tempNode;
			if (currNode.left != null) {
				treeNodes.add(currNode.left);
			}
			if (currNode.right != null) {
				treeNodes.add(currNode.right);
			}
		}
	}
}



Approach (DFS)
The idea is to recursively invert each node's left and right subtree and then swap the left and right child of that node.

Analysis
Time Complexity: O(n)
Auxiliary Space Complexity: O(1)

// with help of recursion
// Go to the leftmost node 
// go to the rightmost node
// reached left most and right most node
// now swap the value of left and right node


class Solution {
	void invertTree(Node root) {
		
		if(root == null){
			return;
		}
		
    	invertTree(root.left);
		invertTree(root.right);
		
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
}