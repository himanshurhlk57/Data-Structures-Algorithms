// Given two Linked Lists, append second Linked List to end of first Linked List and return the first list.

// Example
// List 1: 1→3→4→7
// List 2: 6→2→5
// Result: 1→3→4→7→6→2→5



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


// Go till last node of list1 using a tail pointer assign
// lastnode next to list2 node head and then return listnode 1
// head;

class Solution {
	ListNode appendLists (ListNode list1, ListNode list2) {
	    ListNode tail = list1;
		while(tail.next!=null){
			tail = tail.next;
		}
		tail.next = list2;
		return list1;
	}
}