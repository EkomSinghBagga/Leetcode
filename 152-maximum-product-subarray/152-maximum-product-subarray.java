class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],min=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int t=max;
            max=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min=Math.min(nums[i],Math.min(nums[i]*t,nums[i]*min));
            ans=Math.max(ans,max);
        }
        return ans;
    }
}