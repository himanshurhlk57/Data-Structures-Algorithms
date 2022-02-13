// Given a Linked List, find the element at the kth position.

// Example
// List: 1→3→4→7
// k: 2
// Answer: 3


/** This is the ListNode class definition

class ListNode {
	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}
**/
// Dry run
1-3-4-7
temp = 1;
1<2, index++, index = 2, temp = 3, check index<k i.e 2<2 no so return 2 ;
class Solution {
	ListNode kthElement (ListNode head, int k) {
	   int index = 1;
	   ListNode temp = head;
		while(index<k){
			index++;
			temp = temp.next;
		}
		return temp;
		
	}
}