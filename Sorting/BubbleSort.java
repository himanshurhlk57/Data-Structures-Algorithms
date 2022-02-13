// // In every round we are comparing adjacent elements if need we are swapping the elements
// //  by the end of every round the largest element of the array is at its wright position i.e 
// largest element at the end of the array.
// //  After every round we are moving one element at its correct positio.
// // If n is the size of array and in one round we are moving one element at its correct position 
// if we can move n-1 element at its correct position then our work can be done 

import java.util.*;
import java.lang.*;
import java.io.*;


class WorkAtTech
{
	static void bubbleSort(int[] arr) {

        for(int i = 0; i<arr.length-1; i++){
			for(int j = 0; j<arr.length-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
        
// 		int n = arr.length;
// 		boolean swapped;
// 		while (true) {
// 			swapped = false;
// 			for (int i = 1; i < n; i++) {
// 				if (arr[i - 1] > arr[i]) {
// 					int temp = arr[i - 1];
// 					arr[i - 1] = arr[i];
// 					arr[i] = temp;
// 					swapped = true;
// 				}
// 			}

// 			if (swapped == false) {
// 				break;
// 			}
// 		}
	
	}

	public static void main (String[] args) throws java.lang.Exception{
		int[] arr = {3, 4, 1, 6, 2, 5};
		bubbleSort(arr);
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}
	}
}