class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        List<List<Integer>> res=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        backtrack(nums,ans,visited,new ArrayList<>());
        for(List<Integer> l:ans){
            res.add(l);
        }
        return res;
    }
    public void backtrack(int[] nums,Set<List<Integer>> ans,boolean[] visited,List<Integer> cur){
       if(cur.size()==nums.length) 
       {
           ans.add(new ArrayList<>(cur));
           return;
       }
        for(int j=0;j<nums.length;j++){
            if(!visited[j]){
                visited[j]=true;
                cur.add(nums[j]);
                backtrack(nums,ans,visited,cur);
                cur.remove(cur.size()-1);
                visited[j]=false;
            }
        }
    }
}