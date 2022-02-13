Given an array and a number k, remove all occurrences of k from the array (in-place). Return the number of elements 'remainingSize' left after removing k. There can be anything beyond the first 'remainingSize' elements. It will be ignored.

Example
Array: [1, 4, 2, 6, 2, 6, 9, 4]
Number: 4
Answer: 6
Explanation:[1, 2, 6, 2, 6, 9]




// Array: [1, 4, 2, 6, 2, 6, 9, 4]
//         0  1  2  3  4  5  6  7
// Number: 4
// Answer: 6
// Explanation:[1, 2, 6, 2, 6, 9]
// k = 4
// i = 0, j = 0, A[i]/[0](1)!=k(4), A[j]/[0] = A[i]/[0], A[1,], i = 1, j = 1;
// i = 1, j = 1, A[i]/[1](4)==k(4), skip               , A[1,], i = 2, j = 1;
// i = 2, j = 1, A[i]/[2](2)!=k(4), A[j]/[1] = A[i]/[2], A[1,2], i = 3, j = 2;
// i = 3, j = 2, A[i]/[3](6)!=k(4), A[j]/[2] = A[i]/[3], A[1,2,6], i = 4, j = 3;
// i = 4, j = 3, A[i]/[4](2)!=k(4), A[j]/[3] = A[i]/[4], A[1,2,6,2], i = 5, j = 4;
// i = 5, j = 4, A[i]/[5](6)!=k(4), A[j]/[4] = A[i]/[5], A[1,2,6,2,6], i = 6, j = 5;
// i = 6, j = 5, A[i]/[6](9)!=k(4), A[j]/[5] = A[i]/[6], A[1,2,6,2,6,9,], i = 7, j = 6;
// i = 7, j = 6, A[i]/[7](4)==k(4), skip    ,  A[1,2,6,2,6,9,], i = 8, j = 6;
// i = 8>A.length(8) loop will terminate j = *6* return that is the no of elements left after removing all the occurence of 4 in the given array.


class Solution {
	int removeOccurences(int[] A, int k) {
        int j = 0;
        for(int i = 0; i <A.length; i++){
			  if(A[i]!=k){
				A[j] = A[i];
		        j++;
			  }    
		}
        return j;
	}
}
