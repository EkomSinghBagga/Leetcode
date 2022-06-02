class Solution {
    public int makeConnected(int n, int[][] connections) {
        int m=connections.length;
        if(m<n-1)
            return -1;
        List<List<Integer>> adj=new ArrayList<>();
        createGraph(adj,n,connections);
        int isolated=-1;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
           if(!visited[i])
           {
               dfs(adj,i,visited);
              isolated++;
           }
        }
        return isolated;
    }
    public void createGraph(List<List<Integer>> adj,int n,int[][] edge){
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edge){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
    }
    public void dfs(List<List<Integer>> adj,int i,boolean[] visited){
        if(visited[i])
            return;
        visited[i]=true;
        for(int j:adj.get(i))
            dfs(adj,j,visited);
    }
}