class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,ans,new ArrayList<>(),target,0);
        return ans;
    }
    public void backtrack(int[] nums,List<List<Integer>> ans,List<Integer> cur,int target,int i){
      if(target==0){
          ans.add(new ArrayList<>(cur));
          return;
      }  
        if(target<0)
            return;
      for(int j=i;j<nums.length;j++){
          if(j>i&&nums[j]==nums[j-1])
              continue;
          cur.add(nums[j]);
          backtrack(nums,ans,cur,target-nums[j],j+1);
          cur.remove(cur.size()-1);
      }
    }
}