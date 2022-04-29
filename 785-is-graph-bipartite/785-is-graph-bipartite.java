class Solution {
  int [] groups,adjList[];
    boolean completed[];//completed[i]=true indicates that dfs is already performed for index i 
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        groups=new int[n];
        completed=new boolean[n];
        adjList=graph;
        for(int i=0;i<n;i++)
            if(!completed[i]&&!dfs(i,1))//perform dfs only for i which is not yet added into any group
               return false;
        return true;
    }
    boolean dfs(int i,int group)
    {
        if(groups[i]==group) //if it is already in same group
            return true;
        if(groups[i]==-group)//if it was put in other group before(mismatch)
            return false;
        groups[i]=group;  //put it in this group and mark it completed(completed[i]=true)
        completed[i]=true;
        for(int j:adjList[i])
        {
            if(!dfs(j,-group))//since neighbors should be in different groups pass -group in dfs call
                return false;
        }
        return true;
    }
}