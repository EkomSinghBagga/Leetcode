class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> tail=new ArrayList<>();
        tail.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>tail.get(tail.size()-1))
                tail.add(nums[i]);
            else{
                int x=ceil(tail,nums[i]);
                tail.set(x,nums[i]);
                    
                }
        }
        return tail.size();
            
    }
    public int ceil(ArrayList<Integer> a,int x){
        int st=0,end=a.size()-1,mid,ans=0;
        while(st<=end){
            mid=st+(end-st)/2;
            if(a.get(mid)>=x)
            {
                ans=mid;
                end=mid-1;
            }
            else
                st=mid+1;
        }
        return ans;
    }
}