// Given an array of integers A, find the length of the longest consecutive elements sequence.

// Example
// A: [24, 2, 34, 1, 3, 4]
// Result: 4
// Explanation: The longest consecutive sequence is [1, 2, 3, 4].


// Naive Approach
// Time Complexity: O(n * log(n))
// Auxiliary Space Complexity: O(1)


class Solution {
	int longestConsecutiveSequence(int[] A) {
	    Arrays.sort (A);
		int currentMaxSequence = 1;
		int ans = 1;
		for (int i = 1; i < A.length; i++) {
			if (A[i] - A[i - 1] > 1) {
				currentMaxSequence = 1;
			} else {
				if (A[i] - A[i - 1] == 1) {
					currentMaxSequence++;
				}
			}
			ans = Math.max (ans, currentMaxSequence);

		}
		return ans;
	}
}


//Optimal Approach

A: [24, 2, 34, 1, 3, 4]
Put all the array element in the hashmap and mark every element can start
longest consecutive sequence 
All the elements are marked true.
24 -> T
2  -> T
34 -> T
1 ->  T
3 ->  T
4 ->  T

Now again start traversing the array element check for 24, 23 present or not
if 23 present then my sequence will start from 23 not 24 same for every element

because 23 is not present 24 will marked true
for 2 , 1 present marked 2 as false because from 1 consecutive can start

After marking for every element 
24 -> T
2 -> F
34 ->  T
1 -> T
3 -> F
4 -> F
now for every true check which can make longest sequence
for 24, only 24 length 1

for 34 only 34 length 1
for 1 -> 1,2,3,4 length 4 answer

class Solution {
	int longestConsecutiveSequence(int[] A) {
	   Map<Integer, Boolean> map = new HashMap<>();
		for(int i = 0; i<A.length; i++){
			map.put(A[i], true);
		}
		for(int i = 0; i<A.length; i++){
			if(map.containsKey(A[i]-1)){
				map.put(A[i], false);
			}
		}
		
		int maximum = 0;
		for(Map.Entry<Integer,Boolean> entry : map.entrySet()){
			 Integer key = entry.getKey();
            if (map.get(key) == true) {
                maximum = Math.max(maximum, maximumLength(map, key));
            }
        }
		return maximum;
		
	}
	
	static int maximumLength(Map<Integer, Boolean> map, int k){
		int answer = 0;
		while(map.containsKey(k)){
			answer++;
			k++;
		}
		return answer;
	}
}