class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans=new ArrayList<>();
        backtrack(n,ans,"");
        return ans;
    }
    public void backtrack(int n,List<String> ans,String cur){
        if(cur.length()==2*n)
        {
            if(isValid(cur))
                ans.add(cur);
            return;
        }
        backtrack(n,ans,cur+'(');
        backtrack(n,ans,cur+')');
    }
    public boolean isValid(String ans){
        Stack<Character> st=new Stack<>();
        for(char ch:ans.toCharArray()){
            if(ch==')')
            {
                if(st.isEmpty())
                    return false;
                else
                    st.pop();
            }
            else
                st.push('(');
            
        }
        return st.isEmpty();
    }
    
}