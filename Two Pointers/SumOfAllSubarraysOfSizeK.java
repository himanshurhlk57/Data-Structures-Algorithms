import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech{
	
// Given an array and a number k, find the sum of all the subarrays of size k.

// Example
// Array: 3, 5, 6, 2, 4, 7, 8
// k: 3
// Here, the subarrays of size k and their sum are:

// [3 5 6] => 14
// [5 6 2] => 13
// [6 2 4] => 12
// [2 4 7] => 13
// [4 7 8] => 19
// Answer: [14, 13, 12, 13, 19]
// Dry Run - 3, 5, 6, 2, 4, 7, 8
//           0  1  2  3  4  5  6
//           k = 3
// result = [], i = 0, j = 0, sum = 0, sum = sum + arr[i+j]/[0] -> sum = 0 + 3, sum = 3, result[i]/[0] = sum(3), result[3,]
// result = [3,], i = 0, j = 1, sum = 3, sum = sum + arr[i+j]/[0+1] -> sum = 3 + 5, sum = 8, result[i]/[0] = sum(8), result[8,]
// result = [8,], i = 0, j = 2, sum = 8, sum = sum + arr[i+j]/[0+2] -> sum = 8 + 6, sum = 14, result[i]/[0] = sum(14), result[14,]
// Now i = 0, j=3 j sould go till j<k 3<3 so loop will terminate and now i will become 1
// 
	// 1-> Lets create the array in which out kth size subarrays sum will be stored
	// The time complexity of the above solution is O(n*k).
	public static int[] sumOfAllSubarraysSizeK(int[] arr, int k){
         int[] result = new int[arr.length+1-k]; //(7+1-3)(5)
		 for(int i = 0; i<result.length; i++){
			 int sum = 0;
			 for(int j = 0; j<k; j++){
				 sum = sum + arr[i+j];
			 }
			 result[i] = sum;
		 }
		return result;
	}
	 
	
	// Using sliding window technique
	// Initialize sum = 0
	//    3, 5, 6, 2, 4, 7, 8 ,k = 3;
	//    0, 1, 2, 3, 4, 5, 6 
	//    sum till 2 index i.e k = 3 is 3 + 5 + 6 = 14, result[0] = sum, result[14,]
	//    start loop from 1 index i.e i = 1 
	/*   
	 *    sum = 14, result[14,]
	 *    sum = (sum-arr[1-1]) + arr[1+3-1] i.e (14-3) + 2 = 13, result[i]/[1] = 13, result[14,13,], sum = 13
	 *    sum = (13-arr[2-1]) + arr[2+3-1] i.e  (13-5) + 4 = 12, result[i]/[2] = 12, result[14,13,12,], sum = 12 
	 *    sum = (12-arr[3-1]) + arr[3+3-1] i.e  (12-6) + 7 = 13, result[i]/[3] = 13, result[14,13,12,13], sum = 13
	 *    sum = (13-arr[4-1]) + arr[4+3-1] i.e  (13-2) + 8 = 19, result[i]/[4] = 19, result[14,13,12,13,19], sum = 19
	 *    i = 5 loop will terminate as arr.length+1-k or result.length is 5
	 * */
	

	int[] kSubarraySum (int[] A, int k) {
		int[] result = new int[A.length+1-k];
		int sum = 0;
		for(int i = 0; i<k; i++){
		  sum = sum + A[i];
		}
			 result[0] = sum;
			 for(int i = k; i<A.length; i++){
			 sum = (sum - A[i - k]) + A[i];
			 result[i-k+1] = sum;
		}
			return result;
	}


	// public static int[] sumOfAllSubarraysSizeK1(int[] arr, int k){
	// 	int[] result = new int[arr.length+1-k];
    //     int sum = 0;
	// 	for(int i = 0; i<k; i++){
	// 		sum = sum + arr[i];
	// 	}
	// 	result[0] = sum;
		
	// 	for(int i = 1; i<result.length; i++){
	// 		sum = (sum - arr[i-1]) + arr[i+k-1];
	// 		result[i] = sum;
	// 	}
	// 	return result;
	// }
	

	
	public static void main (String[] args) throws java.lang.Exception{
        int[] arr = {3,5,6,2,4,7,8};
		int k = 3;
		int[] result = sumOfAllSubarraysSizeK(arr, k);
		for(int i = 0; i<result.length; i++){
			System.out.print(result[i] + " ");
		}
		System.out.println();
		int[] result1 = sumOfAllSubarraysSizeK1(arr, k);
		for(int i = 0; i<result1.length; i++){
			System.out.print(result1[i] + " ");
		}
	}
}