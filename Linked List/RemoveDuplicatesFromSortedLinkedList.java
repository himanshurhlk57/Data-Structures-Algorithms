// iven a sorted linked list, remove all duplicates from the Linked List.

// After the operation, every element should appear only once. Do not change the order of the linked list.

// Example
// Linked List: 1→2→2→2→3→3→4→7
// After removing duplicates: 1→2→3→4→7



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

Linked List: 1→2→2→2→3→3→4→7
temp.data = 1 temp.next.data = 2 temp = temp.next;
temp.data = 2 temp.next.data = 2, temp = temp.next.next = 2
temp.data = 2, temp.next.data = 3, temp = temp.next, 3

class Solution {
	ListNode removeDuplicates(ListNode head) {
	   if(head==null || head.next==null) return head;
		ListNode temp = head;
		while(temp.next!=null){
			if(temp.data == temp.next.data){
				temp.next = temp.next.next;
			}else{
				temp = temp.next;
			}
		}
		return head;
	}
}