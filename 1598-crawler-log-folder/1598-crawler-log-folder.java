class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(String l:logs){
            if(l.equals("./"))
                continue;
            if(l.equals("../")){
                if(st.isEmpty()) continue;
                st.pop();
            }
            else
            st.push(l);
        }
        return st.size();
    }
}