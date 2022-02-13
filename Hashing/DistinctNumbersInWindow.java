// Given an array A and a value k, find the number of distinct elements in each window (subarray) of size k.

// Example
// A: [1, 1, 2, 1, 4, 6, 5]
// k: 3
// Result: [2, 2, 3, 3, 3]

// A: [1, 1, 2, 1, 4, 6, 5]
// k: 3
// Result: [2, 2, 3, 3, 3]

*Sliding Window + HashMap*

* For reference *
  HashMap<Integer, Integer> map = new HashMap<>();
  map.put(2,1);
  map.put(2,2);
  map.put(2,6);
  System.out.println(map.size()); // size 1
  int value = map.get(2);         // value 6
  System.out.println(value);

// Why the hashmap is working in finding the number of distinct element in the window is that if we put any element with its frequency in the hashmap and again the same element we try to put in the map with different value it just update its frequency(value) in the map and doesn't add the same element twice.

// map.put(2,1);
// Map [ 2 ,    1]
//      key  value
// Initially value of 1 i.e 1 get its value and add 1 to it and then put in the map
// map.put(2,1+1)
// Map [ 2 ,    2]
//      key  value	



// * Dry Run *

// Put the frequency of element till k window in the hashmap
// Initially the element will not be present in the hashmap 
// For 1 initially it is not present in the hashmap and if we try to get it value
// it will return null so to avoid this error will use getOrDefault function
// whatever you want to get default value you can keep in the function
// i will keep 0 if the key is not present i will get 0 and add 1 to it
// and put (1, 1) in the map, again i encounter 1 it will update its value 
// in the hashmap to 2 same for 2. We check for the k size window whatever
// is the size of hashmap right now is the distinct number of element in 
// the k size window i.e 2 so put this value in the resultant array.

// |  1 -2        |
// |  2 -1        |
// |              |
// |              |
// ----------------
 /*   HashMap */

// Now check for the next 3 size window i.e 1 2 1
// For that i will use previous stored value i.e already present in the hashmap
// From the previous window that was 1 1 2, i need to remove 0th index element
// i.e(1) and add kth index element i.e 1(k). Will get next window i.e 1 2 1
// How will we remove is just if any element is present in the hashmap there can be two case if its frequency is 2 then decrease its frequency by 1 and if its frequency is already 1 then remove that element i.e map.remove(A[i-k]) if it is not present then add that element with its frequency in the map.
// And whatever is the size in that window will be the no. of distinct element in that window add the size in the resultant array.
	





class Solution {
	int[] distintNumbersInWindow(int[] A, int k) {
	    int[] result = new int[A.length-k+1];
		int p = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<k; i++){
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
		}
		result[p] = map.size();
		p++;
		for(int i = k; i<A.length; i++){
			if(map.get(A[i-k]) == 1){
				map.remove(A[i-k]);
			}else{
				map.put(A[i-k], map.get(A[i-k])-1);
			}
			map.put(A[i], map.getOrDefault(A[i], 0) + 1);
			result[p] = map.size();
			p++;
		}
		return result;
	}
}
