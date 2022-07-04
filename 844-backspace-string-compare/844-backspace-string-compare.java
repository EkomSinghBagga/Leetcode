class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='#')
            {
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else
                st.push(ch);
        }
        Stack<Character> st2=new Stack<>();
        for(char ch:t.toCharArray()){
             if(ch=='#')
            {
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }
            else
                st2.push(ch);
        }
        if(st.size()!=st2.size())
            return false;
        while(!st.isEmpty()&&!st2.isEmpty())
        {
            char ch1=st.peek(),ch2=st2.peek();
            if(ch1!=ch2)
                return false;
            st.pop();
            st2.pop();
        }
        return true;
        }
}