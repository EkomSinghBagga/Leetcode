class Solution {
    public int shortestBridge(int[][] grid) {
       Queue<int[]> q=new LinkedList<>();
        boolean flag=false;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    dfs(grid,i,j,q);
                    flag=true;
                    break;
                }
            }
            if(flag) break;
        }
        return findNearestIslandUsingbfs(grid,q);
    }
    public void dfs(int[][] grid,int i,int j,Queue<int[]> q){
        if(i<0||i>=grid.length||j<0||j>=grid.length||grid[i][j]==0||grid[i][j]==-1)
            return;
        grid[i][j]=-1;
        q.offer(new int[]{i,j});
        dfs(grid,i+1,j,q);
         dfs(grid,i-1,j,q);
         dfs(grid,i,j+1,q);
         dfs(grid,i,j-1,q);
    }
    public int findNearestIslandUsingbfs(int[][] grid,Queue<int[]> q){
        int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int[] temp=q.poll();
                for(int[] d:dirs){
                    int ti=temp[0]+d[0];
                    int tj=temp[1]+d[1];
                    if(ti<0||ti>=grid.length||tj<0||tj>=grid[0].length||grid[ti][tj]==-1)
                        continue;
                    else if(grid[ti][tj]==1)
                        return level;
                    else{
                        q.offer(new int[]{ti,tj});
                        grid[ti][tj]=-1;
                    }
                        
                }
            }
            level++;
        }
        return level;
    }
}