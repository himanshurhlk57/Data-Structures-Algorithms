Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.


Example 1:


Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.
Example 2:


Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.


// brute force T.C = O(n);
// traversed the array two time first time to find the height next time to find the middle
// middle of the element can be found by dividing the size of the linked list by 2
// by mid i mean i have to traverse the linked list mid time if mid is 2 we need to traverse mid times to reach to mid
class Solution {
    public ListNode middleNode(ListNode head) {
        //first lets find the size of the linked list
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        // now lets find the mid by dividing the size of list and traverse that times
        int half = size/2;
        ListNode tempHalfTraversal = head;
        while(half-->0){
            tempHalfTraversal = tempHalfTraversal.next;
        }
        return tempHalfTraversal;
    }
}

//Using slow and fast pointer
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
         ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

//If there is two middle linked list node and want to return the first middle 
// node from them then in case 
int getMiddleElementOfLinkedList (ListNode list) {
    ListNode slow = list;
    ListNode fast = list;
    while(fast.next!=null && fast.next.next!=null){
       slow = slow.next;
       fast = fast.next.next;
   }
   return slow.data;
}
}