
import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech{ 
	
	
// Question 1-> Reverse Word In A String
	
	static String reversedWord(String str){
		String reversedWord = "";
		for(int i = str.length()-1; i>=0; i--){
			reversedWord = reversedWord + str.charAt(i);
		}
		return reversedWord;
	}
		
	
// Question 2 -> Reverse every word in a string
	// Given String -> abc def ghi
	// ->(Index)        012345678910 
	// abc word is ending at 2 index because 3 index is space abc word is starting at 0th index
	// 	Initally currentWordStar = (0);
	//     If at index (i) I found space so 
	// 	currentWordEnd will be (i-1);
	
	static String reverseEveryWordString(String str){
		String answer = "";
		int currentWordStart = 0;
		int i = 0;
		for(; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				int currentWordEnd = i - 1;
				String reversedWord = "";
				for(int j = currentWordEnd; j>=currentWordStart; j--){
					reversedWord = reversedWord + str.charAt(j);
				}
				answer = answer + reversedWord + " ";
				currentWordStart = i + 1;
			}
		}
		int currentWordEnd = i - 1;
		String reversedWord = "";
		for(int j = currentWordEnd; j>=currentWordStart; j--){
			reversedWord = reversedWord + str.charAt(j);
		 }
		answer = answer + reversedWord;
		return answer;
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		
		String str1 = "abc def ghi";
		System.out.println(reverseEveryWordString(str1));
		
		String str2 = "rohit";
		System.out.println(reversedWord(str2));
		
	}
}