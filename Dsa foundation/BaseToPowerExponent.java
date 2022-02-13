import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech
{
	// if we want to find the 2(any base) to the power any number(exponent) here we can compute a^n this way
	// The time complexity in this case is O(n) as the recurrence relation of this algoritm is T(n) = T(n-1) + 1
	
// 	** 1st way T.C = O(n)
//     public static int power(int base, int exponent) {
// 	if(exponent == 0) {
// 		return 1;
// 	}
// 	return base*power(base, exponent - 1);
// 	}
 
// 	2nd way
// Now lets say what happens when we find the a^n based on first finding a^n/2. We are actually dividing the problem into half at each stage if n is odd then will solve other way if n is even then will solve other way eventually we must be getting some benefit.
// 		if n is even then simply return a^n/2*a^n/2 ex:- 2^4 = 2^2 * 2^2
// 	    if n is odd(7) then exponent will 7/2 i.e 3 if we need to find a^n by dividing a^n/2 then we have to multiply base(a) also i.e a*a^n/2*a^n/2
// 			example 2^7 7/2 = 3 2*2^7/2*2^7/2 = 2*2^3*2^3 = 2^7
			
// 	    All if condition and return statement: constant operations
// 		power(base, exponent/2) = T(n/2);
// 	    Recurrence relation = T(n) = T(n/2) + 1
// 		T.C = O(logn) 
// 		we were able to improve the T.C from O(n) to O(logn)
// 		The strategy is known as decrease and conquer where we decrease the input in the subproblem at each level;

// The strategy that we have followed till now in all our recursive solutions is known as decrease and conquer where we decrease the input in the subproblem at each level.

// Examples
// factorial(n) = n*factorial(n-1)
// sum(n) = n + sum(n-1)
// search(arr, n, val) = search(a, n-1, val)
// power(a, n) = (power(a, n/2))2
		
		public static int power(int base, int exponent){
		if(exponent == 0){
			return 1;
		}
		int root  = power(base, exponent/2);
			if(exponent%2 == 0){
				return root*root;
			}
			return base*root*root;
	}
	public static void main (String[] args) throws java.lang.Exception{
		Scanner scn = new Scanner(System.in);
		int base  = scn.nextInt();
		int exponent = scn.nextInt();
		System.out.println(power(base,exponent));

	}
}