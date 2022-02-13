// An array is a sequence of contiguous memory blocks. Arrays are extremely useful when we want to store data and access elements from random indexes. 
// The issue comes when we have to insert or delete an element from the array. We have to shift multiple elements and also need to ensure that the 
// array has enough space for the new element.

// To fix this, we need to have a data structure without contiguous memory blocks but through which we can sequentially iterate the data.
//  That's where Linked Lists come in.

// A linked list is a common data structure made of a chain of nodes in which each node contains a value and a pointer to the next node in the chain.



import java.util.*;
import java.lang.*;
import java.io.*;

// Want to print linked list of data 10 20 30 40
//Lets create a node class first
//In the node i will have the data and address of next node of type node
// A constructor that will receive the data and set the data of that node also the next node address
// idealy when we create a node its next point to null also we can set next to null value otherwise its default value is null only

// class Node{
// 	int data;
// 	Node next;
	
// 	Node(int data){
// 		this.data = data;
// 		this.next = null;
// 	}
// }


// class WorkAtTech
// {
// 	// Now lets hard code 4 node and assign the others node address with each other so that they can be a linked list so lets create first four node and then connect them;
// 	// after we create a linked list will be returing the head node to the main the head node will keep the track of all the node connected to it so will return the head node
// // after creating 4 different node we should connect them for that the first node should have the address of next node and so on so for that lets assign first node next to second node address
// 	// lastly return the head node

// 	public static Node createLinkedList(){
// 		    Node n1 = new Node(10);
// 			Node n2 = new Node(20);
// 			Node n3 = new Node(30);
// 			Node n4 = new Node(40);
// 		    n1.next = n2;
// 		    n2.next = n3;
// 		    n3.next = n4;
// 		    n4.next = null;
// 		    return n1;
		
// 	}
	
// 	// now lets write the function for printing the node;
// 	//first lets store the address of head node in temp so that the temp variable will move from first node till end and print it data and the head node should stay at the head;
// 	//temp will store the address of all the node starting from the head till the last node when temp is at last node and its next is null we should stop there so in the while condition we will write
// 	//and print the data of all the node starting from head
// 	// and move the temp to the next node by next node mean point to the next node address to temp 

// 	public static void printList(Node head){
// 		Node temp = head;
// 		while(temp!=null){
// 			System.out.print(temp.data + " ");
// 			temp = temp.next;
// 		}
// 		System.out.println();
// 	}
	
// 	// now lets call the create linked list method that will return the head node of the list and will receive in the main
// 	//also the print function that will print the linked list for that the received head node will send to the print function and it will print the whole linked list

// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		Node head = createLinkedList();
// 		printList(head);
// 	}
// }















import java.util.*;
import java.lang.*;
import java.io.*;

// Want to print linked list of data 10 20 30 40
//Lets create a node class first
//In the node i will have the data and address of next node of type node
// A constructor that will receive the data and set the data of that node also the next node address
// idealy when we create a node its next point to null also we can set next to null value otherwise its default value is null only

// class Node{
// 	int data;
// 	Node next;
	
// 	Node(int data){
// 		this.data = data;
// 		this.next = null;
// 	}
// }

 class Node<T>{
	T data;
	Node<T> next;
	 Node(T data){
		 this.data = data;
		 next = null;
	 }
}

class WorkAtTech
{
	// Now lets hard code 4 node and assign the others node address with each other so that they can be a linked list so lets create first four node and then connect them;
	// after we create a linked list will be returing the head node to the main the head node will keep the track of all the node connected to it so will return the head node
// after creating 4 different node we should connect them for that the first node should have the address of next node and so on so for that lets assign first node next to second node address
	// lastly return the head node

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
	
	// now lets write the function for printing the node;
	//first lets store the address of head node in temp so that the temp variable will move from first node till end and print it data and the head node should stay at the head;
	//temp will store the address of all the node starting from the head till the last node when temp is at last node and its next is null we should stop there so in the while condition we will write
	//and print the data of all the node starting from head
	// and move the temp to the next node by next node mean point to the next node address to temp 

	public static void printList(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	// now lets call the create linked list method that will return the head node of the list and will receive in the main
	//also the print function that will print the linked list for that the received head node will send to the print function

    // and it will print the whole linked list
    
	public static void main1(String[] args) throws java.lang.Exception
	{
		Node<Integer> head = createLinkedList();
		printList(head);
	}
}
