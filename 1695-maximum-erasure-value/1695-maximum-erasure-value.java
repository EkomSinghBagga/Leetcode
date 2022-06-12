class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       Set<Integer> set=new HashSet<>();
        int sum=0,ans=0,i=0,j=0;
        while(j<nums.length){
            if(!set.contains(nums[j])){
                sum+=nums[j];
                ans=Math.max(sum,ans);
                set.add(nums[j++]);
            }
            else
            {
                sum-=nums[i];
                set.remove(nums[i++]);
            }
        }
        return ans;
    }
}