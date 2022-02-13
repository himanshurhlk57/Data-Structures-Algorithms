// Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]
// Explanation: 
// Window position                Max
// ---------------               -----
// [1  3  -1] -3  5  3  6  7       3
//  1 [3  -1  -3] 5  3  6  7       3
//  1  3 [-1  -3  5] 3  6  7       5
//  1  3  -1 [-3  5  3] 6  7       5
//  1  3  -1  -3 [5  3  6] 7       6
//  1  3  -1  -3  5 [3  6  7]      7



class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Create an array of size A.length-k+1
		int[] result = new int[nums.length-k+1];
		int p = 0;
		for(int i = 0; i<nums.length; i++){
			int maximum = Integer.MIN_VALUE;
			for(int j = i; j<i+k; j++){
				maximum = Math.max(nums[j], maximum);
			}
			result[p] = maximum;
			p++;
			if(p==result.length){
			break;
		  }
		}
		return result;
    }
}