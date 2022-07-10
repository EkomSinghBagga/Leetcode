class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] t:times){
           adj.get(t[0]-1).add(new int[]{t[1]-1,t[2]}); 
        }
        k--;
        int[] ans=new int[n];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[k]=0;
        Queue<int[]> pq=new PriorityQueue<int[]>(Comparator.comparingInt(a->a[1]));
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int v=cur[0];
            for(int[] i:adj.get(v)){
                    if(ans[i[0]]>ans[v]+i[1]){
                        ans[i[0]]=ans[v]+i[1];
                        pq.offer(new int[]{i[0],ans[i[0]]});
                    }
                }
            }
        

        int sum=0;
        for(int i:ans)
        {
            if(i==Integer.MAX_VALUE)
                return -1;
            sum=Math.max(sum,i);
            
        }
        return sum;
    }
}