// Problem Statement:
// Given an array A, find all unique triplets in the array whose sum is equal to zero.

// Example:
// A: [1, 1, 0, -1, -2]
// Triplets: [
//   [-2, 1, 1],
//   [-1, 0, 1]
// ]
// Note: Each triplet should be sorted. The resultant array should be sorted as well.

//Brute Force


// In this approach, we can iterate over all possible triplets of the given array and check if each triplet is valid, push them into an appropriate data structure such as a set of tuples, to remove duplicates.

// Analysis
// Time Complexity: O(n3 * logn)
// Space Complexity: O(n2)


class Solution {
    List<List<Integer>> threeSum(int[] A) {
        int n = A.length;
        HashSet<ArrayList<Integer>> solutionSet = new HashSet<ArrayList<Integer>>();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(A[i] + A[j] + A[k] == 0) {
                        ArrayList<Integer> triples = new ArrayList<Integer>();
                        triples.add(A[i]);
                        triples.add(A[j]);
                        triples.add(A[k]);
                        Collections.sort(triples);
                        solutionSet.add(triples);
                    }
                }
            }
        }
        ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();
        for (ArrayList<Integer> x: solutionSet) {
            answer.add(x);
        }
        return answer;
    }
 }



   // T.C = O(n*n); S.C = O(m) m no. of triplets
class Solution {
	List<List<Integer>> threeSum(int[] A) {
	   List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(A);
		for(int i = 0; i<A.length-2; i++){
			// Will find the duplets i.e will only excute the logic of two sum if
			// i is the first element i.e i == 0 or or if i>0 i.e i = 1 will check if A[i-1]!=A[i] i.e A[0]!=A[1] then only will find duplets i.e to avoid duplicay
			if(i==0 || i>0 && A[i]!=A[i-1]){
			int firstElement = A[i];
			int target = -firstElement;
			int j = i+1;
			int k = A.length-1;
			while(j<k){
				if(A[j] + A[k] == target){
					result.add(Arrays.asList(A[i], A[j], A[k]));
// [-2 -2 -1 -1 -1 0 0 0 2 2 2]
// 	i 	           j		 k, j++, k--
// [-2,0,2] we found our duplet so move both j++ and k--
// [-2 -2 -1 -1 -1 0 0 0 2 2 2]
// 	i 	             j	   k
// 	Again same triplet [-2,0,2]
// [-2 -2 -1 -1 -1 0 0 0 2 2 2]
// 	i 	               k j     All the zeroes and 2's skipped in order to ignore duplicate triplets also j crosses k so we should stop
// 	j should move till it doesn't encounter previous low i.e other than 0 and also till it less than k imagine it doesn't find other than 0 element till it less than k
// and same case for k too k should skip till it find other element than 2 and also j should be less than k
					while(j<k && A[j] == A[j+1]) j++;
					while(j<k && A[k] == A[k-1]) k--;
							   j++;
							   k--;
				}else if(A[j]+A[k]>target){
					k--;
				}else{
					j++;
				}
			}
		}
		}
		return result;
	}
		
  }

 

 
 

 // T.C = O(n*n); S.C = O(m) m no. of triplets
 class Solution {
	List<List<Integer>> threeSum(int[] A) {
	   List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(A);
		for(int i = 0; i<A.length-2; i++){
			int firstElement = A[i];
			int target = -firstElement;
			int j = i+1;
			int k = A.length-1;
			while(j<k){
				if(A[j] + A[k] == target){
					ArrayList<Integer> triplets = new ArrayList<>();
					triplets.add(A[i]);
					triplets.add(A[j]);
					triplets.add(A[k]);
// [-2 -2 -1 -1 -1 0 0 0 2 2 2]
// 	i 	           j		 k, j++, k--
// [-2,0,2] we found our duplet so move both j++ and k--
// [-2 -2 -1 -1 -1 0 0 0 2 2 2]
// 	i 	             j	   k
// 	Again same triplet [-2,0,2]
// [-2 -2 -1 -1 -1 0 0 0 2 2 2]
// 	i 	               k j     All the zeroes and 2's skipped in order to ignore duplicate triplets also j crosses k so we should stop
// 	j should move till it doesn't encounter previous low i.e other than 0 and also till it less than k imagine it doesn't find other than 0 element till it less than k
// and same case for k too k should skip till it find other element than 2 and also j should be less than k
					while(j<k && A[j] == A[j+1]) j++;
					while(j<k && A[k] == A[k-1]) k--;
							   j++;
							   k--;
					result.add(triplets);
				}else if(A[j]+A[k]>target){
					k--;
				}else{
					j++;
				}
			}
	
			// [-2 -2 -1 -1 -1 0 0 0 2 2 2]
			// 	i
			// i should skip till it find other element than -2 i.element
			// [-2 -2 -1 -1 -1 0 0 0 2 2 2]
			// 	       i
			while(i+1<A.length && A[i] == A[i+1]) i++;
		}
		return result;
	}
		
  }



  // Using Hashset don't know what is getting wrong
  class Solution {
	List<List<Integer>> threeSum(int[] A) {
	Set<List<Integer>> result = new HashSet<>();
		   Arrays.sort(A);
			for(int i = 0; i<A.length-2; i++){
				int firstElement = A[i];
				int target = -firstElement;
				int j = i+1;
				int k = A.length-1;
				while(j<k){
					if(A[j]+A[k] == target){
						result.add(Arrays.asList(A[i], A[j], A[k]));
						j++;
						k--;
					}else if(A[j] + A[k] > target){
						k--;
					}else{
						j++;
					}
				  }
			}
			return new ArrayList<>(result);
	}
  }
