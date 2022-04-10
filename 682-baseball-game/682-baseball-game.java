class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack();
        for(String op:ops){
            if(op.equals("+")){
                int top=st.pop();
                int ntop=top+st.peek();
                st.push(top);
                st.push(ntop);
            }
            else if(op.equals("C"))
                st.pop();
            else if(op.equals("D"))
                st.push(2*st.peek());
            else
                st.push(Integer.valueOf(op));
            
        }
        int ans=0;
        for(int i:st)
            ans+=i;
        return ans;
    }
}