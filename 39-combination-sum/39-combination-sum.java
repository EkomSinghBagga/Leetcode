class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> ans=new ArrayList<>();
       backtrack(candidates,ans,new ArrayList<>(),target,0);
        return ans;
    }
    public void backtrack(int[] nums,List<List<Integer>> ans,List<Integer> cur,int target,int i){
        if(target<0)
            return;
        if(target==0)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        for(int j=i;j<nums.length;++j){
        if(nums[j]<=target){
            cur.add(nums[j]);
            backtrack(nums,ans,cur,target-nums[j],j);
            cur.remove(cur.size()-1);
        }
            
    }
    }
    
}