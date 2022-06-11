class Solution {
    public int minOperations(int[] nums, int x) {
      int n=nums.length,total=0;
        for(int i:nums)
            total+=i;
        if(x>total)
            return -1;
        int left=0,right=0,ans=-1,sum=0;
        for(;right<n;right++){
            sum+=nums[right];
            while(sum>total-x&&left<=right){
                sum-=nums[left];
                left++;
            }
            if(sum==total-x)
                ans=Math.max(ans,right-left+1);
        }
        if(ans==-1)
            return -1;
        return n-ans;
    }
}