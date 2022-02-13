Inorder Predecessor -> Maximum from left subtree

Max from left
Go to node.left
go to rightmost node



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
	// Dry run ->
	
//                         6
// 				   2            9
// 		      1        5    8
// 				   4	 7		
// Inorder Traversal -> 1 2 4 5 6 7 8 9
// Case 1 -> For 4 ans is 2
// initally will keep initialPredecessor = null;
// 4 is less then equal to root data will move to left part reached 2 , 
// 4 is not less than 2 so 2 can be answer will assign initialPredecessor = 2;
// Now root = roo.right, at 5 root = root.right = null return initialPredecessor i.e 2 answer;

// Case 2-> 8!<=6 initialPredecessor = 6, root = root.right at 9, 8<=9, root = root.left at 8, 8<=8, root = root.left at 7 7!<=8 initialPredecessor = 7,
// 	root = root.right i.e null return initialPredecessor i.e 7 answer;

	Node findPredecessor(Node root, Node p) {
		
	    Node initialPredecessor = null;
		while(root!=null){
			if(p.data<=root.data){
			root = root.left;
			
		  }else{
				initialPredecessor = root;
				root = root.right;
			}
		}
		return initialPredecessor;
		
	}
}