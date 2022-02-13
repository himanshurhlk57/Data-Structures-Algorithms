// // Problem Statement:
// // Given a string s and a number k, find the number of vowels in every substring of size k.

// // Vowels: ['a', 'e', 'i', 'o', 'u']

// // Example
// // String: "workattech"
// // k: 3
// // Here, the substrings of size k and their vowel counts are:
// // wor => 1
// // ork => 1
// // rka => 1
// // kat => 1
// // att => 1
// // tte => 1
// // tec => 1
// // ech => 1
// // Answer: [1, 1, 1, 1, 1, 1, 1, 1]

// Brute Force
// The naive approach is to iterate over all the subarrays in the array, and if it is of length k, we can calculate the number of vowels in it and store it in a list.

// Analysis
// Time Complexity: O(n3)
// Space Complexity: O(1)


class Solution {
	int[] kSubstringVowels (String s, int k) {
		int n = s.length();
		int[] result = new int[n - k + 1];
		int iterator = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				if(j - i + 1 == k) {
					int counter = 0;
					for(int l = i; l <= j; l++) {
						if(s.charAt(l) == 'a' || s.charAt(l) == 'e' || s.charAt(l) == 'i' || s.charAt(l) == 'o' || s.charAt(l) ==          'u') {
							counter++;
						}
					}
					result[iterator] = counter;
					iterator++;
				}
			}
		}
		return result;
	}
}




//Using Sliding window technique

// We will use the sliding window technique to calculate the number of vowels in subarrays of size k in linear time. Using the sliding window technique we can check if the elements deleted and added into the window is a vowel or not based on which we change our answer, and store all the answers.

// Analysis
// Time Complexity: O(n)
// Space Complexity: O(1)

// // First find no of vowel in wor i.e 1

// to find no. of vowel in ork simply reduce the count of w character from wor and add the count of k character in wor we can obtain no. of vowel in ork
// for ork
// result[1,], count = 1
// count = count - vowelChecker(w) + vowelChecker(k) = 1 - 0 + 0 = 1; result[1,1,]
// for rka 
// count  = count - vowelChecker(o) + vowelChecker(a) = 1 - 1 + 1 = 1, result = [1,1,1,]
// and so on


class Solution {
	
    public static int vowelChecker(char ch){
    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
        return 1;
    }
    return 0;

}

int[] kSubstringVowels (String s, int k) {
    int[] result = new int[s.length()-k+1];
    int count = 0;
    for(int i = 0; i<k; i++){
        count = count + vowelChecker(s.charAt(i));
    }
    result[0] = count;
    for(int i = k; i<s.length(); i++){
        count  = count - vowelChecker(s.charAt(i-k)) + vowelChecker(s.charAt(i));
        result[i-k+1] = count;
    }
    return result;
}
}