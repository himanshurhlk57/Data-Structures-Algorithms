import java.util.*;
import java.lang.*;
import java.io.*;


class WorkAtTech{
	
	public static void main (String[] args) throws java.lang.Exception{
		   // Key    Value
		Map<String, Integer> map = new HashMap<>();
		
		// Insert into the hashmap
		map.put("abc", 1);
		map.put("def", 3);
		map.put("bca", 4);
		
		//Check if abc or def as a key is present in map or not
		if(map.containsKey("abc")){
			System.out.println("Map has abc");
		}
		
		// get value provide a key present in the hashmap and get the value associated with it
		int value = map.get("abc");
		System.out.println(value);
		
		
		// To avoid null pointer exception in case we want to get the value of a particular i.e not present in the map
		// we should do this way
	  int value1 = 0;
		if(map.containsKey("abc1")){
			value1 = map.get("abc1");
		}
		System.out.println(value1);
		
		
		//want to remove any key from the map
		map.remove("def"); // def as a key has been removed from the map
		
		
		//size of the map no of key present in the map
		System.out.println(map.size()); //Output 2 because def has been removed
		
		
      // abc is already present in the map if i again try to put the size will not be increase just the value of abc will be updated from 1 to 2
		map.put("abc", 2);
		
		// Itreate over a hashmap
		Set<String> keys = map.keySet();
		for(String key:keys){
			System.out.println(key);
		}
		
	}
}