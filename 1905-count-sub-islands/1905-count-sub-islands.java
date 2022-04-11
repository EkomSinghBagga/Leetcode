class Solution {
    int flag=0;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int c=0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[i].length;j++){
                if(grid2[i][j]==1){
                    // System.out.println(i+" "+j);
                    flag=1;
                    dfs(grid1,grid2,i,j);
                    c+=flag;
                }
            }
        }
        
        return c;
    }
  
    public void dfs(int[][] grid1,int[][] grid2,int i,int j){
        if(i<0||i>=grid1.length||j<0||j>=grid1[i].length||grid2[i][j]!=1)
            return;
    if(grid1[i][j]== 0)flag =0;

        grid2[i][j]=0;
        dfs(grid1,grid2,i+1,j);
        dfs(grid1,grid2,i-1,j);
        dfs(grid1,grid2,i,j+1);
        dfs(grid1,grid2,i,j-1);
    }
}