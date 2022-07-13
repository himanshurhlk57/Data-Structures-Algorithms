// The cumulative sum of an array at index i is defined as the sum of all elements of the array from index 0 to index i.

// Examples
// Initial Array: [1, 2, 3, 4]
// Cumulative Sum: [1, 3, 6, 10]

// input format
// Test case 2
// size of array 3
// input of first array 2 3 4
// size of second array 2
// input of second array 1 3 6
// output 2 5 9
//        1 3 10

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class Solution {
	static int[] getCumulativeSum (int[] arr) {
		// 1st way Brute force
		// Time Complexity: O(n2)
        // Space Complexity: O(n)

		int[] result = new int[arr.length];
		for(int i = 0; i<arr.length; i++){
			int currentSum = 0;
			for(int j = 0; j<=i; j++){
			currentSum+=arr[j];
			}
			result[i] = currentSum;
		}
		return result;

		// 2nd way 
		// Time Complexity: O(n)
        // Space Complexity: O(n)
		int i = 1;
		while(i<arr.length){
			arr[i] = arr[i] + arr[i-1];
			i++;
		}		
		return arr;

		
	}

	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while(T-->0){
		int sizeOfArray = scn.nextInt();
		int[] arr = new int[sizeOfArray];
		for(int i = 0; i<arr.length; i++){
		arr[i] = scn.nextInt();
		}
			int[] result = getCumulativeSum(arr);
			for(int i = 0; i<result.length; i++){
				System.out.print(arr[i] + " ");
			}
		System.out.println();
	}
		
	
}
}