// For an array of integers nums, an identical twin is defined as pair (i, j) where nums[i] is equal to nums[j] and i < j.


// Array: [1, 2, 2, 3, 2, 1]
// Number of Identical Twins: 4
// Explanation:
// Identical Twins: [[1, 1], [2, 2], [2, 2], [2, 2]]
// Indexes: (0, 5), (1, 2), (1, 4), (2, 4)

	
// i 0
// j 1 j 2 j 3 j 4
// i 1
// j 2 j 3 j 4
// i 2
// j 3 j 4
// i 3
// j 4
// i 4
	
	int getIdenticalTwinsCount (int[] arr) {
		int identicalCount = 0;
		for(int i = 0; i<arr.length; i++){
			System.out.println("i " + i);
		   for(int j=i+1; j<arr.length; j++){
			   System.out.println("j " + j);
			   if(arr[i] == arr[j]){
				   identicalCount++;
			   }
		   }
		}
		return identicalCount;
	}
}