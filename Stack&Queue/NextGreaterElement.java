1-> Not circular array case

// We can use two nested loops, to search for the next greater element of the ith element
//  in the array. If we find the next greater element, we push it into the list, else we 
//  push -1 into the list and finally return it.


// Analysis
// Time Complexity: O(n2)
// Space Complexity: O(1)


class Solution {
	int[] getNextGreaterElement (int[] A) {
		int[] answer = new int[A.length];
		for(int i = 0; i<A.length; i++){
			answer[i] = -1;
		}
		int k = 0;
		for(int i = 0; i<A.length; i++){
			for(int j = i+1; j<A.length; j++){
				if(A[j]>A[i]){
					answer[k] = A[j];
					break;	
			}
		}
		k++;
	}
	 return answer;
   }
}


// Using stack
// 1- > Start traversing from end of the array 
// 2 -> Initially there is no element in the stack so pick last element 
// in the stack and mark its next greater as -1 in next greater array that we need to return
// 3 -> Now pick second last element if there is smaller element in the stack
// then pop element from the stack till then you found the greater element
// than it at top of the stack

// 1-> check if there is smaller element present in the stack
// 2-> if smaller then pop element from the stack till then you
// find larger element than it
// 3-> if found larger element than it then top element is its 
// answer and push that element in the stack.

class Solution {
	int[] getNextGreaterElement (int[] A) {
    int[] result = new int[A.length];
	Deque<Integer> stack = new ArrayDeque<>();
	stack.push(A[A.length-1]);
	result[A.length-1] = -1;
	//Pop till you find greater element at top or there is element in the stack
	for(int i = A.length-2; i>=0; i--){
	  while(stack.size()>0 && A[i]>=stack.peek()){
		  stack.pop();
	  }
		//If there is no element in the stack mark its answer -1 else it found greater element then A[i] at top of stack so answer is stack top element 
		//After finding the answer ut also need to add himself into the top of the stack
		if(stack.size() == 0){
			result[i] = -1;
		}else{
			result[i] = stack.peek();
		}
		stack.push(A[i]);
	}
		return result;
   }
}


2->
// In case of circular array
Brute force






// In case of circular array using stack

// Input: nums = [1,2,1]
// Output: [2,-1,2]
// Explanation: The first 1's next greater number is 2; 
// The number 2 can't find next greater number. 
// The second 1's next greater number needs to search circularly, which is also 2

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
	Deque<Integer> stack = new ArrayDeque<>();
	// stack.push(nums[nums.length-1]);
	// result[nums.length-1] = -1;
	//Pop till you find greater element at top or there is element in the stack
	for(int i = 2 * n - 1; i>=0; i--){
	  while(stack.size()>0 && nums[i%n]>=stack.peek()){
		  stack.pop();
	  }
		//If there is no element in the stack mark its answer -1 else it found greater element then A[i] at top of stack so answer is stack top element 
		//After finding the answer ut also need to add himself into the top of the stack
		if(i<n){
            if(stack.size() == 0){
			result[i] = -1;
		}else{
			result[i] = stack.peek();
		}
        }
		stack.push(nums[i%n]);
	}
		return result;
    }
}