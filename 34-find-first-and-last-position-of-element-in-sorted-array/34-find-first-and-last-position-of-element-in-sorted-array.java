class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x=-1,y=-1,st=0,end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                x=mid;
                end=mid-1;
            }
            else if(nums[mid]>target)
                end=mid-1;
            else
                st=mid+1;
        }
        if(x==-1)
            return new int[]{-1,-1};
        st=0;end=nums.length-1;
        while(st<=end){
             int mid=st+(end-st)/2;
            if(nums[mid]==target){
                y=mid;
                st=mid+1;
            }
            else if(nums[mid]>target)
                end=mid-1;
            else
                st=mid+1;
        }
        return new int[]{x,y};
    }
}