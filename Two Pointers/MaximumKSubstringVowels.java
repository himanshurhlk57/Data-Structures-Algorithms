// Problem Statement:
// Given a string s and a number k, find the maximum number of vowels in any substring of size k.

// Vowels: ['a', 'e', 'i', 'o', 'u']

// Example
// String: "workaattech"
// k: 3
// Here, the substrings of size k and their vowel counts are:
// wor => 1
// ork => 1
// rka => 1
// kaa => 2
// aat => 2
// att => 1
// tte => 1
// tec => 1
// ech => 1
// Answer: 2

// Sliding Window Technique

class Solution {
	
	public static boolean vowelChecker(char ch){
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			return true;
		}else{
			return false;
		}
	}

    or Both FUnction work same different way of writing same thing

    public static boolean vowelChecker(char ch){
		   return (ch == 'a' || ch == 'e' || ch == 'i' | ch == 'o' || ch == 'u');
	}
	
	int maxKSubstringVowels(String s, int k){
	   int maximum = 0;
	   int count = 0;
		for(int i = 0; i<k; i++){
			if(vowelChecker(s.charAt(i))){
				count++;
			}
		}
		maximum = Math.max(count, maximum);
		for(int i = k; i<s.length(); i++){
			if(vowelChecker(s.charAt(i-k))){
				count--;
			}
			if(vowelChecker(s.charAt(i))){
				count++;
			}
			maximum = Math.max(count, maximum);
		}
		return maximum;
	}
	
}

// We will use the sliding window technique to calculate the number of vowels 
// in subarrays of size k in linear time. Using the sliding window technique 
// we can check if the elements deleted and added into the window is a vowel 
// or not based on which we change our answer. Then we will take the maximum 
// answer over all the subarrays.

// or using sum i.e the vowelChecker function will return either 0 or 1 
// if its a vowel or not notice here vowelChecker function is returning 1 or 0 not true or false


class Solution {
	
	public static int vowelChecker(char ch){
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			return 1;
		}
		return 0;

	}

	int maxKSubstringVowels(String s, int k){
	   int maximum = 0;
	   int count = 0;
		for(int i = 0; i<k; i++){
		   count = count + vowelChecker(s.charAt(i));
		}
		maximum = Math.max(count, maximum);
		for(int i = k; i<s.length(); i++){
			count = count - vowelChecker(s.charAt(i-k)) + vowelChecker(s.charAt(i));
			maximum = Math.max(count, maximum);
		}
		return maximum;
	}
	
}