// If you have given preorder, inorder traversal you can create unique binary tree

// If you have given postorder, inorder traversal you can create unique binary tree

// But if you have not given inorder traversal and only postorder or preorder then 
// you can't create unique binary tree, you can create lot of binary tree but not 
// unique binary tree.

1- Question>

// Construct Binary Tree from Preorder and Inorder Traversal
// Problem Statement:

// Given the preorder and inorder traversals of a binary tree, construct and return the binary tree.

// Example
// Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
// Output: [3,9,20,null,null,15,7] 


// Construct tree from preOrder and inOrder 

/* InOrder(Left, Root, Right) - > 40 20 50 10 60 30
   PreOrder(Root, Left, Right) -> 10 20 40 50 30 60

   10 is root got from Preorder 
   Search from 10 in inOrder -> 40 20 50(Left-subtree)   10(root)    60 30(right - subtree)
   Now from 40 20 50 root is 20 we get from Preorder 
   Search for 20 in Inorder and we get 40 is its left child and 50 is its right child
   For 30 and 60 we get 30 is root 
   search for 30 in inorder got 60 is its left child

   Finally the unique tree we made from these two traversal given is

        10
    20       30
40     50  60 



Pre-Order = [3,        9,           20,  15,  7]
           Root   left-subtree    right-subtree
                     preorder       preorder


In-order = [9,        3,           15,   20,   7]
        Left-subtree   root          right-subtree
        Inorder                       inorder     
    
We know pre and inorder of tree as well as pre and inorder of left
and right subtree

if we will give left inorder and left preorder to root left node it will itself
find its root and will create its own further tree

if we will give right inorder and right preorder to root right node it will itself
find its root and will create its own further tree

                       root
        left inorder            right inorder
        left preorder           right preorder

 preoder - [3, 9, 20, 15, 7]   
Pre-Order = [3,        9,           20,  15,  7]


 inorder - [9, 3, 15, 20, 7]   
 In-order = [9,      3,           15,      20,   7]
is - RootIndex-1    Root-index  Root-Index+1    le

Algorithm ->

 i-> Find root node from preorder
 ii> search for root node in-order



 code ->

 /* This is the Node class definition

class Node {
	public Node left;
    public Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
}
*/

class Solution {
	
	public static Node constructTreeUtil(int[] preorder, int[] inorder, int startIndexPre, int endIndexPre, int startIndexIn, int endIndexIn){
		
		
		if(startIndexPre > endIndexPre){
			return null;
		}
		
		int rootData = preorder[startIndexPre];
		
		Node root = new Node(rootData);
		
		int rootIndex = -1;
		for(int i = startIndexIn; i<=endIndexIn; i++){
			if(inorder[i] == rootData){
				rootIndex = i;
				break;
			}
		}
		
	     // start index and end index of left part of inorder
		int startIndexInLeft = startIndexIn;
		int endIndexInLeft = rootIndex - 1;
		
		// start index and end index of right part of inorder
		int startIndexInRight = rootIndex + 1;
		int endIndexInRight = endIndexIn;
		
		// int leftSubTreeLength = endIndexInLeft - startIndexInLeft + 1;
		
		// start index and end index of left part of preorder
		int startIndexPreLeft = startIndexPre + 1;  //startIndexPre in pre is root that's why startIndexPreLeft starts from startIndexPreLeft + 1
		
		// endIndexPreLeft - startIndexPreLeft = endIndexInLeft - startIndexInLeft;
		
		int endIndexPreLeft = endIndexInLeft - startIndexInLeft + startIndexPreLeft;
		
		// start index and end index of right part of preorder
		int startIndexPreRight = endIndexPreLeft + 1;
		int endIndexPreRight = endIndexPre;
		
		
		root.left = constructTreeUtil(preorder, inorder, startIndexPreLeft, endIndexPreLeft, startIndexInLeft, endIndexInLeft);
		root.right = constructTreeUtil(preorder, inorder, startIndexPreRight, endIndexPreRight, startIndexInRight, endIndexInRight);
		return root;
		
	}
	
	Node constructTree(int[] preorder, int[] inorder) {
    	Node root = constructTreeUtil(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
		return root;
	}
}

*/ 

/*
2nd Question -> Construct Binary Tree from Inorder and Postorder Traversal

Given two integer arrays inorder and postorder where inorder is the inorder 
traversal of a binary tree and postorder is the postorder traversal of the 
same tree, construct and return the binary tree.

Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]

Postorder (Left, Right, Root) [9,15,7,20,3]

we can get Root node from the postorder i.e last element in the postorder array(3)
Now search for the root element in inorder

Inorder (Left Root Right) [9,3,15,20,7]

After searching 3 in the inorder we get
             3
         9      15 20 7




    /* This is the Node class definition

class Node {
	public Node left;
    public Node right;
    int data;

    Node(int data) {
        this.data = data;
    }
}
*/

class Solution {
	
	Node constructTreeUtil(int[] postorder, int[] inorder, int startIndexPost, int endIndexPost, int startIndexIn, int endIndexIn){
		
		if(startIndexIn > endIndexIn){
			return null;
		}
		int rootData = postorder[endIndexPost];
		Node root = new Node(rootData);
		
		int rootIndex = -1;
		for(int i = startIndexIn; i<=endIndexIn; i++){
			if(inorder[i] == rootData){
				rootIndex = i;
				break;
			}
		}
	
		// endIndexInLeft - startIndexInLeft = endIndexPostLeft - startIndexPostLeft;
		// 	endIndexInLeft - startIndexInLeft + startIndexPostLeft = endIndexPostLeft;
		
		int startIndexPostLeft = startIndexPost;

			
		int startIndexInLeft = startIndexIn;
		int endIndexInLeft = rootIndex - 1;
			
		
		int endIndexPostRight =  endIndexPost - 1;
			
		int startIndexInRight = rootIndex + 1;
		int endIndexInRight = endIndexIn;
			
	    int endIndexPostLeft = endIndexInLeft - startIndexInLeft + startIndexPostLeft;
		
		int startIndexPostRight = endIndexPostLeft + 1;
		
		root.left = constructTreeUtil(postorder, inorder, startIndexPostLeft, endIndexPostLeft, startIndexInLeft, endIndexInLeft);
		root.right = constructTreeUtil(postorder, inorder, startIndexPostRight, endIndexPostRight, startIndexInRight, endIndexInRight);
		return root;
	}
	
	Node constructTree(int[] postorder, int[] inorder) {
    	Node root = constructTreeUtil(postorder, inorder, 0, postorder.length-1, 0, inorder.length-1);
		return root;
	}
}
 
