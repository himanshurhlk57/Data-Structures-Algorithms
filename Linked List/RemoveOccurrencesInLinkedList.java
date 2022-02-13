// Given a linked list and a key, remove all occurrences of the key from the Linked List. Return the head of the resultant list.

// Example
// Linked List: 1→2→3→2→4→7→2
// Key: 2
// After removal: 1→3→4→7


// The idea is to simply traverse the given linked list and delete all the occurrences of the key one by one.

// Note: If the head node is equal to the key then move the head pointer to the first node which is not equal to the key and then follow the above step.

// Analysis
// Time Complexity: O(n)
// Auxiliary Space Complexity: O(1)

class Solution {
	ListNode removeOccurences(ListNode head, int key) {
		while(head!=null && head.data == key){
			head = head.next;
		}
        ListNode prev = head;
		while(prev!=null && prev.next!=null){
			if(prev.next.data==key){
				prev.next = prev.next.next;
			}else{
				prev = prev.next;
			}
		}
		return head;
	}
}