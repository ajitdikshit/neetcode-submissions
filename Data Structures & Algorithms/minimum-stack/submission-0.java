class MinStack {
 Stack<Integer> stack=new Stack<>();
        Stack<Integer> minstack=new Stack<>();
    public MinStack() {
        int min=Integer.MAX_VALUE;
       
    }
    
    public void push(int val) {
        stack.push(val);
        if(!minstack.isEmpty()){
minstack.push(Math.min(val,minstack.peek()));
        }else{
            minstack.push(val);
        }
        
    }
    
    public void pop() {
       minstack.pop();
       stack.pop(); 
    }
    
    public int top() {
        return(stack.peek());
    }
    
    public int getMin() {
        return(minstack.peek());
    }
}
