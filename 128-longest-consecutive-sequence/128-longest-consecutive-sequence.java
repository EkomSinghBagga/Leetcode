class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0)
            return 0;
        Set<Integer> h=new HashSet<>();
        for(int i:nums)
            h.add(i);
        int ans=1;
        for(int i:h){
            if(!h.contains(i-1)){
                int cur=1;
                while(h.contains(cur+i))
                    cur++;
                ans=Math.max(ans,cur);
            }
        }
        return ans;
    }
}