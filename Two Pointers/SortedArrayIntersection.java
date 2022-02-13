import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech
{
	
	
	// Brute Force 2 nested Loop 

// 		static List<Integer> intersection(int[] A, int[] B){
			
// 		List<Integer> intersection = new ArrayList<>();
		
// 		for(int i = 0; i<B.length; i++){
// 		for(int j = 0; j<A.length; j++){
// 		if(B[i]==A[j]){
// 		intersection.add(B[i]);
// 			break;
// 		  }
// 	   }
// 	}
// 		return intersection;
// 	}
	
	
	// Using Two Pointer Approach 
	
		static List<Integer> intersection(int[] A, int[] B){
			
		List<Integer> intersection = new ArrayList<>();
		
	   int i = 0, j = 0;
		while(i<A.length && j<B.length){
			if(A[i]<B[j]){
				i++;
			}else if(B[j]<A[i]){
				j++;
			}else{
				intersection.add(B[j]);
				i++;
				j++;
			}
		}
			return intersection;
	
	}
	
	
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// 
// 
// 		static List<Integer> intersection(int[] A, int[] B){
			
// 		List<Integer> result1 = new ArrayList<>();
		
// 	     Set<Integer> set = new HashSet<>();
// 			for(int i:A){
// 				set.add(i);
// 			}
// 			Set<Integer> intersection = new HashSet<>();
// 			for(int i:B){
// 				if(set.contains(i)){
// 					intersection.add(i);
// 				}
// 			}
// 		   for(int i:intersection){
// 			   result1.add(i);
// 		   }
// 			return result1;
	
// 	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
	 int[] arr1 = {1, 3, 4, 5, 5, 6, 6, 7};
	 int[] arr2 = {2, 5, 6, 6, 7, 8};
		List<Integer> result = intersection(arr1, arr2);
		for(int i = 0; i<result.size(); i++){
			System.out.print(result.get(i) + " ");
		}
		System.out.println();
	}
}