class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans=0,n=isConnected.length;
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i])
            {
                dfs(isConnected,i,visited);
                ans++;
            }
        }
        return ans;
    }
    public void dfs(int[][] adj,int i,boolean[] visited){
        if(visited[i])
            return;
        visited[i]=true;
        for(int j=0;j<adj[i].length;j++){
            if(adj[i][j]==1)
                dfs(adj,j,visited);
        }
    }
}