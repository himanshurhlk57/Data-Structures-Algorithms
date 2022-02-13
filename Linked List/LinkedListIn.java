

// Traditional way of printing node data of linked list

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

 

class WorkAtTech{
	 public static Node<Integer> createLinkedList(){
		Node<Integer> n1 = new Node<>(10); 
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
	    n1.next = n2;
	    n2.next = n3;
		n3.next = n4;
		n4.next = null;
	    return n1;
}

public static void print(Node<Integer> head){
	System.out.println(head.data);
	System.out.println(head.next.data);
	System.out.println(head.next.next.data);
	System.out.println(head.next.next.next.data);
     //Output 10 20 30 40
}



//  without using traditional syso to print all the node data 

public static void print1(Node<Integer> head){
	//Keep a variable that is used for iterating not head. Insted of moving head will move temp;
	// Head is a variable temp is a variable initail address of both head and temp will be same head will stay at first temp will move
	Node<Integer> temp = head;
  while(temp!=null){
	  System.out.print(temp.data + "->");
	  temp = temp.next;
  }
	System.out.println(); // Output 10->20->30->40->

}

// Length of linked list 

public static int lengthLinked(Node<Integer> head){
    int count = 0;
    Node<Integer> temp = head;
    while(temp!=null){
        count++;
        temp = temp.next;
    }
    return count; //output 4 length of the linkedList
}


	
	public static void main (String[] args) throws java.lang.Exception{

		Node<Integer> head = createLinkedList();
		print(head);
        print1(head);
				
	}
}
