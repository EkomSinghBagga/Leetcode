class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        l.add(0);
        backtrack(ans,graph,0,l);
        return ans;
        
    }
    public void backtrack(List<List<Integer>> ans,int[][] graph,int i,List<Integer> l){
        if(i==graph.length-1){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int j:graph[i]){
           l.add(j);
            backtrack(ans,graph,j,l);
            l.remove(l.size()-1);
        }
    }
}