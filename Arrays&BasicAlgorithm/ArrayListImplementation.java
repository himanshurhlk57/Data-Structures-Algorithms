import java.util.*;
import java.lang.*;
import java.io.*;

/* Dynamic Array Class(ArrayList) array size is dynamic we can increase and decrease size of array conventially 
 * in the dynamic array we can have functionality of adding an element to the array size functionality that gives the size of the array
 * One issue with Java ArrayList is that it does not work with primitive data types. You can create ArrayList only for class objects. We can use wrapper classes like Integer, Double, Boolean, etc to create an ArrayList of int, double and boolean data type. */

class DynamicArray{
	int[] container;
	int currentLength; //current length of the array right now no element is added
	
	DynamicArray(){
		container = new int[10]; // As soon as the object of DynamicArray is created this constructor will invoke and create                                       an array of size 10;
		currentLength = 0;  
	}                               // Assign currentLength value to 0 because there is no element in the array initially 
		void add(int element){
			if(currentLength == container.length){          // means this array is full we have reached last element;
			int[] temp = new int[container.length * 2];     // Because the previous array was full we had reached the last element now to add new element to the array we create a temp array of double the size of the container array then copy all the element of the container array to the temp array and assign container reference to the temp.
				for(int i = 0; i<container.length; i++){
					temp[i] = container[i];
				}
				container = temp; //Now container size is doubled

			}
			container[currentLength] = element;
			currentLength++;                    //Right now 0 to 9th index has been used up at the 10th index of container array add the new element
		}
	
	int get(int index){
		return container[index];
	}
	
	void set(int index, int element){
		container[index] = element;
	}
		
	
}

class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception{
       DynamicArray arr = new DynamicArray(); //As soon as the object is created arr of size 10 is created;
		for(int i = 0; i<100; i++){
			arr.add(i);
		}
		for(int i = 0; i<100; i++){
			System.out.println(arr.get(i));
		}
	}
}

/* ArrayList<int> not possible
 * ArrayList implements the list interface
 * List<Integer> arr = new ArrayList<>(); * 
 * arr.something and call the list methods directly ir-respective of arraylist and linkedlist; 
 * List is a very popular interface in java that exposes all the method we want to do on list we can work on list to interact with different kind of list like arraylist, linked ist etc.  
 * in the list there are certain methods that are there now the implemantions of that mehtods are in arraylist or linkedlist classes. */