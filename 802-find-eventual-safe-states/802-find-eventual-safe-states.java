class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans=new ArrayList<>();
        if(graph==null||graph.length==0)
            return ans;
        int[] color=new int[graph.length];
        for(int i=0;i<graph.length;i++){
         
            if(isSafeNode(i,color,graph))
                ans.add(i);
            
        }
       return ans; 
    }
    public boolean isSafeNode(int i,int[] color,int[][] graph){
       if(color[i]!=0)
           return color[i]==1;
       color[i]=2;
        for(int j:graph[i]){
            if(!isSafeNode(j,color,graph))
               return false; 
        }
        color[i]=1;
        return true;
    }
}