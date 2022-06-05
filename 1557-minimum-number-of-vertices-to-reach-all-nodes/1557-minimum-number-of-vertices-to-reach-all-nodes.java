class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        createGraph(n,adj,edges);
       for(int i=0;i<n;i++){
           if(adj.get(i).size()==0)
               ans.add(i);
       }
        return ans;
    }
    public void createGraph(int n,List<List<Integer>> adj,List<List<Integer>> edges){
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(List<Integer> e:edges){
            int u=e.get(0),v=e.get(1);
            adj.get(v).add(u);
        }
    }
}