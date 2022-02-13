// Find the minimum element from the array and swap it with the first element of the array
// After finding the minimum and swapping it with the first element of the array now find
// Minimum from the 1st index and swap it with the 1th index element
// Now find the minimum from the second index till end of the array and swap.

import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech
{
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {3, 4, 1, 6, 2, 5};
		selectionSort(arr);
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}
	}
}