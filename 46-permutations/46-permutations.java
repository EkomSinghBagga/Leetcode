class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        solve(nums,new ArrayList<>());
        return ans;
    }
    public void solve(int[] nums,List<Integer> cur){
        if(cur.size()==nums.length)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(cur.contains(nums[i])) continue;
            cur.add(nums[i]);
            solve(nums,cur);
            cur.remove(cur.size()-1);
        }
    }
}