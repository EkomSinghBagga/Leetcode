class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ans,new ArrayList<>(),0,nums);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> l,int index,int[] nums){
        // if(index==nums.length){
            ans.add(new ArrayList<>(l));
            // return;
        // }
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i]==nums[i-1])
                continue;
            // System.out.println(nums[i]);
            l.add(nums[i]);
            backtrack(ans,l,i+1,nums);
            l.remove(l.size()-1);
        }
    }
}