// Traversal of linkedList

// 1 -> 2 -> 3 -> 4 -> null

// we shouldn't change head always store address of head in other variable lets say temp
// Node temp = head;
// while(temp!=null){
//     Syso(temp.data);
//     temp = temp.next;
// }


// 1-> Insertion in Linked List
//  Insert in the begining

//  Time Complexity: O(1)


// [60 ]->[70 ]->[80 ]->null

// ^
// head 
// Create a new node we want to insert in the begining
// Assign newly created node its next to head and point head to the newly created node in this way we will have a new node in the begining;

// Node newNode = new Node(data);
// newNode.next = head;
// head = newNode;


// 2-> Insert new node at the end of linkedList
// Time Complexity: O(n)

// [20 ]->[30 ]->[40 ]->null

// newNode-> [50 ] -> This is going to be our last node of the linkedList after 
// inserting it at the end i.e [50 ].next=null, should be null;
// To insert 50 in the end we should know the address of existing last node 
// in our listnode i.e when any node has node.next = null that


// Deletion of node(3) from a linkedList
// 1 -> 2 -> 3 -> 4 -> null

// temp is holding 2 address
// temp.next = temp.next.next


