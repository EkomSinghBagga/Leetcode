class Solution {
    public boolean isMonotonic(int[] nums) {
        int i;
        for( i=1;i<nums.length;i++){
          if(nums[i-1]<=nums[i])
              continue;
          else
              break;
      }
        if(i==nums.length)
            return true;
        for(i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i])
                continue;
            else
                return false;
        }
        return true;
    }
}