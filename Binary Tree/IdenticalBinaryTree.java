If two binary trees share the exact same structure and have the same node values, they are considered identical.


The idea is to traverse both the trees recursively and check if every node and its children subtrees for both the trees are equal or not.

Analysis
Time Complexity: O(n + m)
Auxiliary Space Complexity: O(1)



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
	
	boolean areIdenticalTrees(Node root1, Node root2) {
	    if(root1 == null && root2 == null) {
			return true;
		}
		if(root1 == null || root2 == null) {
			return false;
		}
		if(root1.data != root2.data) {
			return false;
		}
		if(areIdenticalTrees(root1.left, root2.left) == false || areIdenticalTrees(root1.right, root2.right) == false) {
			return false;
		}
		return true;
	}
}