+, -, /, * -> Operator

X + Y -> X, Y(Operands), +(Operator) 

In Noraml :- 3 + 5 = 8

Reverse Polish Notation :- 3 5 + (Number in the begining operator at the end)

Normal :- 12 - 2 + 3 = 13

R P N : 12 2 - (First Part) = 12 -2 = 10, 
        12 2 - 3 + (Second Part) = 12 - 2 = 10 + 3 = 13


Expression: ["6", "3", "2", "+", "*", "5", "/"]
Answer: 6

6,3,2,+ encountered + evaluate 3+2 = 5, Add to stack
6, 5, * encountered * evaluate 6 * 5 = 30, Push to stack
30, 5, / encountered / evaluate 30 / 5 = 6, Push to stack
lastly 6 left in the stack i.e the answer


// In case of string(being an object) in java == compares thier address not their content
// ==  compares the address not their content in case of non primitive
// .equals() compare thier content 


class Solution {
	// +, -, *, / Need to consider only these 4 operator
	int evalRPN(String[] tokens){
	Deque<Integer> stack = new ArrayDeque<Integer>();
		for(String token:tokens){
			if(token.equals("+")){
				int number1 = stack.peek();
				stack.pop();
				int number2 = stack.peek();
				stack.pop();
				stack.push(number1+number2);
			}
			else if(token.equals("-")){
				int number1 = stack.peek();
				stack.pop();
				int number2 = stack.peek();
				stack.pop();
				stack.push(number2-number1);
			}
			else if(token.equals("*")){
				int number1 = stack.peek();
				stack.pop();
				int number2 = stack.peek();
				stack.pop();
				stack.push(number1*number2);
			}
			else if(token.equals("/")){
				int number1 = stack.peek();
				stack.pop();
				int number2 = stack.peek();
				stack.pop();
				stack.push(number2/number1);
			}else{
			stack.push(Integer.parseInt(token));
		
	 }
	}
		return stack.pop();
  }
}