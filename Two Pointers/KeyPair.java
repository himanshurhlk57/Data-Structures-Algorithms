// Key Pair 

// Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

// Example 1:

// Input:
// N = 6, X = 16
// Arr[] = {1, 4, 45, 6, 10, 8}
// Output: Yes
// Explanation: Arr[3] + Arr[4] = 6 + 10 = 16


class Solution {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum == x){
                return true;
            }else if(x<sum){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}