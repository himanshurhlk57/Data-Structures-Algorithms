Given two sorted linked lists, merge them inplace to produce a singular sorted linked list.

Example:

A: 2→3→7

B: 1→4→5

Resultant list, after merging A and B:

C: 1→2→3→4→5→7




class Solution {
	ListNode mergeTwoSortedList (ListNode firstList, ListNode secondList) {
		if(firstList == null || secondList == null) return firstList!=null ? firstList:secondList;
		
	   ListNode dummy = new ListNode(-1);
		ListNode current = dummy;
		while(firstList!=null && secondList!=null){
			if(firstList.data<secondList.data){
				current.next = firstList;
				firstList = firstList.next;
				current = current.next;
			}else{
				current.next = secondList;
				secondList = secondList.next;
				current = current.next;
			}
		}
		while(firstList!=null){
			current.next = firstList;
				firstList = firstList.next;
				current = current.next;
		}
		while(secondList!=null){
				current.next = secondList;
				secondList = secondList.next;
				current = current.next;
		}
		return dummy.next;
	}
}




// Instead of writing two extra while loop for the remaining node to assign it to the current node

**/
// Will make a dummy node of data 0 and make head asssign to dummy node 
// now will compare the data of firstlist first node with data of firstnode of second list if anyone is smaller than or equal then will assign 0 node next to that smaller node lastly we have to check if there any node data is available in any list if it is available in firstlist then assign dymmy's next to that list data if not the assign dummy node next t0 second list node data;

class Solution {
	ListNode mergeTwoSortedList (ListNode firstList, ListNode secondList) {
		if(firstList == null || secondList == null) return firstList!=null ? firstList:secondList;
	    ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		while(firstList!=null && secondList!=null){
			if(firstList.data<secondList.data){
				curr.next = firstList;
				firstList = firstList.next;
				curr = curr.next;
			}else{
				curr.next = secondList;
				secondList = secondList.next;
				curr = curr.next;
			}
			curr.next = firstList!=null ? firstList:secondList;
		}
		return dummy.next;
	}
}