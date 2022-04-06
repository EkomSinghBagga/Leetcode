class Solution {
    public void backtrack(int[] nums,List<List<Integer>> ans,List<Integer> l,int i){
       if(i==nums.length){
           ans.add(new ArrayList<>(l));
           return;
       }
        l.add(nums[i]);
        backtrack(nums,ans,l,i+1);
          l.remove(l.size()-1);
           backtrack(nums,ans,l,i+1);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(nums,res,new ArrayList<>(),0);
        return res;
    }
}