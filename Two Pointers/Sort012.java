// Problem Statement:
// Sort an array A where each of the elements belong to the set: {0, 1, 2}.

// Expected Time Complexity: O(n)

// Try to solve it without storing the count of 0s, 1s and 2s.

// Example:
// A: [2, 2, 0, 1]
// Result: [0, 1, 2, 2]

class Solution {
	
	// A: [2, 2, 0, 1]
	//     0  1  2  3
	//     s
	// 	m        e
	// 	s = 0, m = 0, e = 3
	// 	A[mid] == 2 swap with end
	// 	A[mid] == 1 skip should be in between 
	// 	A[mid] == 0, swap with start
	// 	s = 0(2), m = 0(2), e = 3(1), swap with end, 1 2 0 2 end--
	// 	s = 0(2), m = 0(1), e = 2(0), skip as m is 1, 1 2 0 2 medium++
	// 	s = 0(2), m = 1(2), e = 2(0), swap end with mid, 0 2 1 2 medium++
	//     s = 0(2), m = 2(1), e = 3(2), swap with mid, 0 2  2 end--
	 static void swapElement(int[] A, int start, int end){
		int temp = A[start];
		A[start] = A[end];
		A[end] = temp;
	}
	
	void sortTheArray(int[] A){
	       int low = 0, medium = 0, high = A.length-1;
        while(medium<=high){
            if(A[medium] == 0){
                swapElement(A, low++, medium++);
            }else if(A[medium] == 2){
                swapElement(A, medium, high--);
            }else{
                medium++;
                
            }
        }
	}
}