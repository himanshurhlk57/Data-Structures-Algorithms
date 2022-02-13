// Will implement Push And Pop Operation of Stack using Queue

Stack(LIFO -> Last in first out)
Queue(FIFO -> First in first out)


/*
implement stack using queues
Using two queue
In order to implement stack we will require two queue Q1, Q2

Whenever there is a push operation we are going to follow the below steps
1-> Push Operation  3,4,2,1(x)
Push(3)
Push(4)
Push(2)
Push(1)

Steps - >
i -> Add x to Q2
ii -> Q1 to Q2 (All the elements of Q1 should go to Q2)(Element by Element)
iii -> Swap Q1 to Q1 (All the elements of Q2 will go to Q1)
 First step -> [  ]  [ 3 ]
                Q1    Q2
Second Step -> [  ]  [ 3 ]
                Q1    Q2
Third Step -> [ 3 ]  [  ]
                Q1    Q2
Push of 3 is done

Push 4                      
 First step -> [ 3 ]  [ 4 ]
                Q1    Q2
                       3
Second Step -> [  ]  [ 4 ]
                Q1    Q2
                3
Third Step -> [ 4 ]  [  ]
                Q1    Q2
Push of 4 is done and so on..

Push 2           3          
 First step -> [ 4 ]  [ 2 ]
                Q1    Q2
                       3
                Top element of Q1 - 4, 4 will go first and then 3
                       3
                       4
Second Step -> [  ]  [ 2 ]
                Q1    Q2
                3
                4
Third Step -> [ 2 ]  [  ]
                Q1    Q2
Top most element will be seeing as a stack will be 1 i.e first element of queue
which is actually true beacuse in stack last in was 2 and top should be 2

T.C of push - O(n) Swapping element by element
S.C = O(n)

class Stack {
	private Deque<Integer> queue1;
	private Deque<Integer> queue2;

	
	public Stack (int capacity) {
		this.queue1 = new ArrayDeque<>(capacity);
		this.queue2 = new ArrayDeque<>(capacity);
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int size() {
		return queue1.size();
	}
	
	public int top() {
		if(isEmpty()){
			return -1;
		}
		int answer = queue1.peek();
		return answer;
	}
	
	public void push(int element) {
	   queue2.add(element);
		while(queue1.size()>0){
			queue2.add(queue1.peek());
			queue1.poll();
		}
		Deque<Integer> temp = queue1;
		queue1 = queue2;
		queue2 = temp;
	}
	
	public void pop() {
		if(isEmpty()){
			return;
		}
		queue1.poll();
	}
}










Implement Stack using a single Queue
Push 3, Push 2, Push 4, Push 1, 


Push 3

[    3   ]

Push 2

     2
[    3    ]

Queue size is 2(2-1) take one lesser element than size of queue take the top
most element push it again

      3
[     2    ]

Push 4
      4
      3
[     2    ]

Queue size is 3(3-1) take one lesser element than size of queue take the top
two element push it again
      3
      2
[     4    ]     Queue.Top is 4 Last added element is at top follows stack
      Q           principle

T.C of Push O(n);
S.C = O(n);
      
* Use this Queue class
class Queue {
	Queue (int capacity)
	int size()
	boolean isEmpty()
	int front()
	int back()
	void push(int element)
	void pop()
};
*/

// Implement the Stack class
class Stack {
	Queue queue;
	int capacity;
	public Stack (int capacity) {
		this.capacity = capacity;
		queue = new Queue(capacity);
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public int size() {
		return queue.size();
	}
	
	public int top() {
		return queue.front();
	}
	
	public void push(int element) {
		queue.push(element);
		for(int i = 1; i < queue.size(); i++) {
			queue.push(queue.front());
			queue.pop();
		}
	}
	
	public void pop() {
		queue.pop();
	}
}





 
*/