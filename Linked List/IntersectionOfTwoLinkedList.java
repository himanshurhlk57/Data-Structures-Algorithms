// Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
// Output: Intersected at '8'
// Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
// From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.


// The simple solution is to use two nested loop. The outer loop will be for each node of the first list and the inner loop to compare all the node of the second list with the current node of the first list. If both the nodes are equal at some point then return that node otherwise return null.

// Analysis
// Time Complexity: O(n * m)
// Auxiliary Space Complexity: O(1)

ListNode getIntersectionNode(ListNode A, ListNode B) {
    ListNode firstCurrNode = A;
    while (firstCurrNode != null) {
        ListNode secondCurrNode = B;
        while (secondCurrNode != null) {
            if (firstCurrNode == secondCurrNode) {
                return firstCurrNode;
            }
            secondCurrNode = secondCurrNode.next;
        }
        firstCurrNode = firstCurrNode.next;
    }
    return null;
}





// Let's say the length of the two lists are length1 and length2 (length1 >= length2). Traverse the first list by a distance of length1 - length2 so that from here onwards both the list have an equal number of nodes. Now traverse both the lists simultaneously and compare the corresponding nodes. If two nodes are equal at some point then return that node otherwise return null.

// Analysis
// Time Complexity: O(n + m)
// Auxiliary Space Complexity: O(1)

	
// // find length of both the linked list
// // subtract the length one from another 
// // it will give us from how many node i should skip or move to reach the intersection node. 
// // Will move head of either linked list accordingly that if length of first linked list is greater than move first linked list head node by that and other way around.
	
	ListNode getIntersectionNode(ListNode A, ListNode B) {
		int lengthA = 0;
		ListNode temp = A;
		while(temp!=null){
			lengthA++;
			temp = temp.next;
		}
		int lengthB = 0;
		ListNode temp1 = B;
		while(temp1!=null){
			lengthB++;
			temp1 = temp1.next;
		}
		int stepToMove = Math.abs(lengthA-lengthB);
		 ListNode fakeHeadA = A;
	ListNode fakeHeadB = B;
		if(lengthA>lengthB){
	while(stepToMove-->0){
	fakeHeadA = fakeHeadA.next;
	}
	}else{
	while(stepToMove-->0){
	fakeHeadB = fakeHeadB.next;
	}
	}
	while(fakeHeadA!=fakeHeadB){
	fakeHeadA = fakeHeadA.next;
	fakeHeadB = fakeHeadB.next;
	if(fakeHeadA == null || fakeHeadB == null){
	return null;
	}
	}
	return fakeHeadA;
		}


// Short and consise
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA!=tempB){
    
            tempA = tempA != null ? tempA.next : headB;
            tempB = tempB != null ? tempB.next : headA;
        }
        return tempA;
    }
}