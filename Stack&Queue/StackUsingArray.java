Implement a stack using an array as the underlying container.

The Stack class should support the following methods:

int size()
boolean isEmpty()
int top()
void push(int element)
void pop()

Analysis
Time Complexity: O(1) for all the operations
Space Complexity: O(1) for all the operations


import java.util.*;
import java.lang.*;
import java.io.*;

// Implement the Stack class
class Stack {
	private int data[];
	private int topIndex;
	
	
	public Stack(int capacity) {
		data = new int[capacity];
		topIndex = -1;
	}

	public boolean isEmpty(){
		if(topIndex == -1){  
			return true;
		}
		return false;
	}
	
	public int size(){
		return topIndex+1;
	}
	
	public int top(){
		if(topIndex == -1){  // or in short way retun topIndex == -1;
			return -1;
		}
		return data[topIndex];
	}
	
	public void push(int element){
		// If stack is full
		if(topIndex == data.length-1){ 
			return;
		}
//if my topindex is at 2 then definitely i will be pushing my element at 3 index so for that first increase the index value and then insert at that position
		
		topIndex++;
		data[topIndex] = element;
		
	}
	
	public void pop(){
		if(topIndex == -1){
			return;
		}
		topIndex--;
	}
}

class WorkAtTech {
	public static void main (String[] args){
		
		Stack stack = new Stack(8);	
// 		stack.push(10);
// 		stack.push(20);
// 		stack.push(30);
// 		stack.push(40);
// 		stack.push(50);
// 		stack.push(60);
// 		stack.push(20);
// 		stack.push(30);
	
		System.out.println(stack.top());
		// stack.pop();
		// System.out.println(stack.top());
		// System.out.println(stack.size());
		
		
	}
}



// Dynamic Stack 



import java.util.*;
import java.lang.*;
import java.io.*;

// Implement the Stack class
class Stack {
	private int data[];
	private int topIndex;
	private int size;
	
	
	public Stack(int capacity) {
		data = new int[capacity];
		topIndex = -1;
		size = 0;
	}

	public boolean isEmpty(){
		if(topIndex == -1){  
			return true;
		}
		return false;
	}
	
	public int size(){
		return topIndex+1;
	}
	
	public int top(){
		if(topIndex == -1){  // or in short way retun topIndex == -1;
			return -1;
		}
		return data[topIndex];
	}
	
	public void push(int element){
		// If stack is full then resize the given array in double the size copy all the previous element in new array and insert new element at the increasec index
		if(topIndex == data.length-1){ 
			int[] newArray = new int[2*data.length];
			for(int i = 0; i<data.length; i++){
				newArray[i] = data[i];
			}
			data = newArray;
			topIndex++;
			data[topIndex] = element;
		}
//if my topindex is at 2 then definitely i will be pushing my element at 3 index so for that first increase the index value and then insert at that position
		
		topIndex++;
		data[topIndex] = element;
		size++;
		
	}
	
	public void pop(){
		if(topIndex == -1){
			return;
		}
		topIndex--;
		size--;
	}
}

class WorkAtTech {
	public static void main (String[] args){
		
		Stack stack = new Stack(5);	
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(20);
		stack.push(30);
	
		System.out.println(stack.top());
		// stack.pop();
		// System.out.println(stack.top());
		// System.out.println(stack.size());
		
		
	}
}