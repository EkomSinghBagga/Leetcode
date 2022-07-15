class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int n=heights.length,m=heights[0].length;
        boolean[][] atlantic=new boolean[n][m];
        boolean[][] pacific=new boolean[n][m];
        for(int i=0;i<n;i++){
          dfs(heights,i,0,0,pacific);
          dfs(heights,i,m-1,0,atlantic);
        }
        for(int i=0;i<m;i++){
          dfs(heights,0,i,0,pacific);
          dfs(heights,n-1,i,0,atlantic);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j]&&atlantic[i][j]){
                    List<Integer> cur=new ArrayList<>();
                    cur.add(i);cur.add(j);
                    ans.add(cur);
                }
            }
        }
        return ans;
        
    }
        int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
    public void dfs(int[][] heights,int i,int j,int prev,boolean[][] visited){
        if(i<0||i>=heights.length||j<0|j>=heights[0].length)
            return;
        if(prev>heights[i][j]||visited[i][j])
            return;
        prev=heights[i][j];
        visited[i][j]=true;
        for(int[] d:dirs){
            dfs(heights,i+d[0],j+d[1],prev,visited);
        }
    }
}