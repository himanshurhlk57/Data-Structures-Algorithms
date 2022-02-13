// Traversing a tree means visiting each node of the tree in a particular order. We may want to do it to access, update, insert or delete certain nodes.

// Since a tree is a hierarchical data structure, it can be traversed in different ways (following a different order) unlike linear data structures like arrays, linked list, stack, and, queue.

// 1 -> Breadth-First Search

// i-> Level Order Traversal
// We can traverse the tree level-by-level. We first iterate the root followed by all the nodes in level 1 from left to right followed by the next set of levels. We may also want to iterate from right to left or in spiral order based on the use case.


// 2- > Depth-First Search

// i-> Pre-Order -> Root Left Right

// ii-> In-Order -> Left Root Right

// iii-> Post-Order -> Left Right Root
/*
                  1
			2          3
		4      5   

Pre-order -> [1,2,4,5,3]
In-order ->  [4,2,5,1,3]
Post-order -> [4,5,2,3,1]
Level-order -> [1,2,3,4,5]
 

*/
// 1- Question -> Given a binary tree, return the preorder traversal of its elements.

// /* This is the Node class definition

// class Node {
// 	public Node left;
//     public Node right;
//     int data;

//     Node(int data) {
//         this.data = data;
//     }
// }
// */

// class Solution {
//     void preOrderTraversal(Node node, List<Integer> preorder) {
//       if(node == null){
//           return;
//       } 
//       preorder.add(node.data); 
//       preOrderTraversal(node.left, preorder);
//       preOrderTraversal(node.right, preorder); 
//   }
  
//   List<Integer> getPreorderTraversal(Node root) {
//        List<Integer> preorder = new ArrayList<Integer>(); 
//        preOrderTraversal(root, preorder);
//        return preorder; 
//   }
// }


// 2-> Question -> Given a binary tree, return the inorder traversal of its elements.

// class Solution {
// 	void inOrderTraversal(Node node, List<Integer> inorder){
// 		if(node == null){
// 			return;
// 		}
// 		inOrderTraversal(node.left, inorder);
// 		inorder.add(node.data);
// 		inOrderTraversal(node.right, inorder);
		
// 	}
// 	List<Integer> getInorderTraversal(Node root) {
//     	List<Integer> inorder = new ArrayList<Integer>();
// 		inOrderTraversal(root, inorder);
// 		return inorder;
// 	}
// }

// 3-> Question -> Given a binary tree, return the postorder traversal of its elements.


// class Solution {
// 	void postOrderTraversal(Node node, List<Integer> postorder){
// 		if(node == null){
// 			return;
// 		}
// 		postOrderTraversal(node.left, postorder);
// 		postOrderTraversal(node.right, postorder);
// 		postorder.add(node.data);
		
// 	}
// 	List<Integer> getPostorderTraversal(Node root) {
//     	List<Integer> postorder = new ArrayList<Integer>();
// 		postOrderTraversal(root, postorder);
// 		return postorder;
// 	}
// }


// 4-> Question -> Given a binary tree, return the level-order traversal of its elements.
    //          2
    //     7        5
    // 2       6        9
    //     5      11  4

// 2 - 7 - 5 - 2 - 6 - 9 - 5 - 11 - 4


// 1-> enque the root node(2)
// Queue   [2                    ]
// Deque 2 and print it
// 2
// 2-> Add 2's child in queue i.e 7 and 5
// Queue   [7 5                   ]
// Deque 7 print it and add its children 7's children we only have access
// to node child when we are at that node
// Queue [5 2 6  ]
// Deque 5 print it add its child 
// [2 6 9]
// Deque 2 print it add its child no child
// [6 9 ]
// deque 6 print it add its child
// [9 5 11]
// Deque 9 print it add its child goes on.



class Solution {
	List<Integer> getLevelOrderTraversal(Node root) {
        Deque<Node> queue = new ArrayDeque<>();
		queue.add(root);
		List<Integer> levelOrder = new ArrayList<>();
		while(!queue.isEmpty()) {
			Node currentElement = queue.poll();
			levelOrder.add(currentElement.data);
			if(currentElement.left != null) {
				queue.add(currentElement.left);
			}
			if(currentElement.right != null) {
				queue.add(currentElement.right);
			}
		}	
		return levelOrder;
	}
}

