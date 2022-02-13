// Given a linked list, find the xth node from the end.

// Example
// Linked list: 1→2→3→4
// x: 2
// Result: 3


// Find the totalLength of the list and then simply return the (totalLength - x + 1)th node from the start of the linked list.

// Analysis
// Time Complexity: O(n)
// Auxiliary Space Complexity: O(1)


ListNode xthNodeFromEnd(ListNode head, int x) {
    int lengthOfLinkedList = 0;
    ListNode temp = head;
    while(temp!=null){
        lengthOfLinkedList++;
        temp = temp.next;
    }
    int xthElementIndex = (lengthOfLinkedList-x);
    temp = head;
    while(xthElementIndex-->0){
        temp = temp.next;
    }
    return temp;
}


// Another Approach
// Take a pointer say front and make it point to the xth node from the start of the list. Now move the front pointer and the head pointer one node at a time until the front pointer reaches the last node. At this moment the head pointer must be pointing to the xth node from the end of the list.

// Analysis
// Time Complexity: O(n)
// Auxiliary Space Complexity: O(1)

class Solution {
	ListNode xthNodeFromEnd(ListNode head, int x) {
		ListNode front = head;
		for (int i = 1; i < x; i++) {
			front = front.next;
		}
		if (front.next == null) {
			return head;
		}
		while (front.next != null) {
			front = front.next;
			head = head.next;
		}
		return head;
	}
}










// reversed the given linked list 
// 1 -> 2 -> 3 -> 4
// head is now pointing t0 4
// 4 -> 3 -> 2-> 1
// Now store head address to some other vaiable temp
// keep a counter till the counter doesn't become equal to
// x move temp = temp.next
// lastly the temp will be at node we want and will return that node.


class Solution {

	
	ListNode xthNodeFromEnd(ListNode head, int x) {
	   ListNode curr = head;
	   ListNode prev = null;
	   ListNode next = null;
		while(curr!=null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		ListNode temp = head;
		int count = 1;
			while(count!=x){
				count++;
				temp = temp.next;
			}
		return temp;
	}
}