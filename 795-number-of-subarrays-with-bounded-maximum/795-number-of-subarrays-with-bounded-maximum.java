class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
    int ans=0,len=0,j=0;
      for(int i=0;i<nums.length;i++){
          
          if(nums[i]>=left&&nums[i]<=right)
          {
              len=i-j+1;
              ans+=len;
              
          }
          else if(nums[i]<left)
              ans+=len;
          
          else{
            
              j=i+1;
              len=0;
          }
      } 
        
        return ans;
    }
}