class Solution {
    public int closedIsland(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0 && dfs(grid,i,j))
                count++;
            }
        }
        return count;
    }
    public boolean dfs(int[][] grid,int i,int j){
        if(i<0||i>grid.length-1||j<0||j>grid[0].length-1)
            return false;
        if(grid[i][j]==1)
            return true;
        grid[i][j]=1;
        boolean x1=dfs(grid,i+1,j);
        boolean x2=dfs(grid,i-1,j);
        boolean x3=dfs(grid,i,j+1);
        boolean x4=dfs(grid,i,j-1);
        
        return x1 && x2 && x3 && x4;
    }
}