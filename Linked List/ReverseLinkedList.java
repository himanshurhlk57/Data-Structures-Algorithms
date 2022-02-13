Given a linked list, reverse it.

Example:
Input:  1→2→3→4→NULL

Output:  4→3→2→1→NULL

1 -> 2 -> 3 -> 4 -> 5 -> null
head

To do -> Break the link between 1 and 2 and point 2 to 1
 null <- 1 <- 2 <- 3 <- 4 <- 5
	or
 5 -> 4 -> 3 -> 2 -> 1 -> null

// Lets start
1 -> 2 -> 3 -> 4 -> 5 -> null
head
Before putting 1 address to 2's next first store 3 address so that after doing
2's next to 1 we dont loss the access to 3 node.

Three Pointer -> prev, curr, next
prev, next = null, curr = head;
till curr!=null do something


// [1  ] [2  ] [3  ] [4  ]
// Initially curr is at head curr is storing head(1) address
// Initially prev and next is assigned null
// we have to break the chain between 1 and 2 and points 2 next to 1 in this
//  way for all the node
// If we directly break the 1 and 2 node 2 node adress will be lost 
// all we will never reach at 2 so first store the adress of 2 node in next 
// i.e next = curr.next(2) we stored the adress of 2 in next now break the 
// chain how we will break is will assign head next to null 
// i.e head.next = prev;
// lastly curr will point to null and prev will be at the last node i.e 4 
// so what we have to do is store 4(prev) address into head and return it.

class Solution {
	ListNode reverseLinkedList (ListNode head) {
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
		return head;
		
	}
}

// reverse a linked list recursively
class Solution {
	ListNode reverseLinkedList (ListNode head) {
		 if(head==null || head.next==null){
        return head;
 }
     ListNode reversedNode = reverseLinkedList(head.next);
     head.next.next = head;
     head.next = null;
     return reversedNode;
		
	}
}