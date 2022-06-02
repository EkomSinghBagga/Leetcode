class Solution {
    public int maxDistance(int[][] grid) {
        int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
        int n=grid.length,max=-1,level=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    q.offer(new int[]{i,j});
            }
        }
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
               int[] cur=q.poll();
                for(int[] d:dir){
                    int i=cur[0]+d[0];
                    int j=cur[1]+d[1];
                    if(i<0||j<0||i>=n||j>=n||grid[i][j]==1)
                        continue;
                    else{
                        q.offer(new int[]{i,j});
                        grid[i][j]=1;
                        max=Math.max(max,level+1);
                    }
                }
            }
            level++;
        }
        return max;
    }
}