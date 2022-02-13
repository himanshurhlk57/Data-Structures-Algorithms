// Implement a queue using one or more stacks.

// The Queue class should support the following methods:

// int size()
// boolean isEmpty()
// int front()
// int back()
// void push(int element)
// void pop()
// You can assume that you've access to a Stack class which provides the following methods:

// int size()
// boolean isEmpty()
// int top()
// void push(int element)
// void pop()

Queue(First in first out),    Stack(Last in first out)


Using Two Stack stack1, stack2

push(4)
push(3)
push(2)
push(5)

whenever push operation is called
1-> whatever in stack1 transfer it into stack2
2-> keep push element into stack1(first top then bottom)
3-> whatever in stack2 transfer it back into stack1(top to bottom)

T.C = O(n), S.C = O(2n)
