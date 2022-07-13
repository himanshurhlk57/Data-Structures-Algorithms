import java.util.*;
import java.lang.*;
import java.io.*;

//   class Node{
// 	int data;
// 	Node next;
// 	 Node(int data){
// 		 this.data = data;
// 		 next = null;
// 	 }
// }
  class Node<T>{
	T data;
	Node<T> next;
	 Node(T data){
		 this.data = data;
		 next = null;
	 }
}

 
// Take input of the linkedList 2 3 4 5 -1(Indicating we have to stop)
//Print 2 3 4 5

class WorkAtTech{
	     public static Node<Integer> takeInput(){
		 Scanner scn = new Scanner(System.in);
		 int data = scn.nextInt();
		 Node<Integer> head = null;
		 while(data!=-1){
			 Node<Integer> currentNode = new Node<Integer>(data);
			 if(head==null){
				 head = currentNode;
			 }
			 else{
				 Node<Integer> tail = head;
				 while(tail.next != null){
					 tail = tail.next;
				 }
				 tail.next = currentNode;
			 }
			 data = scn.nextInt();
		 }
			 return head;    
}

   public static void print(Node<Integer> head){
	  Node<Integer> temp = head;
      while(temp!=null){
	  System.out.print(temp.data + " ");
	  temp = temp.next;
  }
	System.out.println();
}

	public static void main (String[] args) throws java.lang.Exception{

		Node<Integer> head = takeInput();
		print(head);		
	}
}



// Optimize way of taking input of linkedList node data

import java.util.*;
import java.lang.*;
import java.io.*;

//  class Node{
// 	int data;
// 	Node next;
// 	 Node(int data){
// 		 this.data = data;
// 		 next = null;
// 	 }
// }
  class Node<T>{
	T data;
	Node<T> next;
	 Node(T data){
		 this.data = data;
		 next = null;
	 }
}




 
// Take input of the linkedList 2 3 4 5 -1(Indicating we have to stop)
//Print 2 3 4 5

class WorkAtTech{
	     public static Node<Integer> takeInput(){
		 Scanner scn = new Scanner(System.in);
		 int data = scn.nextInt();
		 Node<Integer> head = null;
		 Node<Integer> tail = null;
		 while(data!=-1){
			 Node<Integer> currentNode = new Node<Integer>(data);
			 if(head==null){
				 head = currentNode;
				 tail = currentNode;
			 }
			 else{
				tail.next = currentNode;
				tail = currentNode;
			 }
			 data = scn.nextInt();
		 }
			 return head;    
}

   public static void print(Node<Integer> head){
	  Node<Integer> temp = head;
      while(temp!=null){
	  System.out.print(temp.data + " ");
	  temp = temp.next;
  }
	System.out.println();
}

	public static void main (String[] args) throws java.lang.Exception{

		Node<Integer> head = takeInput();
		print(head);		
	}
}