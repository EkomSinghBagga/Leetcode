class Solution {
    Integer[][] memo;
    public int maxProfit(int[] prices) {
        memo=new Integer[prices.length][10001];
        return solve(prices,0,10000);
    }
    public int solve(int[] nums,int i,int min){
        if(i>=nums.length) return 0;
        if(memo[i][min]!=null)
            return memo[i][min];
        if(nums[i]>min){
            return memo[i][min]=Math.max(nums[i]-min+solve(nums,i+2,10000),solve(nums,i+1,min));
        }
        min=nums[i];
        return memo[i][min]=solve(nums,i+1,min);
    }
}