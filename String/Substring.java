String str1 = "Coding";

System.out.println(str1.substring(2)); // starting from 2 index
output -> ding;

System.out.println(str1.substring(beiginIndex, endIndex));
System.out.println(str1.substring(1,5)); //odin
endIndex is exclusive, endIndex is not included in the result;
System.out.println(str1.substring(1,6)); //oding



import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech{
	
// 	Substring of a string -> Should be continous cant skip any character
// 		String str = "pqrs"
// 		No of Substring of a length n is -> n(n+1)/2
		
// 	   Printing Substring of str length wise -> p, q, r, s, pq, qr, rs, pqr, qrs, pqrs
	
// 		Print substring firstly start from p then from q then from r and so on -> p, pq, pqr, pqrs, q, qr, qrs, r, rs, s
	
	// j should go j<=str.length(); because in substring function end is exclusive .
	
	static void substringOfString(String str){
		for(int i = 0; i<str.length(); i++){
			for(int j = i; j<=str.length(); j++){
				System.out.print(str.substring(i,j) + " ");
			}
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		
		String str = "pqrs";
		substringOfString(str);
		
	}
}