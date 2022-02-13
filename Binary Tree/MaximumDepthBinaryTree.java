Given a binary tree, return its maximum depth.

The depth/height of a binary tree is the number of nodes from the root node to any of the leaf nodes. 
The maximum depth is the maximum of the depths across all the paths.

Calculate the maximum depth of the left subtree and the right subtree of the current root recursively. The maximum depth of the tree will be the maximum depth among the two subtrees + 1.

Analysis
Time Complexity: O(n)
Auxiliary Space Complexity: O(1)


class Solution {
	int getMaxDepth(Node root) {
    	if(root == null) {
			return 0;
		}
		int leftSubtreeDepth = getMaxDepth(root.left);
		int rightSubtreeDepth = getMaxDepth(root.right);
		return Math.max(leftSubtreeDepth, rightSubtreeDepth) + 1;
	}
}