class Solution {
    public int findCircleNum(int[][] isConnected) {
        int ans=0;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1)
                    adj.get(i).add(j);
            }
        }
        boolean[] visited=new boolean[isConnected.length];
        Arrays.fill(visited,false);
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(adj,i,visited);
                ans++;
            }
        }
        return ans;
    }
    public void dfs(List<List<Integer>> adj,int i,boolean[] visited){
        if(visited[i]==true)
            return;
        visited[i]=true;
        for(int j:adj.get(i)){
            dfs(adj,j,visited);
        }
    }
}