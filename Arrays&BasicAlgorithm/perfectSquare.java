// Given a positive integer num, write a function that returns true if num is a perfect square else false.

// Examples
// isPerfectSquare(25) => true
// isPerfectSquare(30) => false
// The time complexity of the method should be O(log n).


class Solution {
	
	boolean searchRoot(int start, int end, int num) {
    if (start > end) {
        return false;
    }
    int mid = start + (end - start)/2;
    int square = mid * mid;
    if (square == num) {
        return true;
    }
    if (square > num) {
        return searchRoot(start, mid - 1, num);
    }
    return searchRoot(mid + 1, end, num);
}
	
	boolean isPerfectSquare (int num) {
		    int maxValue = 10000;
		    return searchRoot(1, maxValue, num);
	}
}