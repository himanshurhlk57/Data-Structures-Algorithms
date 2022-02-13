// You discover a treasure containing n pieces of jewel stones. You have a sack to collect them but it can hold only contents upto weight capacity.

// You are given the weight and value of each of the stones - weighti and valuei.

// Find the maximum value of stones that you can carry in the sack.

// Example
// stones(weight, value): [(1, 3), (2, 4), (3, 5), (4, 7)]
// capacity: 5
// Max value: 10
// Explanation: Choose stones at index 0 and 3.


// 0-1 Knapsack version

// n jewels stones        20(Lakh)  30   24   40   12   80
// weights                2kg        5   2    3     1   6
// Bag capacity(12 kg) ->  6 + 3 + 2 + 1(12 kg) - price (80 + 40 + 24 + 12)(156lakh i.e maximum value)


// price(p)                       20(Lakh)  30   24   40   12   80
// w                              2kg        5   2    3     1   6
// Bag(W capacity of knapsack)       <-   n(no of items)    ->

// 1st Recursion ->

/* This is the JewelStone class definition
class JewelStone {
    int weight, value;
    JewelStone(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}
*/
class Solution {
	
	static int maxValue(JewelStone[] stones, int n, int bagCapacity){
		
		//If there is no stones or in case the bagCapacity is zero there is not point in getting any value forget about maxValue
		if(n == 0 || bagCapacity == 0){
			return 0;
		}
		//First case when you donot want to add that item in knapsack
		int answer = maxValue(stones, n-1, bagCapacity);
		//2nd case for the stones to get considerd or will add into tha bag only if the weight of the stone is less than or equal to bagCapacity
		// if i am considering that weight then i need to decrease the bagCapacity too by that element weight that i have considered and add the value of the considerd weight
			// lastly my answer will be max of first case and 2nd case
		if(stones[n-1].weight <= bagCapacity){
		 answer = Math.max(answer, maxValue(stones, n-1, bagCapacity-stones[n-1].weight) + stones[n-1].value);
		}
		
	    return answer;
		
		
	}
	
	int getMaxValue (JewelStone[] stones, int capacity) {
		int answer = maxValue(stones, stones.length, capacity);
		return answer;
	}
}


2-> Memoization


