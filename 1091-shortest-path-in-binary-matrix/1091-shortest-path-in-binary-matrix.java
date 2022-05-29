class Solution {
    int[][] dir={{1,1},{1,0},{0,1},{1,-1},{-1,1},{-1,0},{0,-1},{-1,-1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int level=1;
        if(grid[0][0]==1||grid[grid.length-1][grid[0].length-1]==1)
            return -1;
        if(grid.length==1&&grid[0].length==1&&grid[0][0]==0)
            return 1;
        q.offer(new int[]{0,0});
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int[] cur=q.poll();
                for(int[] d:dir){
                    int i=cur[0]+d[0];
                    int j=cur[1]+d[1];
                     if(i==grid.length-1&&j==grid[0].length-1)
                        return level+1;
                    if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==1)
                        continue;
                   
                    if(grid[i][j]==0){
                        grid[i][j]=1;
                        q.offer(new int[]{i,j});
                    }
                        
                }
            }
            level++;
        }
        return -1;
    }
}