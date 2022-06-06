class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
      List<List<Integer>> adj=new ArrayList<>();
      for(int i=0;i<=n;i++)
          adj.add(new ArrayList<>());
      for(int[] d:dislikes)
         { adj.get(d[1]).add(d[0]);
          adj.get(d[0]).add(d[1]);}
        int[] color=new int[n+1];
        for(int i=1;i<=n;i++){
            if(color[i]==0&&!dfs(adj,color,i,1))
                return false;
        }
        return true;
    }
    public boolean dfs(List<List<Integer>> adj,int[] color,int i,int prev){
        if(color[i]!=0)
            return color[i]!=prev;
        color[i]=-prev;
        boolean ans=true;
        for(int j:adj.get(i)){
            ans=ans&&dfs(adj,color,j,color[i]);
        }
        return ans;
    }
}