class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0,end=nums.length-1,mid,ans=-1;
        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]<target){
                st=mid+1;
                ans=mid;
            }
            else
                end=mid-1;
        }
        return ans+1;
    }
}