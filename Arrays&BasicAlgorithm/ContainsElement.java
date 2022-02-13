// Given a sorted array and a number key, return whether the key is present in the array or not.

// Expected Time Complexity: O(log n)

// Examples
// Array: [1, 2, 3, 3, 3, 4, 4, 5]
// Number: 2
// Answer: true
// Array: [1, 2, 3, 3, 3, 4, 4, 5]
// Number: 6
// Answer: false

class Solution {
	boolean containsElement (int[] arr, int key) {
		// T.C = O(n)
		// for(int i = 0; i<arr.length; i++){
		// 	if(arr[i] == key){
		// 		return true;
		// 	}
		// }
		// return false;
		
		// T.C = O(n);
		
		int start = 0;
		int end = arr.length-1;
		while(start<=end){
			int mid = (start + end) / 2;
			if(key == arr[mid]){
				return true;
			}else if(key < arr[mid]){
				end  = mid - 1;
			}else{
				start = mid + 1;
			}
		}
		return false;
	}
}