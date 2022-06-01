class Solution {
    public int search(int[] nums, int target) {
       int st=0,n=nums.length,end=n-1,ind=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            int next=(mid+1)%n,prev=(mid+n-1)%n;
              
            if(nums[mid]<=nums[next]&&nums[mid]<=nums[prev])
                {

                ind=mid;break;
            }
            else if(nums[mid]<=nums[end])
                end=mid-1;
            else if(nums[mid]>=nums[st])
                st=mid+1;
        }
        
        if(ind==0)
            return binarySearch(nums,0,n-1,target);

        if(target>=nums[0])
            return binarySearch(nums,0,ind,target);
        else
            return binarySearch(nums,ind,n-1,target);
    }
    public int binarySearch(int[] nums,int st,int end,int target){
        while(st<=end){
        int mid=st+(end-st)/2;
        if(nums[mid]==target)
            return mid;
        else if(nums[mid]>target)
          end=mid-1;
        else
            st=mid+1;
        }
        return -1;
    }
}