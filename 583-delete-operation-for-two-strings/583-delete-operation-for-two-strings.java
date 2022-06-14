class Solution {
    Integer[][] memo;
    public int minDistance(String word1, String word2) {
        int n1=word1.length(),n2=word2.length();
        memo=new Integer[n1+1][n2+1];
        int l=lcs(word1,word2,n1,n2);
        // System.out.println(l);
        return n1+n2-l-l;
    }
    public int lcs(String word1,String word2,int n1,int n2){
        if(memo[n1][n2]!=null)
            return memo[n1][n2];
        if(n1==0||n2==0)
            return memo[n1][n2]=0;
        if(word1.charAt(n1-1)==word2.charAt(n2-1))
        {
            memo[n1][n2]=1+lcs(word1,word2,n1-1,n2-1);
            return memo[n1][n2];
        }
        else
        {
            memo[n1][n2]=Math.max(lcs(word1,word2,n1-1,n2),lcs(word1,word2,n1,n2-1));
            return memo[n1][n2];
        }
    }
}