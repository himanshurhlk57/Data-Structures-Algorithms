Want to generate the subsets of -> [1, 2, 3]

Each element has two choices either it can be present in subset or it could be absent in subset
 
/*
Subsets->
For nums[] = [1] = 2^n -> 2 
i.e [1], []

For nums[] = [1, 2, 3](2^n)->(8)
Number of subset -> [], [1], [1 2], [1 3], [1 2 3], [2], [2 3], [3]

I am going to take decision for 1 and recursion is going to give answer for 2 3 4 5 6 part

                         1  2  3 4 5 6
   (1 present)"1" 2 3 4 5 6          (1 not present)2 3 4 5 6

                               [7 8 9]

                     [7]                       []

             [7 8]          [7]          [8]        []

      [7 8 9]    [7 8]  [7 9]   [7]  [8 9]  [8]  [9]  []

   The leaf node of the decision tree is our subset of nums[7 8 9]

                              [1 2 3]

                     [1]                       []

             [1 2]          [1]          [2]        []

      [1 2 3]    [1 2]  [1 3]   [1]  [2 3]  [2]  [3]  []

      first i have consider 1 so in my currentlist will add 1 then consider 2 add 2 in currentlist
      then add 3 in currentlist so my currentlist is 1 2 3(I am at this position)
      Now i dont want to consider 3 so to reach at 1 2 i have to remove 3 so will do backtracking by
      removing 3 from the currentList. This is known as backtracking so now reached at 1 2 so will make 
      copy of it and it into my listoflist. 
      Now at 1 2 now lets assume i dont consider 2 so to reach 1 i have to remove 2 from current
      this is nothing but backtracking so reached 1.. and so on.
            

*/

class Solution {
	
	static void subsetsUtil(int[] A, int start, List<Integer> current, List<List<Integer>> answer){
		if(start == A.length){
			answer.add(new ArrayList<Integer>(current));
			return;
		}
		current.add(A[start]);
		subsetsUtil(A, start + 1, current, answer);
		current.remove(current.size()-1);
		subsetsUtil(A, start+1, current, answer);
	}
	
	List<List<Integer>> subsets(int[] A) {
	    List<Integer> current = new ArrayList<>();
		List<List<Integer>> answer = new ArrayList<>();
		subsetsUtil(A, 0, current, answer);
		return answer;
	}
}


// * * * * * * * * //
// Subset II
// remove duplicates 
Given an array of integers A, return all possible subsets. The array might contain duplicates.

Note: The list should not contain any duplicate subsets.

class Solution {
	
        static void subsetsUtil(int[] nums, int currentIndex, List<Integer> currentSubset, Set<List<Integer>> result){
     
     if(currentIndex == nums.length){
         result.add(new ArrayList(currentSubset));
         return;
     }
     
     currentSubset.add(nums[currentIndex]);
     subsetsUtil(nums, currentIndex + 1, currentSubset, result);
     currentSubset.remove(currentSubset.size()-1);
     subsetsUtil(nums, currentIndex+1, currentSubset, result);
     
 }
 
     
     List<List<Integer>> subsets(int[] A) {
        List<Integer> currentSubset = new ArrayList<>();
             Arrays.sort(A);
     Set<List<Integer>> result = new HashSet<>();
     subsetsUtil(A, 0, currentSubset, result);
     return new ArrayList(result);
     }
}


// way two using for loop

class Solution {
	
    static void subsetsUtil(int[] nums, int currentIndex, List<Integer> currentSubset, Set<List<Integer>> result){
     
      result.add(new ArrayList(currentSubset));

     for(int i = currentIndex; i<nums.length; i++){
     currentSubset.add(nums[i]);
     subsetsUtil(nums, i + 1, currentSubset, result);
     currentSubset.remove(currentSubset.size()-1);
     }
   
 }
 
 
 List<List<Integer>> subsets(int[] A) {
    List<Integer> currentSubset = new ArrayList<>();
     Arrays.sort(A);
     Set<List<Integer>> result = new HashSet<>();
     subsetsUtil(A, 0, currentSubset, result);
     return new ArrayList(result);
 }
}


// Leetcode version 


// The Basic Idea is to use HashSet to remove the duplicates and procede as you solve the Subset problem, that is either choose a particular element or not choose.
// Also don't forget to sort the array beforehand so that there is no duplicate ordering of the numbers inside the final answer!

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        helper(nums,0,ans,new ArrayList<Integer>());
        List<List<Integer>> newAns = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(List<Integer> curr : ans){
            set.add(curr);
        }
        for(List<Integer> curr : set){
            newAns.add(curr);
        }
        return newAns;
    }
    public void helper(int[] nums, int i, List<List<Integer>> ans, ArrayList<Integer> curr){
        if(i == nums.length){
            ans.add(new ArrayList<Integer>(curr));
            return;
        }
        curr.add(nums[i]);
        helper(nums,i+1,ans,curr);
        curr.remove(curr.size()-1);
        helper(nums,i+1,ans,curr);
    }
}