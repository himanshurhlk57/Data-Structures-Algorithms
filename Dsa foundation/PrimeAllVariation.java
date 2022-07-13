import java.util.*;
import java.lang.*;
import java.io.*;

// A Prime number is a number that has exactly two divisors → 1 and itself.
// Note: 1 is not a prime number.

class WorkAtTech {

	// 1 Check whether a given number is prime or not
	static void checkPrime(int number) {
		if (number <= 1) {
			System.out.println(number + " is not prime");
			return;
		}
		int count = 0;
		for (int div = 2; div * div <= number; div++) {
			if (number % div == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println(number + " is a prime");
		} else {
			System.out.println(number + " is not prime");
		}
	}

	// 2 Print prime number between upto number
	static boolean isThisPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int div = 2; div * div <= num; div++) {
			if (num % div == 0) {
				return false;
			}
		}
		return true;
	}

	static void printUptoN(int num) {
		for (int i = 2; i <= num; i++) {
			if (isThisPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	// 3 Prime number between a and b

	static void printPrimeBetweenAandB(int number1, int number2) {
		for (int n = number1; n <= number2; n++) {
			if (n == 0 || n == 1) {
				continue;
			}
			int count = 0;
			for (int div = 2; div * div <= n; div++) {
				if (n % div == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}

	// 4 Prime Upto N
	// Given a number, find all the prime numbers from 1 to that number.
	// primesUptoN(20) → 2, 3, 5, 7, 11, 13, 17, 19
	static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		for (int div = 2; div * div <= number; div++) {
			if (number % div == 0) {
				return false;
			}
		}
		return true;
	}

	static List<Integer> primesUptoN(int n) {
		List<Integer> result = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i) == true) {
				result.add(i);
			}
		}
		return result;
	}

	// 5 Nth higher prime number from that number
	static boolean isThisPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int div = 2; div * div <= num; div++) {
			if (num % div == 0) {
				return false;
			}
		}
		return true;
	}

	static int nthPrimeNumber(int Num, int n) {
		int counter = 0;
		int result = 0;
		for (int n1 = Num;; n1++) {
			if (isThisPrime(n1) == true) {
				counter++;
			}
			if (counter == n) {
				result = n1;
				break;
			}
		}
		return result;

	}

	// Optimal Approach
	// We can precompute all the primes from 1 to N in N * log(logN) time complexity
	// using the Sieve of Eratosthenes.

	// In this algorithm, we initially consider all the numbers from 1 to N to be
	// primes, then we iterate over all the numbers from 2 to sqrt(N), and if we
	// find a prime number, then we mark all its multiples as non-prime.

	// At the end of the algorithm, only the prime numbers remain unmarked and so we
	// can decide if a number is prime in constant time.

	// Analysis
	// Time Complexity: O(N * log(logN) + N)
	// Space Complexity: O(n)

	// Sieve of Eratosthenes.

	class Solution {
		List<Integer> primesUptoN(int n) {

			boolean[] primes = new boolean[n + 1];
			for (int i = 0; i <= n; i++) {
				primes[i] = true;
			}
			for (int i = 2; i * i < primes.length; i++) {
				if (primes[i] == true) {
					for (int j = i; j * i < primes.length; j++) {
						primes[i * j] = false;
					}
				}
			}
			List<Integer> result = new ArrayList<>();
			for (int i = 2; i <= n; i++) {
				if (primes[i] == true) {
					result.add(i);
				}
			}
			return result;

		}
	}

	// Given an integer n, return the number of prime numbers that are strictly less
	// than n.
	// Input: n = 10
	// Output: 4
	// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

	class Solution {
	public int countPrimes(int n) {
		 
		 boolean[] primes = new boolean[n];
		 for(int i = 0; i<primes.length; i++){
			 primes[i] = true;
		 }
		 
		 for(int i = 2; i*i<primes.length; i++){
			 if(primes[i]==true){
				 for(int j = i; j*i<primes.length; j++){
					 primes[i*j] = false;
				 }
			 }
		 }
		 int countPrimes = 0;
		 for(int i = 2; i<primes.length; i++){
			 if(primes[i]){
				 countPrimes++;
			 }
		 }
		 return countPrimes;

		public static void main(String[] args) throws java.lang.Exception {

			checkPrime(1);

			printUptoN(20);

			printPrimeBetweenAandB(30, 60);

			List<Integer> result = primesUptoN(20);
			for (int i = 0; i < result.size(); i++) {
				System.out.print(result.get(i) + " ");
			}
			System.out.println();

			int nthPrimeNumberFromThatNumber = nthPrimeNumber(38, 10);
			System.out.println(nthPrimeNumberFromThatNumber);

		}
}