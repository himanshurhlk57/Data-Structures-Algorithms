// Given a sorted array and a number key, find the index of the first and last occurrence of the key in the array.

// If the key is not present, return [-1, -1].

// Expected Time Complexity: O(log n)

// Examples
// Array: [1, 2, 3, 3, 3, 4, 4, 5]
// Number: 3
// Answer: [2, 4]

// A simple solution is to iterate the array and return the first and last occurrence of the key and if the key is not present return [-1, -1].

// Analysis
// Time Complexity: O(n)
// Space Complexity: O(1)

// import java.util.*;
// import java.lang.*;
// import java.io.*;


class WorkAtTech
{
	
	public static int firstOccurence(int[] arr, int target){
		  int firstIndex = -1;
		for(int i = 0; i<arr.length; i++){
			if(arr[i] == target){
				firstIndex = i;
				break;
			}
		}
		return firstIndex;
	}
	
	public static int lastOccurence(int[] arr, int target){
		   int lastIndex = -1;
		   for(int i = arr.length-1; i>=0; i--){
			   if(arr[i] == target){
				   lastIndex = i;
				   break;
			   }
		   }
		return lastIndex;
	}
	public static int[] searchRange(int[] arr, int target){
	 
		int[] data = {-1,-1};
	    data[0] = firstOccurence(arr, target);
		data[1] = lastOccurence(arr, target);
	
		return data;
		
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		int[] arr = {1,2,3,3,3,4,4,5};
		int target = 3;
		int[] result = searchRange(arr, target);
		for(int i = 0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}


// Using binarySearch
// Time Complexity: O(log(n))
// Space Complexity: O(1)

import java.util.*;
import java.lang.*;
import java.io.*;


class WorkAtTech
{
	
	public static int firstOccurence(int[] arr, int target){
		   int start = 0;
		    int end = arr.length-1;
		    int firstIndex = -1;
			while(start<=end){
			int mid = (start + end) /2;
			if(target == arr[mid]){
				first = mid;
				end = mid-1;
			}
			else if(target<arr[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return first;
	}
	
	public static int lastOccurence(int[] arr, int target){
		    int start = 0;
		    int end = arr.length-1;
		     int last = -1;
			while(start<=end){
			int mid = (start + end) /2;
			if(target == arr[mid]){
				last = mid;
				start = mid+1;
			}
			else if(target<arr[mid]){
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return last;
	}
	public static int[] searchRange(int[] arr, int target){
	 
		int[] data = {-1,-1};
	    data[0] = firstOccurence(arr, target);
		data[1] = lastOccurence(arr, target);
	
		return data;
		
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		int[] arr = {1,2,3,3,3,4,4,5};
		int target = 3;
		int[] result = searchRange(arr, target);
		for(int i = 0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}