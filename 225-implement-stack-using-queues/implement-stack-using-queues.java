class MyStack {
    public MyStack() {
        
    }
    Stack<Integer> s1 = new Stack<>();
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        int r = s1.pop();
        return r;
    }
    
    public int top() {
        int t = s1.peek();
        return t;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */