class Solution {
    public int closedIsland(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0&&isClosedIsland(grid,i,j))
                    c++;
            }
        }
        return c;
    }
    public boolean isClosedIsland(int[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[i].length)
            return false;
        if(grid[i][j]==1)
            return true;
        grid[i][j]=1;
        return isClosedIsland(grid,i+1,j)&isClosedIsland(grid,i-1,j)&isClosedIsland(grid,i,j+1)&isClosedIsland(grid,i,j-1);
        
    }
}