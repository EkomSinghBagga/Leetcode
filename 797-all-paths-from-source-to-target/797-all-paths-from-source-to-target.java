class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] visited=new boolean[graph.length];
        List<Integer> cur=new ArrayList<>();
        cur.add(0);
        dfs(graph,0,ans,cur,visited);
        return ans;
    }
    public void dfs(int[][] graph,int i,List<List<Integer>> ans,List<Integer> cur,boolean[] visited){
        if(i==graph.length-1)
        {
            ans.add(new ArrayList<>(cur));
            return;
        }
        
        for(int j:graph[i]){
             cur.add(j);
             dfs(graph,j,ans,cur,visited);
             cur.remove(cur.size()-1);
        }
      
    }
}