// xor approach
// Since x^x=0 and x^0 = x.
// 1, 1, 2, 3, 3, 4, 4 
// initially xor  = 0
// xor ^ arr[i]/arr[1] = 0 ^ 1 = 1
// xor ^ arr[1] = 1 ^ 1 = 0
// xor ^ arr[2] = 0 ^ 2 = 2
// xor ^ arr[3] = 2 ^ 3
// xor ^ arr[4] = 2 ^ 3 ^ 3 = 2
// xor ^ arr[5] = 2 ^ 4
// xor ^ arr[6] = 2 ^ 4 ^ 4 = 2
// xor = 2;
// return xor(ans) = 2;

class Solution {
	int findNonRepeatingElement (int[] arr) {
	  int xor = 0;
		for(int i = 0; i<arr.length; i++){
			xor = xor ^ arr[i];
		}
		return xor;
	}
}



// Approach 
// 1, 1, 2, 3, 3, 4, 4 
// i = 0 ->  1, i + 1 = 1 Both are same
// i = i + 2 -> 2, i = 2 -> 2, i+1 -> 3 Both are different will store arr[i]/arr[2] in element and will break out from the loop no need to check further as there is only one non repeating element in the array.
	
// Other test case -> 3 3 4 4 5
// i = 0 -> 3, i + 1 -> 3 same
// i = i + 2 -> 2
// i = 2 -> 4, i+1 - 4 same
// i will execute till this element only as i<arr.length-1
// That means in element -1 is present and the non repeating element is at last index in this case will check if element contains -1 then will simply store the last element in element and return it.

class Solution {
	int findNonRepeatingElement (int[] arr) {
		int element = -1;
	   for(int i = 0; i<arr.length-1; i+=2){
		   if(arr[i] != arr[i+1]){
			   element = arr[i];
			   break;
		   }
	   }
		if(element == -1){
			element = arr[arr.length-1];
		}
		return element;
	}
}