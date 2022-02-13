// Given the root node of a binary search tree and a key, return the
//  subtree rooted at the node containing the key. If it does not exist,
//   return null.

// Note: The tree contains only unique values.

// Which searching for the data in each level i am comparing with only 
// one node.
// So the time complexity will be O(height).
// In case of a balanced bst the height is h = logn (nearly).
// In case if it is a skewed bst the height will be O(n)

// Why height is logn?
// For a tree of height h the node count will go something like This
// 1+2+4+8+-----+2^h-1 = n
// 2^h-1 = n
// h = logn


// If the given root is the key we wanted to search will return that node then
// because its a bst will utilize its property will keep a check if the
// given key value is greater than the given node(root value) then will search
// in the right subtree of bst
// if the given key is smaller than the root node value then will search in the 
// left subtree of bst.


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

	Node searchBst(Node root, int key) {
	   if(root == null || root.data == key){
		   return root;
	   }
		if(key>root.data){
			return searchBst(root.right, key);
		}else{
			return searchBst(root.left, key);
		}
	}
}