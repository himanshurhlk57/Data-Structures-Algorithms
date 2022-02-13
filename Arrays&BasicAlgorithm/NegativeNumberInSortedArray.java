// Problem Statement:
// Given a sorted array of integers, find the number of negative numbers.

// Expected Time Complexity: O(log n)

// Examples
// Array: [-5, -3, -2, 3, 4, 6, 7, 8]
// Answer: 3

	// T.C = O(n);
    
class Solution {
	int getNegativeNumbersCount (int[] arr) {
	
		int negativeCount = 0;
		for(int i = 0; i<arr.length; i++){
			if(arr[i]<0){
				negativeCount++;
			}
		}
		return negativeCount;
    }