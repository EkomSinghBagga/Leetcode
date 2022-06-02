class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[][] atlantic=new boolean[heights.length][heights[0].length];
        boolean[][] pacific=new boolean[heights.length][heights[0].length];
        for(int i=0;i<heights.length;i++){
            dfs1(heights,i,0,0,pacific);
            dfs1(heights,i,heights[0].length-1,0,atlantic);
        }
        for(int i=0;i<heights[0].length;i++){
            dfs1(heights,0,i,0,pacific);
            dfs1(heights,heights.length-1,i,0,atlantic);
        }
       for(int i=0;i<heights.length;++i){
           for(int j=0;j<heights[0].length;++j){
               if(atlantic[i][j]&&pacific[i][j])
               {
                   List<Integer> l=new ArrayList<>();
                   l.add(i);
                   l.add(j);
                   ans.add(l);
               }  
           }
       }
        return ans;
        
    }
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public void dfs1(int[][] heights,int i,int j,int prev,boolean[][] visited){
          if(i<0||i>=heights.length||j<0||j>=heights[0].length)
              return ;
        if(heights[i][j]<prev||visited[i][j])
            return;
        
        visited[i][j]=true;
        for(int[] d:dir){
            dfs1(heights,i+d[0],j+d[1],heights[i][j],visited);
        }
    }

}