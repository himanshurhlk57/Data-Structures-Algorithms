You are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Input: root = [1,2,3,4,5,6,7]
Output: [1,#,2,3,#,4,5,6,7,#]
Explanation: Given the above perfect binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.


       1                               1 - null
    2     3      -> > >            2  ----   3  - null
  4   5  6  7                   4  -- 5 --6 ---  7 - null

i only need to make connection if there is a node and
if there is left and right node to the parent node in other case i need to return


If i am at 2 node i need to make connection with 3
2(root.left.next) = 3(root.right)

Now to make connection between 5 and 6
now the connection between 2 and 3 is made i only need to connect 5 and 6
if 2 next is not null i.e root.next!=NULL
to make connection between 5 and 6 
2's right.next = 2's next.left
5.next = 3.left
root.right.next = root.next.left;
and lastly doing the recursive call on both left subtree and right subtree




class Solution {
    public Node connect(Node root) {
        if(root == null){
          return root;
        }
        if(root.left == null || root.right == null){
            return root;
        }
        root.left.next = root.right;
        if(root.next!=null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
