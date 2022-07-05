class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        createGraph(adj,n,prerequisites);
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            for(int j:adj.get(i)){
                indegree[j]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
       List<Integer> topo=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
                q.offer(i);
        }
        while(!q.isEmpty()){
            int cur=q.poll();
            topo.add(cur);
            for(int j:adj.get(cur))
            {
                indegree[j]--;
                if(indegree[j]==0)
                    q.offer(j);
            }
        }
        return topo.size()==n;
    }
    public void createGraph(List<List<Integer>> adj,int n,int[][] edges){
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edges){
            adj.get(e[1]).add(e[0]);
        }
    }
}