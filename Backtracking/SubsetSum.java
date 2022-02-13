Given an array of integers A and a target value target.

Find whether there exists a subset in the array A where their sum is equal to target.


code using backtracking

class Solution {
	
    // Target -> 13	
        
    // [[1,3,4,9,2],[1,3,4,9],[1,3,4,2],[1,3,4],[1,3,9,2],[1,3,9],[1,3,2],[1,3],[1,4,9,2],[1,4,9],[1,4,2],[1,4],[1,9,2],[1,9],[1,2],[1],[3,4,9,2],[3,4,9],[3,4,2],[3,4],[3,9,2],[3,9],[3,2],[3],[4,9,2],[4,9],[4,2],[4],[9,2],[9],[2],[]]
        
    // 19 17 10 8 15 13 6 4 16 14 7 5 12 10 3 1 18 16 9 7 14 12 5 3 15 13 6 4 11 9 2 0 
    
    // Ans -> [1, 3, 9]
        
        static void hasValidSubsetUtil(int[] A, int currentIndex, List<Integer> current, List<List<Integer>> result){
            if(currentIndex == A.length){
                result.add(new ArrayList(current));
                return;
            }
            current.add(A[currentIndex]);
            hasValidSubsetUtil(A, currentIndex+1, current, result);
            current.remove(current.size()-1);
            hasValidSubsetUtil(A, currentIndex+1, current, result);
        }
        
        boolean hasValidSubset(int[] A, int target) {
             List<List<Integer>> result = new ArrayList<>();
            List<Integer> current = new ArrayList<>();
            hasValidSubsetUtil(A, 0, current, result);
            // for(List<Integer> subsets : result){
            // 	 System.out.print(subsets);
            //  }
            List<Integer> addition = new ArrayList<>();
                 for(List<Integer> subsets : result){
                     int sum = 0;
                     for(int i: subsets){
                         sum = sum + i;
                     }
                     addition.add(sum);
                 }
            // for(int j: addition){
            // 	System.out.print(j + " ");
            // }
             for(int i = 0; i<addition.size(); i++){
                 if(addition.get(i) == target){
                     return true;
                 }
             }
            return false;
        }
    }