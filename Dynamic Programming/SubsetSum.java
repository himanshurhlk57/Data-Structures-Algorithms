1 -> Recursion

Analysis
Time Complexity: Exponential
Space Complexity: O(1)

class Solution {
	
	static boolean hasValidSubsetUtil(int[] A, int n, int target){
		
		if(target == 0){
			return true;
		}
		if(n == 0){
			return false;
		}
		  if(A[n-1] > target){
			  return hasValidSubsetUtil(A, n-1, target);
		}	
		return hasValidSubsetUtil(A, n - 1, target - A[n-1]) || hasValidSubsetUtil(A, n-1, target);
	}
	
	boolean hasValidSubset(int[] A, int target) {
	   boolean answer = hasValidSubsetUtil(A, A.length, target);
	   return answer;
	}
}


2 -> Memoization

Analysis
Time Complexity: O(n * target)
Space Complexity: O(n * target)

class Solution {
	// 2 -> Memoization
	// i -> state expression -> dp[n][target] n and target are changing throughout the function call
	// ii -> state relationship -> dp[n][target] = store answer
	// iii -> return state expression
	static boolean hasValidSubsetUtil(int[] A, int n, int target, Boolean[][] dp){
		
		if(dp[n][target] != null){
			return dp[n][target];
		}
		
		if(target == 0){
			return true;
		}
		if(n == 0){
			return false;
		}
		
		
		  if(A[n-1] > target){
			  dp[n][target] = hasValidSubsetUtil(A, n-1, target, dp);
			  return dp[n][target];
		}	
		dp[n][target] = hasValidSubsetUtil(A, n - 1, target - A[n-1], dp) || hasValidSubsetUtil(A, n-1, target, dp);
		return 	dp[n][target]; 
	}
	
	boolean hasValidSubset(int[] A, int target){
	  
	   Boolean[][] dp = new Boolean[A.length + 1][target + 1];
	   boolean answer = hasValidSubsetUtil(A, A.length, target, dp);
	   return answer;
	}
}