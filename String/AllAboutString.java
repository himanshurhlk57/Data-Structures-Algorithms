import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech {

	public static void main(String[] args) throws java.lang.Exception {

		// Print ASCII value of any character
		// ASCII value of character varies from

		// 1-> 0-32 (Teletypes)
		// 2-> 48-57 (Numbers)
		// 3-> 65-90 (Alphabet Capital)
		// 4-> 97-122 (Alphabet small)

		char ch = 'a';
		char ch1 = '#';
		char ch2 = '1';
		int value = ch;
		int value1 = ch1;
		int value2 = ch2;
		System.out.println(value); // 97
		System.out.println(value1); // 35
		System.out.println(value2); // 49

		// ASCII code is the numerical repersentation of a character such as 'a', '1',
		// '@', '#';
		// Every character has a code which is known as ASCII code.
		// x='a', x= 97 Both are same;
		// Any character takes 1 byte of memory whereas 1 byte equals to 8 bits(1 byte =
		// 8 bits)
		// ch = 'a'; for its value to be stored in capacitor of ram we have to convert
		// it into 0's and 1's because capacitor only store 0's and 1's so for this
		// every character has it ASCII value assigned to it for 'a' its 97.
		// 'a' -> 97(ASCII), 97 in Binary -> 0 1 1 0 0 0 0 1

		// Lets say we want to add to string nums1 = "123" and nums2 = "78" Both nums1
		// and nums2 are string and each of these digits are character.
		// ASCII values of numbers range from 48-57
		// 48 - '0', 49 - '1', 50 - '2', 51, '3', 52 - '4', 53 - '5', 54 - '6', 55 -
		// '7', 56 - '8', 57 - '9';
		// Lets convert '3' into number for that we know '3' ASCII is 51 to obtain 3
		// from 51 we have to subtract 48 from it i.e '0'
		// 51 - 48 = 3, i.e '3' - '0';

		// Uppercase LowerCase Numbers Condition
		//
		// if(str[i]>=65 and str[i]<=90) then it is uppercase letter
		// if(str[i]>=97 and str[i]<=122) then it is lowerCase letter
		// if(str[i]>=48 and str[i]<=57) then it's a number;

		// Convert String to CharArray
		// public boolean isAnagram(String s, String t){
		// char[] ch1 = s.toCharArray();
		// }

		/*
		 * 1->
		 * String also internally stores a character array where all the
		 * character you want to store are put.
		 * You can think of a string as wrapper over the character array.
		 * 
		 * 2->
		 * Empty string with two double quotes together and nothing in between.
		 * String str = "";
		 * length of this string is 0;
		 * String str = " ";
		 * Length of this string is 1;
		 * 
		 * 3 ->
		 * String str1 = "Coding";
		 * String str2 = " is fun";
		 * System.out.println(str1 + str2); // Output -> Coding is fun
		 * or
		 * str1 = str1.concat(str2);
		 * System.out.println(str1);
		 * 
		 * 4 -> Compares two strings are equal or not
		 * System.out.println(str1.equals(str2)); //false
		 * 
		 */
	}
}