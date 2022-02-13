// Subsequence :- > Subsequence means you can start from any character you can moe from left to right but you can skip the character in between.

// Longest Common Subsequence (LCS)
// Problem Statement:
// Given two strings s1 and s2, find the length of their longest common subsequence (LCS). If there is no common subsequence, return 0.

// The strings are composed of lower case English alphabets.

// A subsequence of a string is a string that can be derived by deleting some or no characters such that the order of the remaining characters remain the same.

// Example
// s1: "workattech"
// s2: "branch"
// Result: 4
// Explanation: Longest common subsequence is "rach"

// s1 = workattech
// s2 = branch

// Case 1 :->

// Lets say my n is at s1 h and my at s2 h 
// in both the string the h is common so it can be part of our answer i.e length 1
// now i will tell my recursion to give me longest commmon subsequence from c to w in s1 and c to b in s2

// Case 2 :->
// Lets say my n is at s1 e and my m at s2 n they are not equal so there can be two case
// get me the answer of i.e lcs of workatt and bran and workatte and bra
// in i-> case i.e workatt and bran answer is ra
// in ii-> case i.e workatte and bra answer is ra 
// so in some case the two value will differ so will take the maximum value between these two


// 1- Recursive code -> Time Complexity: O(2n)

// s1: "workattech"
// s2: "branch"
// Result: 4
// Explanation: Longest common subsequence is "rach"

class Solution {
	
	static int getLengthOfLCSUtil(String s1, String s2, int n, int m){
		
		if(n == 0 || m == 0){
			return 0;
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)){
			return 1 + getLengthOfLCSUtil(s1, s2, n-1, m-1);
		}else{
			return Math.max(getLengthOfLCSUtil(s1, s2, n-1, m), getLengthOfLCSUtil(s1, s2, n, m-1)); 
		}
	}
	
	int getLengthOfLCS(String s1, String s2) {
	return getLengthOfLCSUtil(s1, s2, s1.length(), s2.length());
	}
}


2 -> //Memoization code
// There will be lot of overlapping subproblems
// This can be avoided if we can just store the result of the recursive method
//  for each of the parameter combinations whenever it is called the first time. 
//  We can then directly return the result the next time the recursive method is 
//  called for the same parameter. Note that we only need to consider the parameters
//   that are changing across recursive calls.

// 1-> State expression with least parameters()
// 2-> Create a state relationship
// 3-> use memoization or tabulation

// Whatever is the result set it the state expression(Use the state relationship to set the dp value before returning)
// Return the state expression 

// The length of longest common subsequence will always be greater than equal to 0
// it can never be negative so we can initialize the 2d array with -1;
// If the 2d array contains -1 then we will call it if there is some number other than -1
// in that case we will use the value instead of calling it.

// MAking 2d array means that in the cell 2,3 i will keep the answer when s1 length
// is 2 and s2 length is 3 till then what's the length of longest subsequence

// s1: "workattech"
// s2: "branch"
// Result: 4
// Explanation: Longest common subsequence is "rach"

class Solution {
	
	//Check if dp[n][m] already contains answer
	//State expression -> dp[n][m] n and m are changing throughout
	//State relationship -> dp[n][m] = result;
	// return state expression -> dp[n][m];

	
	static int getLengthOfLCSUtil(String s1, String s2, int n, int m, int[][] dp){
		
		if(dp[n][m]!=-1){
			return dp[n][m];
		}
		
		if(n == 0 || m == 0){
			return 0;
		}
		
		if(s1.charAt(n-1) == s2.charAt(m-1)){
			dp[n][m] = 1 + getLengthOfLCSUtil(s1, s2, n-1, m-1, dp);
		}else{
			dp[n][m] = Math.max(getLengthOfLCSUtil(s1, s2, n-1, m, dp), getLengthOfLCSUtil(s1, s2, n, m-1, dp)); 
		}
		return dp[n][m];
	}
	
	int getLengthOfLCS(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[n+1][m+1];
		for(int i = 0; i<=n; i++){
			Arrays.fill(dp[i], -1);
		}
	return getLengthOfLCSUtil(s1, s2, s1.length(), s2.length(), dp);
	}
}


// 3rd bottom up approach Making 2d grid 
so will make 2d matrix of size n+1, and m+1

Lets take Example of two string s1 = acde, s2 = acef
      0 1 2 3
      a c d e
0 a
1 c
2 e
3 f

The box 2,3 means we are considering the subproblem ace and acd
The box 1,0 means we are considering the sub of ac and a
and so on and finally our answer will be given by acef and acde box i.e last box


class Solution {
	
	// s1: "workattech"
	// s2: "branch"
	// Result: 4
	// Explanation: Longest common subsequence is "rach"
		
		public static int getLengthOfLCSUtil(String s1, String s2, int n, int m){
			
			// Construction
			int[][] dp = new int[n+1][m+1];
			
			//Tabulation
			for(int i = 0; i<=n; i++){
			 for(int j = 0; j<=m; j++){
			if(i == 0 || j == 0){
				dp[i][j] = 0;
			}
			else if(s1.charAt(i-1) == s2.charAt(j-1)){
				dp[i][j] = 1 + dp[i-1][j-1];
			}else{
				dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			   }
			  }
			}
			
			//Return
			return dp[n][m];
			
		}
		
		int getLengthOfLCS(String s1, String s2) {
			int n = s1.length();
			int m = s2.length();
			 int result = getLengthOfLCSUtil(s1, s2, n, m);
			return result;
		}
	}
