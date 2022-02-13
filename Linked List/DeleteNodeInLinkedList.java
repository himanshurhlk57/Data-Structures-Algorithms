Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.


we donot have access to head node nor this is doubly linked list so we cant go to the 4 node
4,5,1,9
need to delete 5 so swap 5 and 1 
4 1 5 9
then 1.next  = 1.next.next i.e 9
4 1 9

class Solution {
    public void deleteNode(ListNode node) {
       node.val = node.next.val;
       node.next = node.next.next;
    }
}