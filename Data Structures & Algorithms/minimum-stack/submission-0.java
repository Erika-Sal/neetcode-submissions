class MinStack {

    private Stack<Integer> stack; 
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
       return stack.get(stack.size() - 1);

    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE; 
        for (int i = 0; i < stack.size(); i++) {
            if (stack.get(i) < min) {
                min = stack.get(i);
            }
        }
        return min; 
    }
}
