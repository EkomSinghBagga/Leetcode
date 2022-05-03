class Solution {
    public long mostPoints(int[][] questions) {
      long ans=0;
      long[] dp=new long[questions.length+1];
      Arrays.fill(dp,0);
      for(int i=questions.length-1;i>=0;i--){
          int futureIndex=i+questions[i][1]+1;
          if(futureIndex>=questions.length)
              dp[i]=questions[i][0];
          else{
              dp[i]=questions[i][0]+dp[futureIndex];
          }
          ans=Math.max(ans,dp[i]);
          dp[i]=Math.max(dp[i],dp[i+1]);
      }  
        return ans;
    }
}