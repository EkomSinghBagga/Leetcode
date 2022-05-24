class Solution {
    public boolean canFinish(int num, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        creategraph(adj,edges,num);
        int[] indegree=new int[num];
        for(int i=0;i<num;i++){
            for(int it:adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<num;i++){
            if(indegree[i]==0)
                q.offer(i);
        }
        int ind=0;
        int[] topo=new int[num];
        while(!q.isEmpty()){
            int node=q.poll();
            topo[ind++]=node;
            for(int it:adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                    q.add(it);
            }
        }
        if(ind==num)
            return true;
        return false;
        
    }
    public void creategraph(ArrayList<ArrayList<Integer>> adj,int[][] edges,int n){
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0],v=edge[1];
            adj.get(v).add(u);
        }
    }
}