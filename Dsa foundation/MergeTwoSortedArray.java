import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech
{
	
// 	First compare the element of both the array copy the smaller one into the third array at the k index of the third array we have to also increment its index so that the next compared element between the two array can be copied to the next index of the third array
// 		Increment the pointer of the element that has been copied to the resultant array
// 		we have to compare till the element is present in both the array that means i<firstArr.length && j<secondArr.length
// 		if theres any element is present in any of the array simpply copy that remaining element in the third array
// merging two sorted arrays of size m & n
//   Time complexity: = O(m+n)
//   At each step, we add one element to the output and each step is a O(1) operation. There are m+n elements in total.
// Space complexity : O(m+n)
// space complexity of merging two sorted arrays of size m & n
// we need to create a new array for the result. We would need extra space of size m+n.
			
	public static void merge(int[] firstArr, int[] secondArr, int[] mergedArr) {
		int i = 0, j = 0, k = 0;
		while(i<firstArr.length && j<secondArr.length){
			if(firstArr[i]<secondArr[j]){
				mergedArr[k] = firstArr[i];
				i++;
				k++;
			}else{
				mergedArr[k] = secondArr[j];
				j++;
				k++;
			}
		}
		while(i<firstArr.length){
			mergedArr[k] = firstArr[i];
			i++;
			k++;
		}
		while(j<secondArr.length){
			mergedArr[k] = secondArr[j];
			j++;
			k++;
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int sizeFirst = 5, sizeSecond = 5;
		int[] firstArr = {1, 5, 6, 7, 10};
		int[] secondArr = {2, 4, 8, 11, 12};
		int[] mergedArr = new int[sizeFirst + sizeSecond];

		merge(firstArr, secondArr, mergedArr);

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < sizeFirst + sizeSecond; i++) {
			stringBuilder.append(mergedArr[i]).append(" ");
		}
		
		System.out.println(stringBuilder.toString());
	}
}