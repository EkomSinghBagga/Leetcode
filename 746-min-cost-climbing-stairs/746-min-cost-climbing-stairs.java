class Solution {
    Integer[] memo;
    public int minCostClimbingStairs(int[] cost) {
        memo=new Integer[cost.length];
      return Math.min(solve(cost,0),solve(cost,1));
    }
    public int solve(int[] cost,int i){
        if(i>=cost.length)
            return 0;
        if(memo[i]!=null) return memo[i];
        return memo[i]=cost[i]+Math.min(solve(cost,i+1),solve(cost,i+2));
    }
}