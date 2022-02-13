Inorder successsor -> Minimum from right subtree
minimum from right
go to node.right
go to leftmost node

/*
The inorder successor of a node p is the node q that comes just after p in the binary tree's inorder traversal.

Given the root node of a binary search tree and the node p, find the inorder successor of node p. If it does not exist, return null.

                        6
                    2          9
                1       5    8
                    4      7
                
Inorder successor of 2 is 4
Inorder traversal of the given tree(Left Root Right) -> 1 2 4 5 6 7 8 9
Successor of 2 is just next element to it i.e 4

To find inorder successor we first go right then start going left

when we do the inorder traversal we first traverse left subtree then root then right subtree

inorder successor is in the right subtree only 
The first node of that will be traversal in the right subtree will be
the successor of the root node


Binary Search Tree   
                        
                        5
         3                             7
   2           4                6              9
1                                         8          10      

Inorder Traversal -> 1 2 3 4 5 6 7 8 9 10

Inorder successor of 8 is 9

For 8 we want immediate greater node then 8
so the successor will be in the right subtree because in the left subtree
node will be smaller than 8.
Initially successor will be null as soon as we find the immediate greater 
element than 8 will update successor

successor - null;
so we reaced 7 its not greater than will not update 
reached 9 update successsor go left reached 8 go right null so will return from that

               
                        5
         2                             7
   1           4                6              9
        3                                 8          10      

4's left child is 3
Inorder traversal -> 1 2 3 4 5 6 7 8 9 10
successor of 3 is 4
we are at 5 i.e root
successor = 5 (5 can  be successsor 3)
beacuse 3 is smaller than 5 wil go to left side
reached 2 will not update we need greater value so go to right 
reached 4 successor = 4 but we can get smaller than 4 and greater then 3
so go left reached 3 then right null ultimately the answer is 4

T.C = O(h), S.C = O(1)

*/

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

	Node findSuccessor(Node root, Node p) {
	    Node initialSuccessor = null;
		while(root != null){
			if(p.data >= root.data){
				root = root.right;
			}else{
				initialSuccessor = root;
				root = root.left;
			}
		}
		return initialSuccessor;
	}
}