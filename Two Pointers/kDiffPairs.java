import java.util.*;
import java.lang.*;
import java.io.*;

// Given a sorted array A of size n and a number k, return the number of unique pairs which have a difference of k.

// |arr[i] - arr[j]| = k where i < j

// Example
// A: [1, 3, 5, 7, 10]
// k: 2
// Answer: 3


// Time Complexity: O(n2)
// Space Complexity: O(1)
	
class WorkAtTech
{
// 	static int kDiffPairs(int[] A, int k) {
// 		int count = 0;
// 		for(int i = 0; i<A.length; i++){
// 			for(int j = i+1; j<A.length; j++){
// 				if(Math.abs(A[i]-A[j])==k){
// 				count++;
// 			}
// 		 }
			
// 	  }
// 		return count;
// 	}
	
	
	static int kDiffPairs(int[] nums, int k) {
		Arrays.sort(nums);
		if(k<0){
			return 0;
		}
        int i = 0;
        int j = 1;
        int count = 0;
        while(j<nums.length){
            while (j<(nums.length - 1) && nums[j] == nums[j+1]) {
                j++;
            }
            int difference = nums[j]-nums[i];
            if(difference == k){
                count++;
                i++;
                j++;
            }else if(difference<k){
                j++;
            }else{
                i++;
            }
        }
        return count;
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		int[] arr = {1,3,5,7,10};
		int k = 2;
		int count = kDiffPairs(arr,k);
		System.out.println(count);
	}
}