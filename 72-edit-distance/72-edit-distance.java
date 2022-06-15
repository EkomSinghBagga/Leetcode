class Solution {
    Integer[][] memo;
    public int minDistance(String word1, String word2) {
        memo=new Integer[word1.length()+1][word2.length()+1];
        return solve(word1,word2,word1.length(),word2.length());
    }
    public int solve(String word1,String word2,int n1,int n2){
        if(n1==0||n2==0)
            return Math.max(n1,n2);
        if(memo[n1][n2]!=null)
            return memo[n1][n2];
        if(word1.charAt(n1-1)==word2.charAt(n2-1))
        {
            return memo[n1][n2]=solve(word1,word2,n1-1,n2-1);
        }
        else
        {
            return memo[n1][n2]=1+Math.min(solve(word1,word2,n1-1,n2),Math.min(solve(word1,word2,n1,n2-1),solve(word1,word2,n1-1,n2-1)));
        }
    }
}