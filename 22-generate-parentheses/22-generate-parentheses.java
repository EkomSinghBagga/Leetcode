class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack(n,ans,"",0,0);
        return ans;
    }
    public void backtrack(int n,List<String> ans,String cur,int open,int close){
        if(cur.length()==2*n){
            ans.add(cur);
            return;
        }
        if(open<n){
            backtrack(n,ans,cur+'(',open+1,close);
        }
        if(close<open)
            backtrack(n,ans,cur+')',open,close+1);
    }
}