class Solution {
    public int splitArray(int[] nums, int m) {
      int st=0,end=0,min=Integer.MAX_VALUE,mid=0;
       for(int i:nums){
           st=Math.max(i,st);
           end+=i;
       } 
        while(st<=end){
            mid=st+(end-st)/2;
            if(solve(nums,mid,m)){
               min=Math.min(mid,min);
                end=mid-1;
            }
            else
                st=mid+1;
        }
        return min;
    }
    public boolean solve(int[] nums,int mid,int m){
       
    
      int chunks = 0, i=0;
        while(i < nums.length){
            int val = 0;
            while(i < nums.length && nums[i] + val <= mid) val += nums[i++];
            chunks++;
        }
        return chunks <= m;
    }
    
}