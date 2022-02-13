// Given a string with the just the six characters - ‘(’, ‘)’, ‘{’, ‘}’, ‘[’ and ‘]’. Determine if the string is balanced.

// A string is balanced if all brackets exist in pairs and are closed in the correct order.

// Example:
// String: ({})[]

// Result: Balanced

// String: {()})(

// Result: Not Balanced

// String: {(})[]

// Result: Not Balanced


class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch== '('){
                st.push(')');
            }else if(ch=='{'){
                st.push('}');
            }
            else if(ch=='['){
                st.push(']');
                }
                    else if(st.isEmpty() || st.pop() != ch){
                        return false;
                    } 
            }
           return st.isEmpty();
        }  
    }
