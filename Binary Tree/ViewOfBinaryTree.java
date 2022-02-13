Left View of Binary Tree
Problem Statement:
There are different ways to look at a binary tree. The left view of a binary tree contains the set of nodes that will be visible if you look at the binary tree from the left side.

Given the root node of a binary tree, return an array containing the node elements in the left view, from top to bottom.


1- Solution BFS(Level Order traversal)


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
	
	// BFS(Level Order traversal)
	/* Will start level from level(0) in every level will add the first element of that level
	 * Using a level order traversal will get the queue currentSize and in that leve of size will add the first element to the list
	 * */
	
	
	int[] leftView(Node root) {
	    List<Integer> result = new ArrayList<>();
		Deque<Node> queue = new ArrayDeque<>();
		queue.add(root);
		while(!queue.isEmpty()){
			int currentSize = queue.size();
			for(int i = 0; i<currentSize; i++){
			Node currentNode = queue.poll();
				if(i==0){
			result.add(currentNode.data);
				}
				if(currentNode.left!=null){
					queue.offer(currentNode.left);
				}
				if(currentNode.right!=null){
					queue.offer(currentNode.right);
				}
			}
		}
		int[] answer = new int[result.size()];
		for(int i = 0; i<result.size(); i++){
			answer[i] = result.get(i);
		}
		return answer;
	}
}


2 - > DFS traversal(Preorder)

public static void leftViewUtil(Node root, List<Integer> result, int level){
    if(root == null){
        return;
    }
    if(level == result.size()){
        result.add(root.data);
    }
    leftViewUtil(root.left, result, level + 1);
    leftViewUtil(root.right, result, level + 1);
}

int[] leftView(Node root) {
    int level = 0;
    List<Integer> result = new ArrayList<>();
    leftViewUtil(root, result, level);
    int[] answer = new int[result.size()];
    for(int i = 0; i<result.size(); i++){
        answer[i] = result.get(i);
    }
    return answer;
}
}


2- > Right View of Binary Tree
Problem Statement:
There are different ways to look at a binary tree. The right view of a binary tree contains the set of nodes that will be visible if you look at the binary tree from the right side.

Given the root node of a binary tree, return an array containing the node elements in the right view, from top to bottom.


1- Solution BFS(Level Order);

Time Complexity: O(n)
Auxiliary Space Complexity: O(n)

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
	
	int[] rightView(Node root) {
	    List<Integer> result = new ArrayList<>();
		Deque<Node> queue = new ArrayDeque<>();
		queue.add(root);
		while(!queue.isEmpty()){
			int currentSize = queue.size();
			for(int i = 0; i<currentSize; i++){
			Node currentNode = queue.poll();
				if(i==currentSize-1){
			result.add(currentNode.data);
				}
				if(currentNode.left!=null){
					queue.offer(currentNode.left);
				}
				if(currentNode.right!=null){
					queue.offer(currentNode.right);
				}
			}
		}
		int[] answer = new int[result.size()];
		for(int i = 0; i<result.size(); i++){
			answer[i] = result.get(i);
		}
		return answer;
	}
}

2 - Solution DFS(Pre-Order)


public static void rightViewUtil(Node root, List<Integer> result, int level){
    if(root == null){
        return;
    }
    if(level == result.size()){
        result.add(root.data);
    }
    rightViewUtil(root.right, result, level + 1);
    rightViewUtil(root.left, result, level + 1);
}

int[] rightView(Node root) {
    int level = 0;
    List<Integer> result = new ArrayList<>();
    rightViewUtil(root, result, level);
    int[] answer = new int[result.size()];
    for(int i = 0; i<result.size(); i++){
        answer[i] = result.get(i);
    }
    return answer;
}
}