class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans=new ArrayList<>();
        solve(candidates,target,new ArrayList<>(),0);
        return ans;
    }
    public void solve(int[] candidates,int target,List<Integer> cur,int i){
        if(target==0)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        if(i==candidates.length)
            return;
        if(target<0)
            return;
        
        cur.add(candidates[i]);
        solve(candidates,target-candidates[i],cur,i);
         cur.remove(cur.size()-1);
        solve(candidates,target,cur,i+1);
        
    }
}