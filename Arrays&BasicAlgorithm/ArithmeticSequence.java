// Problem Statement:
// An Arithmetic progression (AP) or arithmetic sequence is a sequence of numbers such that the difference between the consecutive terms is constant. For instance, the sequence 5, 7, 9, 11, 13, 15, . . . is an arithmetic progression with a common difference of 2.

// Given an unsorted array, find if it can be reordered to form an arithmetic sequence.

// Examples
// Array: [9, 13, 5, 15, 7, 11]
// Answer: true
// Explanation: This can be reordered to [5, 7, 9, 11, 13, 15] or [15, 13, 11, 9, 7, 5] both of which are arithmetic sequences.

// The problem will be much easier after sorting the array as now only the differences between two consecutive elements of the sorted array need to be checked. If at any point two different common difference (D) is encountered return false otherwise return true.

// Analysis
// Time Complexity: O(n * log(n))
// Space Complexity: O(1)

class Solution {
	boolean isArithmeticSequence (int[] arr) {
		if(arr.length==1){
			return true;
		}
		Arrays.sort(arr);
		int difference = arr[1] - arr[0];
		for(int i = 1; i<arr.length; i++){
			if(arr[i]-arr[i-1] != difference){
				return false;
			}
		}
		return true;
	}
}