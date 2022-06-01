class Solution {
    public int findMin(int[] nums) {
        int st=0,end=nums.length-1,n=nums.length;
        while(st<=end){
            int mid=st+(end-st)/2;
            int next=(mid+1)%n,prev=(mid+n-1)%n;
            if(nums[mid]<=nums[next]&&nums[mid]<=nums[prev])
                return nums[mid];
            else if(nums[mid]<=nums[end])
                end=mid-1;
            else if(nums[st]<=nums[mid])
                st=mid+1;
        }
        return nums[st];
    }
}