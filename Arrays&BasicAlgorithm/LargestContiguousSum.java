// A subarray is a part of an array including one or more contiguous/adjacent elements.
// If we find the sum of the elements of any subarray then that sum will be known as a contiguous sum.
// You are given an array of numbers (could be -ve as well). You need to find the largest contiguous sum from the array.

// In the above example, the largest contiguous sum would be 15.

// Example
// Array: [4 -6 2 5]
// Answer: 7

// If the array contains all non-negative numbers, then the problem is trivial, 
// a maximum subarray is the entire array

// The number of all possible subarrays of an array of size N is N * (N+1)/2
// [1,2,3,4] = 1, 2, 3, 4, 1 2, 2 3, 3 4, 1 2 3, 2 3 4, 1 2 3 4.(10)/

// We can iterate over all possible subarrays of the array and calculate their sum. Then return the maximum possible value of the sum obtained.

// [1 2 3 4]
// 1
// 1 2
// 1 2 3 
// 1 2 3 4

// Time Complexity: O(n3)
// Space Complexity: O(1)

class Solution {
	int largestContiguousSum(int[] arr){
        int maxSubarraySum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
        for(int j = i; j < arr.length; j++) {
        int subarraySum = 0;
        for(int k = i; k <= j; k++) {
        subarraySum += arr[k];
        }
        maxSubarraySum = Math.max(maxSubarraySum, subarraySum);
        }
        }
        return maxSubarraySum;
    }
}

// 2nd approach
// T.C =(O(n^2))

class Solution {
	int largestContiguousSum(int[] arr){
		 int maxSubarraySum = Integer.MIN_VALUE;
		 for(int i = 0; i < arr.length; i++) {
		      int subarraySum = 0;
		 for(int j = i; j < arr.length; j++) {
		 subarraySum = subarraySum + arr[j];
		 maxSubarraySum = Math.max(maxSubarraySum,subarraySum);
		 }
		 }
		 return maxSubarraySum;
        }
    }

    // Kadane's Algorithm
/* 4 3 -2 6 -14 7 -1 4 5 7 -10 2 9 -10 -5 -9 6 1
currentSum                                    OverallBest
4(sum)- 4(element)                               4(sum) - 4
Now at 1 index 3 have option to move ahead with 3 and make current sum to 7 
or just move alone here we can see if 3 will move with 4 the sum will be 7 
that is better than overall sum so will update the overall sum to 7
7(sum) - 4,3(elements)                          7 - 4,3
5(sum) - 4,3,-2  not greater than overall sum so will not include thin in overall best
11(sum) - 4,3,-2,6>overallBest                 11 - 4,3,-2,6
-3(sum) - 4,3,-2,6,-14<overallbest              will not update
7(sum) - 7
6(sum) - 7,-1
10(sum) - 7,-1,4
15(sum) - 7,-1,4,5                              15 - 7,-1,4,5

*/
Analysis

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
	int largestContiguousSum(int[] arr){
        int currentSum = arr[0];
		int overallSum = arr[0];
		for(int i = 1; i<arr.length; i++){
			//if the sum coming from back is positive lets meet together i am your friend
			if(currentSum>=0){
				currentSum+=arr[i];
			}else{
				//if the sum coming from back is negative bhai tumse na kr rha main dosti I am a self made(Positive man)
				currentSum = arr[i];
			}
		if(currentSum>overallSum){
			overallSum = currentSum;
		}
	}
	  return overallSum;

 }
}