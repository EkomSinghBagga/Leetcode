class MinStack {
    Stack<Integer> st,aux;
    public MinStack() {
        st=new Stack<>();
        aux=new Stack<>();
    }
    
    public void push(int val) {
        
        if(aux.isEmpty()){
            
            aux.push(val);
        }
        else{
            if(aux.peek()>=val){
                aux.push(val);
            }
        }
        st.push(val);
    }
    
    public void pop() {
        int x=st.pop();
        if(x==aux.peek())
            aux.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return aux.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */