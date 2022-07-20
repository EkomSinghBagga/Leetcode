class Solution {
    public int maxDepth(String s) {
        int ans=0;
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(')
            {
                st.push('(');
                
            }
            if(ch==')'){
                if(!st.isEmpty())
                    st.pop();
            }
            ans=Math.max(ans,st.size());
        }
        return ans;
    }
}