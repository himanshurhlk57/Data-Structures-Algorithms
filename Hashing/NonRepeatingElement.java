// Given a sorted list of numbers in which all elements appear twice except one element that appears only once, find the number that appears only once.

// Example:
// 1, 1, 2, 3, 3, 4, 4
// Here, ‘2’ appears once and all other elements appear twice.

// findNonRepeatingElement([1, 1, 2, 3, 3, 4, 4]) => 2


/* create a hashmap of key as an integer and its value as an integer
traverse the given array and check if that element is already present in
the hashmap if it is already present in the hashmap found its value(i.e no of times it is in the hashmap)
and increase its count by 1.
if the given array element is not present in the hashmap put it in the 
hashmap with the count 1
lastly traverse the hashmap if any key(arrayelement) has value(count) equals
1 return that element else -1 as simple as that. 
*/

class Solution {
	int findNonRepeatingElement (int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i<arr.length; i++){
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i]);
				map.put(arr[i], count+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		 // for(int answer: map.keySet()){
		 // if(map.get(answer)==1){
		 // return answer;
		 // }
		 // }
		
		  for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (map.get(key) == 1) {
                return key;
            }
        }
		
		return -1;
	}
}