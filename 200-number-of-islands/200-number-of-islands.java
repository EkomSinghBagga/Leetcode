class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }
    int[][] dirs={{1,0},{0,1},{-1,0},{0,-1}};
    public void dfs(char[][] grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]=='0')
            return ;
        grid[i][j]='0';
        for(int[] d:dirs){
            dfs(grid,i+d[0],j+d[1]);
        }
    }
    
}