class Solution {
    public int pivotIndex(int[] nums) {
      int[] left=new int[nums.length];
        left[nums.length-1]=nums[nums.length-1];
      for(int i=nums.length-2;i>=0;i--){
          left[i]=left[i+1]+nums[i];
      }
        for(int i=1;i<nums.length;i++)
            nums[i]+=nums[i-1];
        for(int i=0;i<nums.length;i++)
            if(nums[i]==left[i])
                return i;
        return -1;
    }
}