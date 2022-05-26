class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i:mp.keySet()){
            if(mp.get(i)>nums.length/3)
            ans.add(i);
        }
            
        return ans;
    }
}