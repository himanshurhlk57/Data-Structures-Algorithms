// Counting sort is a sorting algorithm that sorts the elements of an array by counting the number of occurrences of each unique element in the array. 
// The count is stored in an auxiliary array and the sorting is done by mapping the count as an index of the auxiliary array.

// Working of Counting Sort


// Find out the maximum element (let it be max) from the given array.


// Initialize an array of length max+1 with all elements 0. This array is used for storing the count of the elements in the array.


// Store the count of each element at their respective index in count array

// For example: if the count of element 3 is 2 then, 2 is stored in the 3rd position of count array. 
// If element "5" is not present in the array, then 0 is stored in 5th position.


// Store cumulative sum of the elements of the count array. It helps in placing the elements into the correct index of the sorted array.

// Find the index of each element of the original array in the count array. This gives the cumulative count. Place the element at the index calculated as shown in figure below.

// After placing each element at its correct position, decrease its count by one.


// Counting sort in Java programming










import java.util.*;
import java.lang.*;
import java.io.*;

// original array ->  { 4, 2, 2, 8, 3, 3, 1};
// Find maximum and minimum i.e 8 and 1
// Make Frequency array of size maximum-minimum+1, 8-1+1 = 8

// Initially frequency of all the element is zero
// In frequency array will store frequency of array element i.e 4 is 1 times, 2 is 2 times, 3 is 2 times and so on.
	
// At 0th index 1 will be stored, 1th index 2 and at 7th index 8 will be stored

// Loop in the main array and the value we get we subtract min from it and the index we get from this we increase that index value by 1 the value represent the no of frequency of particular element.

// 4-1 = 3, at 3 index we increment its value by 1
// 2-1 = 1  1 index value 1
// 2-1 = 1  1 index value 2
// 8-1 = 7  7 index value 1
// 3-1 = 2  2 index value 1
// 3-1 = 2  2 index value 2
// 1-1 = 0  0 index value 1
	 
// Frequency Array  =[ 1 2 2 1 0 0 0 1 ]  
// Index               0 1 2 3 4 5 6 7
	
// 1 is 1 times
// 2 is 2 times
// 3 is 2 times
// 4 is 1 times
// 5 is 0 times
// 6 is 0 times
// 7 is 0 times
// 8 is 1 times

// Now run a loop on frequency array and find its prefix sum
// element         = [ 1 2 3 4 5 6 7 8]
// Frequency Array = [ 1 2 2 1 0 0 0 1 ]
// prefix sum =      [ 1 3 5 6 6 6 6 7 ] 
	
// This prefix sum tells first 1 position will contain 1 then till next 3 position 2 then till next 5 position 3 then till next 6th position 1 then tilll 7 th position 8
	
// element  [1 2 2 3 3 4 8]
// position [1 2 3 4 5 6 7]

// Last element 8 will be at 7 position i.e 6th index
// if we subtract 1 from prefix sum we will get answer in term of index


// Frequency Array = [ 1 2 2 1 0 0 0 1 ]
// prefix sum =      [ 1 3 5 6 6 6 6 7 ]
// prefix sum after subtracting = [0 2 4 5 5 5 5 6]
// Ans array =       [ 1 2 2 3 3 4 8]

// from 0 till 0 index 1 will be there, till 2 index 2 will be there, till 5th index 3 will be there


// original array ->  { 4, 2, 2, 8, 3, 3, 1};
// element         =              [1 2 3 4       8]
// prefix sum after subtracting = [0 2 4 5 5 5 5 6]

// Now loop the original array once more in reverse order
// found 1 for 1 we found 0 index so we put 1 at 0th index
// found 3 for 3 we we found 4th index so put 3 at 4th index and decrease 4 by 1 in prefix sum after subtracting now it is 3
// found 3 put at 3rd index 3 and decrease it by 1 i.e 2
// found 8 for 8 we found at 6th index we put 8
// found 2 put 2 at 2th index now 2-1 i.e 1
// found 2 put at 1st index 
// found 4 put at 5th index

// original array                       [4 2 2 8 3 3 1]
// finally in the original array itself [1 2 2 3 3 4 8]
// index                                [0 1 2 3 4 5 6]
	

// Count sort when there are lots of value but range is less
// 1 lakh student fill the form but their number lies between 0 to 350 only

class WorkAtTech{
	
	public static void countinSort(int[] arr){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length; i++){
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
		}
		int range = max - min + 1;
		int[] frequencyArray = new int[range];
		for(int i = 0; i<arr.length; i++){
			frequencyArray[arr[i]-min]++;
		}
		for(int i = 1; i<frequencyArray.length; i++){
		     frequencyArray[i] = frequencyArray[i] + frequencyArray[i-1];
		}
		int[] answer = new int[arr.length];
		for(int i = arr.length-1; i>=0; i--){
			int value = arr[i];
			int position = frequencyArray[value-min];
			int index = position - 1;
			answer[index] = value;
			frequencyArray[value-min]--;
		}
		for(int i = 0; i<answer.length; i++){
			arr[i] = answer[i];
		}
	    
	}
	
	public static void main (String[] args){
	int[] arr = { 4, 2, 2, 8, 3, 3, 1};
    countinSort(arr);
    System.out.println(Arrays.toString(arr));
	}
}































// import java.util.Arrays;

// class CountingSort {
//   void countSort(int array[], int size) {
//     int[] output = new int[size + 1];

//     // Find the largest element of the array
//     int max = array[0];
//     for (int i = 1; i < size; i++) {
//       if (array[i] > max)
//         max = array[i];
//     }
//     int[] count = new int[max + 1];

//     // Initialize count array with all zeros.
//     for (int i = 0; i < max; ++i) {
//       count[i] = 0;
//     }

//     // Store the count of each element
//     for (int i = 0; i < size; i++) {
//       count[array[i]]++;
//     }

//     // Store the cummulative count of each array
//     for (int i = 1; i <= max; i++) {
//       count[i] += count[i - 1];
//     }

//     // Find the index of each element of the original array in count array, and
//     // place the elements in output array
//     for (int i = size - 1; i >= 0; i--) {
//       output[count[array[i]] - 1] = array[i];
//       count[array[i]]--;
//     }

//     // Copy the sorted elements into original array
//     for (int i = 0; i < size; i++) {
//       array[i] = output[i];
//     }
//   }

//   // Driver code
//   public static void main(String args[]) {
//     int[] data = { 4, 2, 2, 8, 3, 3, 1 };
//     int size = data.length;
//     CountingSort cs = new CountingSort();
//     cs.countSort(data, size);
//     System.out.println("Sorted Array in Ascending Order: ");
//     System.out.println(Arrays.toString(data));
//   }
// }