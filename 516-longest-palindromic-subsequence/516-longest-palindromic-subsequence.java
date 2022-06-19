class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;++j){
                if(i==0||j==0)
                    dp[i][j]=Math.min(i,j);
                else if(s.charAt(i-1)==rev.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
}