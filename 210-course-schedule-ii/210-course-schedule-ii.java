class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        int [] topo=new int[n];
        List<List<Integer>> adj=new ArrayList<>();
        createGraph(n,adj,prerequisites);
        int[] indegree=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for(int[] p:prerequisites)
            indegree[p[0]]++;
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
                q.offer(i);
        }
        int ind=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int cur=q.poll();
                topo[ind++]=cur;
                for(int i:adj.get(cur)){
                    indegree[i]--;
                    if(indegree[i]==0)
                        q.offer(i);
                }
            }
        }
        if(ind!=n)
            return new int[0];
        return topo;
    }
    public void createGraph(int n,List<List<Integer>> adj,int[][] edges){
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        for(int[] e:edges){
            adj.get(e[1]).add(e[0]);
        }
    }
}