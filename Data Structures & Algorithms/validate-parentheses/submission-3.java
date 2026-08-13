class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0; 
        while (i < s.length()) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false; 
                }
                char curr = stack.pop();
                if ((curr == '[' && s.charAt(i) != ']') || (curr == '(' && s.charAt(i) != ')') || (curr == '{' && s.charAt(i) != '}')) {
                    return false; 
                }
            }
            i++; 
        }

        return stack.isEmpty();
    }
}
