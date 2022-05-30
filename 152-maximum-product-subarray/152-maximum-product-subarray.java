class Solution {
    public int maxProduct(int[] nums) {
      int ans=nums[0],max=nums[0],min=nums[0];
        for(int i=1;i<nums.length;i++){
            int t=max;
            max=Math.max(min*nums[i],Math.max(nums[i],max*nums[i]));
            min=Math.min(min*nums[i],Math.min(nums[i],t*nums[i]));
            ans=Math.max(ans,Math.max(max,min));
        }
        return ans;
    }
}