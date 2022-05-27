class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE,smax=Integer.MIN_VALUE,ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                smax=max;
                max=nums[i];
                ind=i;
            }
            else if(nums[i]>smax)
                smax=nums[i];
        }
        return (max>=2*smax)?ind:-1;
    }
}