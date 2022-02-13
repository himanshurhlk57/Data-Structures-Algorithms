Given the root node of a binary search tree and a number k, find out if two nodes exist in the tree which add upto k.

i will be given access to the root node and need to find if there exists 
two node that sum to the the given target if exist return true else false

we have given access to the root node we can do any traversal on the given bst

will do inorder traversal because the inorder traversal of the bst will always 
be in the sorted order

will add the inorder traversal in the given arraylist 
because the arraylist is sorted can do two pointer approach to find there 
exist two array element in the arraylist that sum two given target in O(n)
time. 

Code ->

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

    T.C-> O(n) + O(n) 
    S.C-> O(n)

	static void inorderTraversal(List<Integer> traversal, Node root){
        if(root == null){
            return;
        }
        inorderTraversal(traversal, root.left);
        traversal.add(root.data);
        inorderTraversal(traversal, root.right);
    }
	
	boolean pairExists(Node root, int k) {
	List<Integer> traversal = new ArrayList<Integer>();
    inorderTraversal(traversal, root);
	 int start = 0;
	 int end = traversal.size()-1;
		while(start<end){
			if(traversal.get(start) + traversal.get(end) == k){
				return true;
			}else if(traversal.get(start) + traversal.get(end) > k){
				end--;
			}else{
				start++;
			}
		}
		return false;
	}
}