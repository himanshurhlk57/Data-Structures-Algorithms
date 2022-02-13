List: 1→3→4→7
k: 2
Element: 5
Result: 1→5→3→4→7

1 3 4 7
index = 1
1<k(2) 

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

class Solution {
	
	ListNode addAtkthElement (ListNode head, int k, ListNode newElement) {
	    int index = 1;
		ListNode prev = head;
		while(index<k-1){
			index++;
			prev = prev.next;
		}
		if(k-1<index){
			newElement.next = head;
			head = newElement;
	
		}else{
		newElement.next = prev.next;
		prev.next = newElement;
		}
		return head;
	}
}