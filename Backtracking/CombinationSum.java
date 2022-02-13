Given an array of distinct integers A and a target value val, find all unique combinations of integers from A where their sum is equal to val.

Note: Each integer may be used multiple times in the combination.

Example
A: [1, 2]
val: 4
Combinations: [
  [1, 1, 1, 1],
  [1, 1, 2],
  [2, 2]
]


class Solution {
    
    //  Q-> [2,3,6,7], target = 7
         
    //  ->  [2,2,3] [7]
         
    //  Q-> [1,2], target = 4
    //  ->  [[1,2],[1],[2],[]] (Subsets)
    //  ->  [1,1,2] [2,2] [1,1,1,1]    
         
        static void combinationSum(int[] candidates, int currentIndex, List<Integer> current, List<List<Integer>> result, int target){
            
         if(target == 0){
             result.add(new ArrayList(current));
             return;
         }
           if(currentIndex == candidates.length || target < 0){
               return;
           } 
            current.add(candidates[currentIndex]);
            combinationSum(candidates, currentIndex, current, result, target - candidates[currentIndex]);
            current.remove(current.size()-1);
            combinationSum(candidates, currentIndex+1, current, result, target);
        }  
    
        
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> current = new ArrayList<>();
            combinationSum(candidates, 0, current, result, target);
            return result;
            
        }
    }


    // Using for loop

    class Solution {
    
        //  Q-> [2,3,6,7], target = 7
             
        //  ->  [2,2,3] [7]
             
        //  Q-> [1,2], target = 4
        //  ->  [[1,2],[1],[2],[]] (Subsets)
        //  ->  [1,1,2] [2,2] [1,1,1,1]    
             
            static void combinationSum(int[] candidates, int currentIndex, List<Integer> current, List<List<Integer>> result, int target){
             if(target == 0){
                 result.add(new ArrayList(current));
                 return;
             }
                
            if(target>0){
            for(int i = currentIndex; i<candidates.length; i++){
                current.add(candidates[i]);
                combinationSum(candidates, i, current, result,target - candidates[i]);
                current.remove(current.size()-1);
               }
            }  
         }
            
            public List<List<Integer>> combinationSum(int[] candidates, int target) {
                List<List<Integer>> result = new ArrayList<>();
                List<Integer> current = new ArrayList<>();
                combinationSum(candidates, 0, current, result, target);
                return result;
            }
        }