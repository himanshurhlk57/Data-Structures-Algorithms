import java.util.*;
import java.lang.*;
import java.io.*;

// T.C of Binary Search O(logn)
// in the first iteartion we are searching over the n elements in the second iteration we are searching over the n/2 elements in the third n/4
// n, n/2, n/4, n/8 -- n/2^k  At last n/2^k = 1;
// n = 2^k
// k = logn
class WorkAtTech {
	public static int binarySearch(int[] arr, int startIndex, int endIndex, int requiredNumber) {

		startIndex = 0;
		endIndex = arr.length - 1;
		while (startIndex <= endIndex) {
			int midIndex = startIndex + endIndex / 2;
			// To prevent integer overflow we can write mid as
			int midIndex = startIndex + (endIndex - startindex) / 2;
			if (arr[midIndex] == requiredNumber) {
				return midIndex;
			} else if (requiredNumber > midIndex) {
				startIndex = midIndex + 1;
			} else {
				endIndex = midIndex - 1;
			}
		}
		return -1;

		// Time complexity: O(log n)
		// Here we are finding first the middle index cheecking to if
		// condition(Start>end and requiredNumber == arr[middleIndex])
		// All three takes constant time
		// Doing binary search recursively either on the left side or right side based
		// on the condition
		// Doing binarySearch on either part will take T(n/2) time
		// So we will have only be taking T(n/2) in that recurrence.

		// Therefore, the recurrence relation will be:
		// T(n) = T(n/2) + 1
		// T(1) = 1 [When size is 1, we cannot recurse further]

		int middleIndex = (startIndex + endIndex) / 2;
		if (startIndex > endIndex) {
			return -1;
		}
		if (requiredNumber == arr[middleIndex]) {
			return middleIndex;
		} else if (requiredNumber < arr[middleIndex]) {
			return binarySearch(arr, startIndex, middleIndex - 1, requiredNumber);
		} else {
			return binarySearch(arr, middleIndex + 1, endIndex, requiredNumber);
		}
	}

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97 };
		System.out.println(binarySearch(arr, 0, 24, 2));
		System.out.println(binarySearch(arr, 0, 24, 11));
		System.out.println(binarySearch(arr, 0, 24, 17));
		System.out.println(binarySearch(arr, 0, 24, 37));
		System.out.println(binarySearch(arr, 0, 24, 41));
		System.out.println(binarySearch(arr, 0, 24, 79));
		System.out.println(binarySearch(arr, 0, 24, 97));
		System.out.println(binarySearch(arr, 0, 24, 100));
		System.out.println(binarySearch(arr, 0, 24, 40));
		System.out.println(binarySearch(arr, 0, 24, 1));
	}
}