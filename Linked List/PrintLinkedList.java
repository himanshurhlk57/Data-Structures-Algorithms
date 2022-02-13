// Given a Linked List, print all its nodes.

// Example
// List: 1→3→4→7
// Print: 1 3 4 7

The idea is simply to traverse the given linked list and print the value of every node visited.

Analysis
Time Complexity: O(n)
Auxiliary Space Complexity: O(1)


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
	void printLinkedList (ListNode head) {
		ListNode temp = head;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		return;
	}
}

// Print linked list using recursion

void printLinkedListRecursively(ListNode head) {
		
    if(head==null){
        return;
    }
         System.out.print(head.data + " ");
        printLinkedListRecursively(head.next);

}
}



// Print Reversed Linked List
// Problem Statement:
// Given a Linked List, print it in reverse direction using recursion.

// Note: Do not reverse the list.

// Example
// List: 1→3→4→7
// Print: 7 4 3 1

void printLinkedListReverse (ListNode head) {
    if(head==null){
        return;
    }
     printLinkedListReverse(head.next);
         System.out.print(head.data + " ");
     
 }




// Given a Linked List, return an array containing the nodes of the list in the same order.

// Example
// List: 1→3→4→7
// Array: [1 3 4 7]


List<Integer> linkedListToArray (ListNode head) {
    List<Integer> result = new ArrayList<Integer>();
    ListNode temp = head;
    while(temp!=null){
        result.add(temp.data);
        temp = temp.next;
    }
    return result;
}