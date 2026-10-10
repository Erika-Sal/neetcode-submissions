class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
       int index = 0; 
       while (index < s.length()) {
        if (s.charAt(index) == '(' || s.charAt(index) == '{' || s.charAt(index) == '[') {
            stack.push(s.charAt(index));
        } else if(stack.size() == 0 || (s.charAt(index) == ')' && stack.pop() != '(') || (s.charAt(index) == ']' && stack.pop() != '[') || (s.charAt(index) == '}' && stack.pop() != '{')) {
            return false; 
        }
        index++;   
       }

       return stack.size() == 0; 
    }
}
