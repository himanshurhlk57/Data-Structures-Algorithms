// Given an array A and an integer target, find the indices of the two numbers 
// in the array whose sum is equal to the given target.

// Note: The problem has exactly one solution. Do not use the same element twice.

// Example
// A: [1, 3, 3, 4]
// target: 5
// Answer: [0, 3]

/*
Time Complexity: O(n)
Space Complexity: O(n)

traverse the given array and find the remaining element that will sum up 
with the current array element and make up the target
if the remaining array element is present in the map
find its index by map.get that will give the value to corresponding key
here key is remaining element and remaining index is key value and 
return the remaining index and current element index
else if it is not present in the map put the current array element 
with its corresponding index.

*/
class Solution {
	int[] twoSum(int[] A, int target) {
	   Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<A.length; i++){
			int remaining = target-A[i];
			if(map.containsKey(remaining)){
				int remainingIndex = map.get(remaining);
				return new int[]{i,remainingIndex};
			}else{
				map.put(A[i],i);
			}
		}
		return null;
	}
}