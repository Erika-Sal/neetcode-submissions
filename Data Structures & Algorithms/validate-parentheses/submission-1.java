class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.substring(i, i+1)); 
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                String temp = stack.pop();
                if(temp.equals("(") && !s.substring(i,i+1).equals(")")) {
                    return false; 
                } else if (temp.equals("[") && !s.substring(i,i+1).equals("]")) {
                    return false; 
                } else if (temp.equals("{") && !s.substring(i,i+1).equals("}")) {
                    return false; 
                }
            }
        }

        return stack.isEmpty();
    }
}
