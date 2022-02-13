// Problem Statement:
// Given an array of integers, find the elements which have an even number of digits.

// Example
// Array: [42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442]
// Answer: 42, 5775, 34, 45, 3556
// The order of the returned elements should be the same as the order of the initial array.

// Analysis  
// Time Complexity : O(n log (size of largest number))
// Space Complexity : O(n)

// A function named countDigit which will receive the array element and return its count 
// lets say i receive 5434 it will return 4 and in the main function if coundition will check if it is even digit number then it will add it 
// int result arraylist.
class Solution {
	
	int countDigit(int number){
		int count = 0;
		if(number == 0){
			return 1;
		}
		while(number!=0){
			count++;
			number = number / 10;
		}
		return count;
	}
	List<Integer> getEvenDigitNumbers (int[] arr) {
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i<arr.length; i++){
			if(countDigit(arr[i]) == 0){
				result.add(arr[i]);
			}
		}
		return result;
	}
}