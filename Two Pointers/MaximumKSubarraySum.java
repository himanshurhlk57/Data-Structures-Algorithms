
// created a result array in which we stored the sum of all the subarrays of size k
// then a variable maximumSubarraysum and traverse the result array and find the maximum value from the array and return it.

class Solution {
	int maxKSubarraySum (int[] A, int k) {
		int[] result = new int[A.length+1-k];
		int sum = 0;
		for(int i = 0; i<k; i++){
			sum = sum + A[i];
		}
		result[0] = sum;
		for(int i = k; i<result.length; i++){
			sum = (sum-A[i-k]) + A[i];
			result[i] = sum;
		}
		int maxKSubarraySum = 0;
		for(int i = 0; i<result.length; i++){
			if(result[i]>maxKSubarraySum){
				maxKSubarraySum = result[i];
			}
		}
		return maxKSubarraySum;
	}
}


//Instead of creating extra array first we find the sum of element till 2 index i.e k element sum and a variable maximum sum 
// after find the sum of k element we found math.max of sum and maximum sum and assign it to the maximum sum.
//and then the subsequent window sum through sliding window if we find bigger value than the current maximum sum and between the next subsequent sum we
//we assign it to the maximumsum and lastly return the maximumsum value not need to create extra array and store the all the k size subarray sum value;

class Solution {
	int maxKSubarraySum (int[] A, int k){
		int sum = 0;
		int maximumSum = 0;
		for(int i = 0; i<k; i++){
			sum = sum + A[i];
		}
		maximumSum = Math.max(sum, maximumSum);
		
		for(int i = 1; i<A.length-k+1; i++){
			sum = (sum-A[i-1]) + A[i+k-1];
			maximumSum = Math.max(maximumSum, sum);
		}
		return maximumSum;
	}
}




// Starting i from k 
int maxKSubarraySum (int[] A, int k) {	
	int[] result = new int[A.length+1-k];
	int sum = 0;
	for(int i = 0; i<k; i++){
		sum = sum + A[i];
	}
	result[0] = sum;
	for(int i = k; i<A.length; i++){
		sum = sum - A[i-k];
		sum = sum +  A[i];
		result[i-k+1] = sum;
	}
	int maxKSubarraySum = 0;
	for(int i = 0; i<result.length; i++){
		if(result[i]>maxKSubarraySum){
			maxKSubarraySum = result[i];
		}
	}
	return maxKSubarraySum;
}
}


public int maxKSubarraySum (int[] A, int k) {		
int maximum = 0;
int sum = 0;
for(int i = 0; i<k; i++){
	sum = sum + A[i];
}
maximum = Math.max(sum, maximum);
for(int i = k; i<A.length; i++){
	sum = sum-A[i-k];
	sum = sum + A[i];
	maximum = Math.max(sum, maximum);
}

return maximum;
}
}
