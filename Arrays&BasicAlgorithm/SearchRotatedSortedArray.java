class Solution {
    //      [0,1,2,3,4,5,6]
    //      [4,5,6,7,0,1,2] -> low = 0; high = 6, mid = 3, target  = 0;
    //      lest check which part of array is sorted we can check if the parts of array is sorted or not by checking           the condition 1-> if nums[start] <= nums[mid] that means this part of array is sorted 
        // or 
        // nums[mid] <= nums[end] then this part of array is sorted
        // Now there's only two condition can occur either the target is the sorted part or other part we can make this       condition if it in the sorted part we can move end to mid - 1 or in other part
        // if the sorted array is in the other part then either the target is in that part or other part.
        // Time Complexity: O(log(n))
        // Space Complexity: O(1)


    // Dry run
	//  [4,5,6,7,0,1,2] -> mid - 3 target!=array[mid], arr[start] <= array[mid] target doesn't lies betweern array[start] to array[mid] 
	// goes to else now start = 4(mid+1) now mid = start + end / 2 i.e 5 i.e 1 
	// start = 4, end = 6, mid = 5; 
	// array[start] <= array[mid] and also target lies in this part so end = mid - 1
	// start = 4, end = 4 mid = 4 and array[mid] == target so return this index;
        
         
          public int search(int[] nums, int target) {
           int start = 0;
           int end = nums.length-1;
             while(start<=end){
                 int mid = start + (end-start)/2;
                 if(target == nums[mid]){
                     return mid;
                 }else if(nums[start] <= nums[mid]){
                     if(target >= nums[start] && nums[mid] > target){
                         end = mid - 1;
                     }else{
                         start = mid + 1;
                     }
                 }else if(nums[mid] <= nums[end]){
                     if((target > nums[mid] && nums[end] >= target)){
                         start = mid + 1;
                     }else{
                         end = mid - 1;
                     }
                 }
                 
             }
              return -1;
        }
             
             // Simple linear search
    // Time Complexity: O(n)
    // Space Complexity: O(1)
        // public int search(int[] nums, int target) {
        //     int index = -1;
        //     for(int i = 0; i<nums.length; i++){
        //         if(nums[i]==target){
        //             index = i;
        //         }
        //     }
        //     return index;
        // }
    }