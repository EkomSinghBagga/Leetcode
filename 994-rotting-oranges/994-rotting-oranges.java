class Solution {
    int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q=new LinkedList<>();
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int level=0,c=0,n=grid.length,m=grid[0].length;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]==2)
                    q.offer(new int[]{i,j});
                if(grid[i][j]==1) c++;
            }
        }
        // if(c==0) {
        //     return 0;
        // }
        // if(q.isEmpty())
        // {if(c==0)
        //     return 0;
        //  else
        //      return -1;
        // }
         
        while(!q.isEmpty()){
            int size=q.size();
             
            while(size-->0){
                int[] cur=q.poll();
                visited[cur[0]][cur[1]]=true;
                for(int[] d:dirs){
                    int i=cur[0]+d[0];
                    int j=cur[1]+d[1];
                    if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==2)
                        continue;
                    if(grid[i][j]==0||visited[i][j])
                        continue;
                    grid[i][j]=2;
                    visited[i][j]=true;
                    q.offer(new int[]{i,j});
                }
                
            }
            // int x=0;
            //  for(int i=0;i<n;i++){
            //      for(int j=0;j<m;j++){
            //          if(visited[i][j])
            //              x++;
            //      }
            //  }
            //     if(x==m*n) return level+1;
            //       level++;
           
            if(!q.isEmpty())
                level++;
        }
                for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return level;
    }
}