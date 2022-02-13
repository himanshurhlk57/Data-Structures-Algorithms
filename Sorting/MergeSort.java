// Algorithm
// The algorithm looks something like this:

// Sort the left half of the array
// Sort the right half of the array
// Merge both the halves of the array
// The base case of the recursion is arrays 
// of size zero or one, which are in order by definition, 
// so they never need to be sorted.




import java.util.*;
import java.lang.*;
import java.io.*;

// class Main
// {
	
// 	public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
// 		int i = 0, j = 0, k = 0;
// 		int[] result = new int[arr1.length + arr2.length];
// 		while(i<arr1.length && j<arr2.length){
// 			if(arr1[i]<arr2[j]){
// 				result[k++] = arr1[i++];
// 			}else{
// 				result[k++] = arr2[j++];
// 			}
// 		}
// 		while(i<arr1.length){
// 			result[k++] = arr1[i++];
// 		}
// 		while(j<arr2.length){
// 			result[k++] = arr2[j++];
// 		}
// 		return result;
// 	}
	
// 	public static int[] mergeSort(int[] arr, int start, int end){
// 		if(start == end){
// 			int[] baseArray = new int[1];
// 			baseArray[0] = arr[start];
// 			return baseArray;
// 		}
// 		int mid = start + (end-start)/2;
// 		int[] firstSortedHalf = mergeSort(arr, start, mid);
// 		int[] secondSortedHalf = mergeSort(arr, mid+1, end);
// 		int[] fullSortedArray = mergeTwoSortedArray(firstSortedHalf, secondSortedHalf);
// 		return fullSortedArray;
// 	}
	
// 	public static void main (String[] args) throws java.lang.Exception{
// 		int arr[] = {3, 4, 1, 6, 2, 5};
// 		int[] result = mergeSort(arr, 0, arr.length-1);
// 		for (int i = 0; i < result.length; i++) {
// 			System.out.print(result[i] + " ");
// 		}
// 	}
// }



import java.util.*;
import java.lang.*;
import java.io.*;


// [5,2,3,1] 
// start = 0, end = 3, mid = 1
// sort from 0(start) to 1(mid) and
// from 2(mid+1) to 3(end)
// and merge both the sorted array
// size of first half of array is 1(mid) - 0(start) + 1 = 2
// size of second half of array is 3(end) - 1(mid) = 2

// left  = 0, i = 0, firstArr [0 0 0]
//                             0 1 2
// firstArray[i] = nums[left + i]
// [5]
// [5, 2]

class WorkAtTech
{
static void mergeSortedArray(int[] nums, int start, int mid, int end){
 int sizeFirstArray = mid - start + 1;
 int sizeSecondArray = end - mid;
 int[] firstArray = new int[sizeFirstArray];
 int[] secondArray = new int[sizeSecondArray];
 for(int i = 0; i<firstArray.length; i++){
 firstArray[i] = nums[start+i];
 }
 for(int i = 0; i<secondArray.length; i++){
 secondArray[i] = nums[mid+1+i];
 }
 int i = 0;
 int j = 0; 
 int k = start;
 while(i<firstArray.length && j<secondArray.length){
 if(firstArray[i]<secondArray[j]){
 nums[k++] = firstArray[i++];
 }else{
 nums[k++] = secondArray[j++];
 }
 }
 while(i<firstArray.length){
 nums[k++] = firstArray[i++];
 }
 while(j<secondArray.length){
 nums[k++] = secondArray[j++];
 }
     
 }
 
   static void mergeSort(int[] nums, int start, int end){
   if(start >= end){
      return;
   }
   
   int mid = start + (end-start)/2;
   mergeSort(nums, start, mid);
   mergeSort(nums, mid+1, end);
   
   mergeSortedArray(nums, start, mid, end);
   
   }

	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {3, 4, 1, 6, 2, 5};
		mergeSort(arr, 0, arr.length-1);
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}
	}
}