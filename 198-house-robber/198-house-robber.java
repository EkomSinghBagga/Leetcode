class Solution {
    Integer[] memo;
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        memo=new Integer[nums.length];
        return Math.max(solve(nums,0),solve(nums,1));
    }
    public int solve(int[] nums,int i){
        if(i>=nums.length)
            return 0;
        if(memo[i]!=null) return memo[i];
        return memo[i]=Math.max(solve(nums,i+2)+nums[i],solve(nums,i+1));
    }
}