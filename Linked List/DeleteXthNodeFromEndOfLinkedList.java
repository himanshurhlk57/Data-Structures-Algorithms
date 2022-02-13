Given a linked list, delete the xth node from the end.

Example:
Linked list: 1→2→3→4

x: 2

Result: 1→2→4

Find the totalLength of the list and then simply delete the (totalLength - x + 1)th node from the start of the linked list.

Analysis
Time Complexity: O(n)
Auxiliary Space Complexity: O(1)

class Solution {
	ListNode removeXthNodeFromEnd(ListNode head, int x) {
		int totalLength = 0;
		ListNode currentNode = head;
		while (currentNode != null) {
			currentNode = currentNode.next;
			totalLength++;
		}
		x = totalLength - x;
		currentNode = head;
		int i = 1;
		while(i < x) {
			i++;
			currentNode = currentNode.next;
		}
		if (x == 0) {
			head = head.next;
			return head;
		}
		currentNode.next = currentNode.next.next;
		return head;
	}
}










// move the front by x first 
// i my front reach the last node that i means i need to remove 
// first node of the linked list simply do head.next
// for the rest case the while condition is enough for 
// you to understand shutup lol

class Solution {
	ListNode removeXthNodeFromEnd(ListNode head, int x) {
		ListNode front = head;
		ListNode back = head;
		for(int i = 1; i<x; i++){
			front = front.next;
		}
		if(front.next==null){
			return head.next;
		}
		
		while(front.next!=null && front.next.next!=null){
			front = front.next;
			back = back.next;
		}
		back.next = back.next.next;
		return head;
	}
}