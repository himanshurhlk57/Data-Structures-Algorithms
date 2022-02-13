// Problem Statement:
// You are given a rod of length n, and an array prices of size n which contains the prices of rods of lengths 1 to n. Find the maximum amount you can make if you cut up the rod optimally.

// Example
// n: 8
// A: [1, 3, 4, 5, 7, 9, 10, 11]
// Result: 12
// Explanation: Rods of length 2 and 6 cost: 3 + 9

class Solution {
    
    // Test case :-
    // 6
    // 3 5 8 10 14 15
    // 1 2 3  4  5  6 
    // rod of 1 length 6 times  - > 3 * 6 = 18;
        
    // 7
    // 2 8 11 14 15 19 21
    // 1 2 3  4   5  6  7
    // rod of length 2, 2times and rod of length 3 1 times -> 8 * 2 + 11 = 27
    
        1 -> Recursion
         
        static int maximumProfitUtil(int[] rod, int[] prices, int n, int k){
            if(n == 0 || k == 0){
                return 0;
            }
            int exclude = maximumProfitUtil(rod, prices, n-1, k);
            int answer = exclude;
            if(rod[n-1] <= k){
                answer = Math.max(maximumProfitUtil(rod, prices, n, k - rod[n-1]) + prices[n-1], exclude);
            }
            return answer;
        }
           
        
        int maximumProfit(int n, int[] prices){
            int[] rod = new int[n];
            for(int i = 0; i<rod.length; i++){
                rod[i] = i+1;
        
            }
            // System.out.println(Arrays.toString(rod));
            int k = rod.length;
            int result = maximumProfitUtil(rod, prices, n, k);
            return result;
        }
    }
    
    
    2 -> Memoiztation
    
    
    class Solution {
         
        static int maximumProfitUtil(int[] rod, int[] prices, int n, int k, int[][] dp){
            if(dp[n][k]!=-1){
                return dp[n][k];
            }
            if(n == 0 || k == 0){
                return 0;
            }
            int exclude = maximumProfitUtil(rod, prices, n-1, k, dp);
            int answer = exclude;
            if(rod[n-1] <= k){
                answer = Math.max(maximumProfitUtil(rod, prices, n, k - rod[n-1], dp) + prices[n-1], exclude);
            }
            dp[n][k] = answer;
            return answer;
        }
           
        
        int maximumProfit(int n, int[] prices){
            int[] rod = new int[n];
            for(int i = 0; i<rod.length; i++){
                rod[i] = i+1;
        
            }
            // System.out.println(Arrays.toString(rod));
            int k = rod.length;
            int[][] dp = new int[n+1][k+1];
            for(int i = 0; i<=n; i++){
                Arrays.fill(dp[i], -1);
            }
            int result = maximumProfitUtil(rod, prices, n, k, dp);
            return result;
        }
    }
    
    
      3 -> Tabulation
        
        static int maximumProfitUtil(int[] rod, int[] prices, int n, int k){
            // 1-> Creation
            int[][] dp = new int[n+1][k+1];
            
            // 2-> Tabulation
            for(int i = 0; i<=n; i++){
              for(int j = 0; j<=k; j++){
                 if(i == 0 || j == 0){
                     dp[i][j] = 0;
            }else{
            int exclude = dp[i-1][j];
            int answer = exclude;
            if(rod[i-1] <= j){
                answer = Math.max(dp[i][j - rod[i-1]] + prices[i-1], exclude);
             }
              dp[i][j] = answer;
                    }
                }
            }
            
            // 3-> Return
            return dp[n][k];
        }
           
        
        int maximumProfit(int n, int[] prices){
            int[] rod = new int[n];
            for(int i = 0; i<rod.length; i++){
                rod[i] = i+1;
        
            }
            // System.out.println(Arrays.toString(rod));
            int k = rod.length;
            int result = maximumProfitUtil(rod, prices, n, k);
            return result;
        }
    }
    
    
    
    
    
    
    