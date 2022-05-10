class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
      List<List<Integer>> ans=new ArrayList<>();  
      backtrack(ans,new ArrayList<>(),k,1,n);
      return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> l,int k,int start,int n){
        if(l.size()==k&&n==0){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=start;i<=9;i++){
            l.add(i);
            backtrack(ans,l,k,i+1,n-i);
            l.remove(l.size()-1);
        }
    }
}