List: 1→3→4→7
k: 2
Result: 1→4→7

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
	ListNode removekthElement (ListNode head, int k) {
	    ListNode temp = head;
		int index = 1;
		while(index<k-1){
			index++;
			temp = temp.next;
		}if(k-1<index){
			temp = head.next;
			head = null;
			return temp;
		}else{
			temp.next = temp.next.next;
		}
		return head;
		
		
	}
}