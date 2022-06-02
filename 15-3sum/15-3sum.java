class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans=new HashSet<>();
        Arrays.sort(nums);
        int i=0,j,k,n=nums.length;
        for( i=0;i<n-2;i++){
            j=i+1;k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> l=new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);l.add(nums[k]);
                    ans.add(l);
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else
                    k--;
            }
        }
        List<List<Integer>> res=new ArrayList<>();
        for(List<Integer> l:ans){
            res.add(l);
        }
        return res;
    }
}