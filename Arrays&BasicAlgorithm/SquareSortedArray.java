// Given an array of numbers, return an array that contains the squares of all the numbers in non-decreasing order.

// Example
// Array: [6, -8, 3, -1, 4]
// Answer: [1, 9, 16, 36, 64]

// Analysis
// Time Complexity: O(n * log(n))
// Space Complexity: O(1)



class Solution {
	int[] getSquareSortedArray (int[] arr) {
		for(int i = 0; i<arr.length; i++){
			arr[i] = arr[i]*arr[i];
		}
		Arrays.sort(arr);
		return arr;
		
		
		// int[] square = new int[arr.length];
		// for(int i = 0; i<arr.length; i++){
		// 	square[i] = arr[i] * arr[i];
		// }
		// Arrays.sort(square);
		// return square;
	}
	
}