class Solution {
    int min=Integer.MAX_VALUE;
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] dir = {{1,1},{1,0},{0,1},{1,-1},{-1,1},{-1,0},{0,-1},{-1,-1}};
        int m=grid.length,n=grid[0].length;
        if(grid[0][0]==1) return -1; 
        Queue<int[]> q=new LinkedList<>();
         q.offer(new int[]{0,0,1});
        int ans=0;
        while(!q.isEmpty()){
            
                int[] popped=q.poll();
                int row=popped[0],col=popped[1],dis=popped[2];
                if(row==m-1&&col==n-1)
                    return dis;
                for(int[] d:dir){
                    int r2=row+d[0];
                    int c2=col+d[1];
                    if(r2<n&&r2>=0&&c2<n&&c2>=0&&grid[r2][c2]==0){
                        q.offer(new int[]{r2,c2,dis+1});
                        grid[r2][c2]=1;
                    }
                }
            
        }
        return -1;
    }
}
