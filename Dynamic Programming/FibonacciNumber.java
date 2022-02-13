
import java.util.*;
import java.lang.*;
import java.io.*;

// Q -> In mathematics, the Fibonacci numbers (Fn) form a sequence, called the Fibonacci sequence, such that each number is the sum of the previous two numbers.

// The first number in the sequence (F1) is 0, the second number (F2) is 1.


// Given a number (n), print the nth number in the fibonacci sequence using recursion.

class WorkAtTech{
	
// ** Recursive ** approach
// Time Complexity: O(2^n)
	
	public static int fibonacci(int n){
		if(n == 0 || n == 1){
			return n;
		}
		int fibnm1 = fibonacci(n-1);
		int fibnm2 = fibonacci(n-2);
		return fibnm1 + fibnm2;
	}
	
// ** Memoization ** (Memoization is a process in which we store the result of each recursive call (subproblem) and use that to compute the result of the problem.)
		
// 1-> Identify if the problem can be solved using DP
// 2-> Come up with the state expression with the least parameters(we only need to consider the parameters that are changing across recursive calls.)
// 3-> Create a state relationship
// 4-> Use memoization or tabulation
	
	// Time Complexity: O(n)
	
	public static int fibonacciMemoization(int n, int[] dp){
		if(dp[n] != -1){
			return dp[n];
		}
		if(n == 0 || n == 1){
			return n;
		}
		// state expression -> dp[n] n is changing across recursive calls;
		// state relationship
		dp[n] = fibonacciMemoization(n-1, dp) + fibonacciMemoization(n-2, dp);
		return dp[n];
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		
		int n = 5;
		System.out.println(fibonacci(n));
		
		int[] dp = new int[n+1];
	    Arrays.fill(dp, -1);
	    int result = fibonacciMemoization(n, dp);
        System.out.println(result);		
	}
}