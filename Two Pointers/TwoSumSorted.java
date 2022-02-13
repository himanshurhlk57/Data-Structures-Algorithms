class Solution {
	
	
    // Given a sorted array, check if there exist two numbers whose sum is zero.
        
    // A: [-3, 1, 3, 4]
    // Answer: true
    // A: [-2, 1, 3, 4]
    // Answer: false
        
        boolean hasTwoSumZero (int[] A) {
            //Using 2 nested loop we can check whether any two element whose sum is equal to 0 present or not if there's any two element return true else false;
    
            
    // 		for(int i = 0; i<A.length; i++){
    // 			for(int j = i+1; j<A.length; j++){
    // 				if(A[i] + A[j] == 0){
    // 					return true;
    // 				}
    // 			}
                
    // 		}
    // 		return false;
            
            
            /*2 pointer approach 
             *  A: [-3, 1, 3, 4] after sorting [-3,1,3,4]
             * first pointer at i = 0(-3), next at j = A.length-1(3)->4
             * calculate sum>0 i.e 1 i.e greater than 0 so if we move our i pointer to right it will give bigger value as array is sorted and element at last index is          already biggest in the array so will decrement the j pointer and keep i pointer at its previous position only
             * Now i = 0(-3), j = 2(3) now sum is -3+3(0) now we dont need to check other element of the array we can simply return true from there only
             * if sum<0 in that case we have to increment i count not j
             * 
             * 
             *  */
            
            Arrays.sort(A);
            int start = 0; 
            int end = A.length-1;
            while(start<end){
                int sum = A[start] + A[end];
                if(sum==0){
                    return true;
                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
            return false;
        }
    }