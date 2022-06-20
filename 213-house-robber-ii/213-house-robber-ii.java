class Solution {
    Integer[][] memo;
    public int rob(int[] nums) {
        int n=nums.length;
                if(n == 1) return nums[0];

        memo=new Integer[n][n];
        return Math.max(solve(nums,0,n-2),solve(nums,1,n-1));
    }
    public int solve(int[] nums,int st,int end){
        if(end<st)
            return 0;
        if(memo[st][end]!=null)
            return memo[st][end];
        return memo[st][end]=Math.max(solve(nums,st+2,end)+nums[st],solve(nums,st+1,end));
        
    }
}