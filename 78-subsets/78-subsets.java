class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,0,ans,new ArrayList<>());
        return ans;
    }
    public void backtrack(int[] nums,int i,List<List<Integer>> ans,List<Integer> cur){
        if(i==nums.length){
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        backtrack(nums,i+1,ans,cur);
        cur.remove(cur.size()-1);
        backtrack(nums,i+1,ans,cur);
    }
}