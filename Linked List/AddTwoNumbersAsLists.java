Given two natural numbers, a and b, represented as reversed linked lists, compute their sum c as another reversed linked list.

Example 1
Two numbers 132 and 541 are shown in the form of reversed linked lists, and so is their sum which is 673.

Input:
a: 321 :   1 → 2 → 3
b: 654 :   4 → 5 → 6

Output:
c: 975 :   5 → 7 → 9


class Solution {
	
	ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
		 ListNode dummy = new ListNode(69);
        ListNode firstListNode = firstList;
        ListNode secondListNode = secondList;
        ListNode temp = dummy;
        int carry = 0;
        while(firstListNode!=null || secondListNode!=null){
            //Store the node value of the list in variable x and y
            int x = firstListNode!=null ? firstListNode.data:0;
            int y = secondListNode!=null ? secondListNode.data:0;
            int sum = x + y + carry;
            // carry = 2+5/10 -> 7/10 -> 0
            carry = sum / 10; 
            // Need to create a answer node i.e 2+5 = 7 i.e sum%10 -> 7%10 -> 7
            temp.next = new ListNode(sum%10);
            // dummy(69) -> 7
            // Now work of one node is done shift all the node to its next there will be conditon
            // for the firstListNode and secondListNode to shift i.e 
            temp = temp.next;
            if(firstListNode!=null){
                firstListNode = firstListNode.next;
            }
            if(secondListNode!=null){
                secondListNode = secondListNode.next;
            }
        } 
        if(carry>0){
            temp.next = new ListNode(carry);
        }
        return dummy.next;
	}
}