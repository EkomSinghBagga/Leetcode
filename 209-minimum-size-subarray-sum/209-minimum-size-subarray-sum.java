class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,min=nums.length+1;
        while(j<nums.length){
           if(sum<target)
               sum+=nums[j++];
            
               while(sum>=target){
                   min=Math.min(j-i,min);
                   sum-=nums[i++];
               }
            
        }
        return min==nums.length+1?0:min;
    }
}