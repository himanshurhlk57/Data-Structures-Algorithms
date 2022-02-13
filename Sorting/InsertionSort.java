/* Insertion sort
Array :- 9 8 5 6 2 1
Divide array int two section one section is sorted
and other section is un-sorted. 
Pick one element from the unsorted section and insert it into
the sorted section
9 | 8 5 6 2 1
Sorted section | Unsorted Section
pick one element from unsorted section compare with 
9 so 8 should comes before 9 i.means shift 9 by 1 index and insert at its place
Now my array is 8 9(Sorted) | 5 6 2 1(Unsorted)
n-1 iteration where n is the size of the array 

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech
{
	static void insertionSort(int arr[]) {

	//  4 2 5 3 1
		// Sorted part is only 4 Unsorted part is 2 5 3 1
		//  will start loop from unsorted part i.e from 2 
		//  i.e i = 1;
		//  Now compare with i - 1 element i.e 4, 2 is smaller than 4. First store 2 in temp 
		// and move 4 into 2 position and 2 into 4th position and decremenet j. Will compare till j>=0 and arr[j]>temp
		// Lets write the code
		        // 4 2 5 3 1
                for(int i = 1; i<arr.length; i++){ //starts from 2
                    int j = i - 1;  // j = 0
                    int temp = arr[i]; // temp = 2
                    while(j>=0 && arr[j]>temp){ // j == 0  arr[j] = 4 > 2
                        arr[j+1] = arr[j];  // at 1 index will put 4;
                        j--; // j=0
                    }
                    arr[j+1] = temp;  // at 0 the index will put 2 
                }
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {3, 4, 1, 6, 2, 5};
		insertionSort(arr);
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}
	}
}