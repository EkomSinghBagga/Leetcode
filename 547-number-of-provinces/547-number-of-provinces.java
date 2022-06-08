class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> adj=new ArrayList<>();
        createGraph(adj,n,isConnected);
        int ans=0;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i])
               { dfs(adj,visited,i);
                ans++;}
            
        }
        return ans; 
    }
    public void createGraph(List<List<Integer>> adj,int n,int[][] isConnected){
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1)
                {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        
    }
    public void dfs(List<List<Integer>> adj,boolean[] visited,int i){
        if(visited[i]) return;
        visited[i]=true;
        for(int j:adj.get(i))
            dfs(adj,visited,j);
    }
}