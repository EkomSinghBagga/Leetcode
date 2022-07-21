class StockSpanner {
    Deque<Integer> st;
    List<Integer> l;
    int ind=0;
    public StockSpanner() {
        st=new ArrayDeque<>();
        l=new ArrayList<>();
    }
    
    public int next(int price) {
       while(!st.isEmpty()&&l.get(st.peek())<=price){
           st.pop();
       } 
        if(st.isEmpty())
            {
            st.push(l.size());
             l.add(price);
            return l.size();
        }
        int j=st.peek(),i=l.size();
        st.push(l.size());
        l.add(price);
        return i-j;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */