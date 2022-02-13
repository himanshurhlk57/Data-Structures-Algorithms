
Array: [1, 3, 5, 7, 9, 11, 0, 4, 6, 8]
End Index: 5
Array after merging: [0, 1, 3, 4, 5, 6, 7, 8, 9, 11]


class Solution {

	
	public static void merge(int[] arr, int endIndex) {
		int[] result = new int[arr.length];
		int firstHalf = 0;  // 1
		int seconHalf = endIndex + 1; //6(0)
		int k = 0;
		while(firstHalf<=endIndex && seconHalf<arr.length){
			if(arr[firstHalf]<arr[seconHalf]){
				result[k++] = arr[firstHalf++];
			}else{
				result[k++] = arr[seconHalf++];
			}
		}
			while(firstHalf<=endIndex){
				result[k++] = arr[firstHalf++];
			}
		while(seconHalf<arr.length){
			result[k++] = arr[seconHalf++];
		}
		// for(int i = 0; i<result.length; i++){
		// 	System.out.print(result[i] + " ");
		// }
		// System.out.println();
		// for(int i = 0; i<arr.length; i++){
		// 	arr[i] = result[i];
		// }
	}
	public static void main(String[] args){
		int[] arr = {1, 3, 5, 7, 9, 11, 0, 4, 6, 8};
		merge(arr, 5);
		for(int i = 0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}