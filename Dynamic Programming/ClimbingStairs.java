// Climbing Stairs
// Problem Statement:
// There is a staircase with n steps. You need to reach the top and you can either climb 1 step or 2 steps at a time.

// In how many distinct ways can you reach the top of the staircase.

// Examples
// n: 2
// Answer: 2
// Explanation: [[1, 1], [2]]

No of paths from 0 to N Or from N to 0 wil be same.
I can only take 1 step or 2 step
Lets say i take 1 step i will reach at n-1 now there will be path from n-1 to 0 so the total path will be 1 + path from n-1 to 0;
Lets say i take 2 step i will reach at n-2 now there will be path from n-2 to 0 so the total path will be 2 + path from n-2 to 0;

1-> Recursive Code -> T.C = O(2^n);


class Solution {
	int climbStairs(int n) {
		if(n == 1 || n == 2){
			return n;
		}
        int countToOne = climbStairs(n-1);
        int countToTwo = climbStairs(n-2);
        return countToOne + countToTwo;
	}
}

2-> Memoization

T.C -> O(n)
S.C -> O(n)

class Solution {
	
    public static int climbStairsUtil(int n, int[] dp){ 
      if(dp[n]!=-1){
       return dp[n];
      }
        if(n == 0 || n == 1 || n == 2){
          return n;
      }
      int count = climbStairsUtil(n-1, dp);
      int count1 = climbStairsUtil(n-2, dp);
      dp[n] = count + count1;
      return dp[n];
  }
  
  int climbStairs(int n) {
      int[] dp = new int[n+1];
      Arrays.fill(dp, -1);
      int answer = climbStairsUtil(n, dp);
      return answer;
  }
}


3-> Tabulation 
T.C -> O(n)
S.C -> O(n)

class Solution {
	
	public static int climbStairsTabulation(int n){
		
		//Construction
		int[] dp = new int[n+1];

		//Tabulation
		for(int i = 0; i<=n; i++){
		 if(i == 0 || i == 1 || i == 2){
			dp[i] = i;
		}else{
		int countToOne = dp[i-1];
        int countToTwo = dp[i-2];
			 dp[i] = countToOne + countToTwo;
		   }
		}
		
		// Return
        return dp[n];
	}
	
	int climbStairs(int n) {
		
		int answer = climbStairsTabulation(n);
		return answer;
	}
}