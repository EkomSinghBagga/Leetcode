class Solution {
    Integer[][] memo;
    int n,m;
    int[] ans;
    public int[] findBall(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        memo=new Integer[n+1][m+1];
         ans=new int[m];
        // Arrays.fill(ans,-1);
        for(int i=0;i<m;i++){
            ans[i]=solve(grid,0,i);
        }
        return ans;
    }
    public boolean isValid(int r,int c){
        return r>=0&&c>=0&&r<n&&c<m;
    }
    public int solve(int[][] grid,int r,int c){
        if(r==n)
            return c;
        if(isValid(r,c)){
            if(grid[r][c]==1&&isValid(r,c+1)&&grid[r][c+1]==1){
                if(memo[r+1][c+1]!=null)
                    return memo[r+1][c+1];
                else
                    return memo[r+1][c+1]=solve(grid,r+1,c+1);
            }
            if(grid[r][c]==-1&&isValid(r,c-1)&&grid[r][c-1]==-1){
                if(memo[r+1][c-1]!=null)
                    return memo[r+1][c-1];
                else
                    return memo[r+1][c-1]=solve(grid,r+1,c-1);
            }
        }
        return -1;
    }
}