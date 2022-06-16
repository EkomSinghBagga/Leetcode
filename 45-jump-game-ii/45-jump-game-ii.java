class Solution {
    Integer[] dp;
    public int jump(int[] nums) {
        dp=new Integer[nums.length];
        return solve(nums,0);
    }
    public int solve(int[] nums,int i){
        if(i>=nums.length-1)
            return 0;
        if(dp[i]!=null)
            return dp[i];
        int ans=100000;
        for(int j=1;j<=nums[i];j++){
            ans=Math.min(1+solve(nums,i+j),ans);
        }
        return dp[i]=ans;
    }
}