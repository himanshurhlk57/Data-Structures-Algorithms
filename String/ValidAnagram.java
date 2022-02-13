import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech
{
	
	
	
    // public static boolean isAnagram(String s, String t) {
    //     if(s.length()!=t.length()){
    //         return false;
    //     }
    //     char[] s1 = s.toCharArray();
    //     char[] s2 = t.toCharArray();
    //     Arrays.sort(s1);
    //     Arrays.sort(s2);
    //     for(int i = 0; i<s1.length; i++){
    //         if(s1[i]!=s2[i]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
	
	
	// Using extra memory
	// will create a frequency map 
	// i.e for anagram ++
	// for char frequency
	// 	a      3
	// 	n      1
	// 	g      1
	// 	r      1
	// 	m      1
	// Now i.e for nagaram --
	// for char   frequency
	// 	a      0
	// 	n      0
	// 	g      0
	// 	r      0
	// 	m      0
	// 	so anagram and nagaram are valid anagram
	
	// char_counts[s.charAt(i)-'a']++;
	// char_counts[t.charAt(i)-'a']--;
	// char_counts[s.charAt(i)-'a'] -> char_counts['a'-'a'] -> char_counts[97-97] -> char_counts[0] =  1;
	// char_counts[s.charAt(i)-'a'] -> char_counts['n'-'a'] -> char_counts[110-97] = char_counts[13] = 1;
	    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] char_counts = new int[26];
        for(int i = 0; i<s.length(); i++){
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }   
        for(int count : char_counts){
            if(count!=0){
            return false;
            }
        } 
         return true;     
    }
	
	
	
	public static void main (String[] args) throws java.lang.Exception{
		
		char ch = 'n';
	    int value = (int)ch;
        System.out.println(value);
		
		
		String s = "anagram";
		String t = "nagaram";
		boolean answer = isAnagram(s,t);
		System.out.println(answer);
	}
}