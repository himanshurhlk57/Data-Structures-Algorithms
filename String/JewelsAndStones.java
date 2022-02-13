import java.util.*;
import java.lang.*;
import java.io.*;

// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

// Example 1:

// Input: jewels = "aA", stones = "aAAbbbb"
// Output: 3


// Brute Force


    public int numJewelsInStones(String jewels, String stones) {
          char[] ch1 = jewels.toCharArray();
        char[] ch2 = stones.toCharArray();
        int count = 0;
        for(int i = 0; i<ch1.length; i++){
            for(int j =0; j<ch2.length; j++){
                if(ch1[i]==ch2[j]){
                    count++;
                }
            }
        }
        return count;
    
    }


  public int numJewelsInStones(String jewels, String stones) {
          char[] ch1 = jewels.toCharArray();
          char[] ch2 = stones.toCharArray();
        int count = 0;
       HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<ch1.length; i++){
            set.add(ch1[i]);
        }
        for(int i =0; i<ch2.length; i++){
            if(set.contains(ch2[i])){
                count++;
            }
        }
        return count;
    
    }

class WorkAtTech{
	public static void main (String[] args) throws java.lang.Exception{
		
	}
}