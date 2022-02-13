import java.util.*;
import java.lang.*;
import java.io.*;


class WorkAtTech{
	   // Brute Force;- T.C(O(n)), S.C = O(n);
	// Given a sorted array, remove all the duplicates and return the capacity of the array after removing the duplicates.            Note that you can use only constant extra space.

// 	   arr -> 1,2,4,4,5 -: 
// 	   i = 0(1), j = 0 arr[i](1)!=arr[i+1](2) -> result[0] = arr[0] -> result[1,];     i = 1, j = 1
// 	   i = 1(2), j = 1 arr[i](2)!=arr[i+1](4) -> result[1] = arr[1] -> result[1,2,];   i = 2, j = 2
// 	   i = 2(4), j = 2 arr[i](4)==arr[i+1](4) ->                   ->  result[1,2,];   i = 3, j = 2
// 	   i = 3(4), j = 2 arr[i](4)!=arr[i+1](5) -> result[2] = arr[3] -> result[1,2,4,]; i = 4, j = 3
// 	   i = 4(5), j = 3 there's no i+1 left so we have to move ith index till 3 only i.e arr.length-1;   
// 	   simply copy last element of arr(5) to result[3] -> result[1,2,4,5];
	   
	
	// 1-> Here, we are using two pointers i and j where:
	// i is moving as part of the for loop
	// j is moving conditionally and is used to put a unique element in the new array.
	
	
	public static int removeDuplicate(int[] arr){
		int[] result = new int[arr.length];
		int j = 0;
		for(int i = 0; i<arr.length-1; i++){
			if(arr[i]!=arr[i+1]){
				result[j] = arr[i];
				j++;
			}
		}
		result[j] = arr[arr.length-1];
		for(int i = 0; i<j; i++){
			arr[i] = result[i];
		}
		// return j;         /* The last index till element is unique is j */
		return j+1;         /* No of unique element is j+1 */
	}
	
	
	
	// 2 -> In constant space using two pointer approach
	// use the same i and j pointers instead of using a new array, updating the same array
	/*Here in the code j denotes jth distinct element and j wil
	 * always be j<=i */
	
	/* arr -> 1,2,4,4,5 -: 
	 * arr[0](1)!=arr[1](2) -> arr[j]/[0] = arr[0](1) -> arr[1,]
	 * arr[1](2)!=arr[2](4) -> arr[j]/[1] = arr[1](2) -> arr[1,2]
	 * arr[2](4)==arr[3](4) ->                        -> arr[1,2,]
	 * arr[3](4)!=arr[4](5) -> arr[j]/[2] = arr[3](4) -> arr[1,2,4,]
	 * arr[4](5) arr[5] Doesn't exit loop will compare till 3rd index.
	 * arr[j]/[3] = arr[arr.length-1][5] -> arr[1,2,4,5];
	 * j = 3 Till jth index there are unique element and j+1(4) unique element; 
	 * */
	public static int removeDuplicateUsingConstantSpace(int[] arr){
		int j = 0;
		for(int i = 0; i<arr.length-1; i++){
		     if(arr[i]!=arr[i+1]){
				arr[j] = arr[i];
				j++;
			}		
		}
			
		arr[j] = arr[arr.length-1];
		return j+1; // No of unique element;
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		int[] arr = {1,6,6,2,4,4,5,5,5};
		int capacity = removeDuplicate(arr);
		System.out.println(capacity);
		int capacity1 = removeDuplicateUsingConstantSpace(arr);
		System.out.println(capacity1);
		// for(int i = 0; i<arr.length; i++){
		// 	System.out.print(arr[i] + " ");
		// }
		// System.out.println(Arrays.toString(arr));
	}
}