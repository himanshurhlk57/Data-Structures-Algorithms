import java.util.*;
import java.lang.*;
import java.io.*;

// generic class to store any kind of data
//      1
//  2      3
//	  4 5 
    class BinaryTreeNode<T>{
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data){
		this.data = data;
	}
}


class WorkAtTech
{
	public static void printTree(BinaryTreeNode<Integer> root){
		if(root==null){
			return;
		}
		System.out.print(root.data + " ");
		printTree(root.left);
		printTree(root.right);
	}
		
		
	public static void main (String[] args) throws java.lang.Exception
	{
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
	BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
    BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
		root.left = rootLeft;
		root.right = rootRight;
		printTree(root);
		// BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
		// BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
		// rootLeft.right = twoRight;
		// rootRight.left = threeLeft;
		
		
	
	}
}



//Print Binary tree node data

import java.util.*;
import java.lang.*;
import java.io.*;

//      1
//  2      3
//	  4 5 
// Print format 
// 1:L2, R3
// 2:R4
// 4:
// 3:L5
// 5:
                
  class BinaryTreeNode{
	public int data;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int data){
		this.data = data;
	}
}


class WorkAtTech
{
	// public static void printTree(BinaryTreeNode root){
	// 	if(root==null){
	// 		return;
	// 	}
	// 	System.out.print(root.data + " ");
	// 	printTree(root.left);
	// 	printTree(root.right);
	// }
	
	public static void printTreeDetailed(BinaryTreeNode root){
		if(root==null){
			return;
		}
		System.out.print(root.data + ":");
		if(root.left!=null){
			System.out.print("L" + root.left.data + ", ");
		}
		if(root.right!=null){
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
		
		
	public static void main (String[] args) throws java.lang.Exception
	{
	BinaryTreeNode root = new BinaryTreeNode(1);
	BinaryTreeNode rootLeft = new BinaryTreeNode(2);
    BinaryTreeNode rootRight = new BinaryTreeNode(3);
	BinaryTreeNode twoRight = new BinaryTreeNode(4);
	BinaryTreeNode threeLeft = new BinaryTreeNode(5);
	root.left = rootLeft;
	root.right = rootRight;
	rootLeft.right = twoRight;
	rootRight.left = threeLeft;
	// printTree(root);
	printTreeDetailed(root);
		
		
	
	}
}





// Take input of binary tree node data and print the tree


import java.util.*;
import java.lang.*;
import java.io.*;

// taking input first enter root data then left root data then its left if it doesn't have any child will enter -1;
                
    class BinaryTreeNode{
	public int data;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	
	public BinaryTreeNode(int data){
		this.data = data;
	}
}


class WorkAtTech
{
	
    public static BinaryTreeNode takeTreeInput(){
		// System.out.println("Enter root data");
		Scanner scn = new Scanner(System.in);
		int rootData = scn.nextInt();
		
		if(rootData == -1){
			return null;
		}
		BinaryTreeNode root = new BinaryTreeNode(rootData);
		BinaryTreeNode leftChild = takeTreeInput();
		BinaryTreeNode rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	public static void printTreeDetailed(BinaryTreeNode root){
		if(root==null){
			return;
		}
		System.out.print(root.data + ":");
		if(root.left!=null){
			System.out.print("L" + root.left.data + ", ");
		}
		if(root.right!=null){
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
		
		
	public static void main (String[] args) throws java.lang.Exception
	{
		
	    BinaryTreeNode root = takeTreeInput();
		printTreeDetailed(root);
		
		
	
	}
}
