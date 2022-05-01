class Solution {
    public int minimumEffortPath(int[][] h) {
      int st=0,end=(int)10e6;
        while(st<end){
            int mid=st+(end-st)/2;
            if(dfs(h,new boolean[h.length][h[0].length],0,0,h[0][0],mid))
            {
                
                end=mid;
            }
            else
                st=mid+1;
        }
        return end;
    }
    public boolean dfs(int[][] h,boolean[][] visited,int i,int j,int lastHeight,int threshold){
        if(i<0||i>=h.length||j<0||j>=h[0].length||visited[i][j]||(Math.abs(h[i][j]-lastHeight)>threshold)){
            return false;
        }
            visited[i][j]=true;
            return (i==h.length-1&&j==h[i].length-1)
                ||dfs(h,visited,i+1,j,h[i][j],threshold)
                ||dfs(h,visited,i-1,j,h[i][j],threshold)
                ||dfs(h,visited,i,j+1,h[i][j],threshold)
                ||dfs(h,visited,i,j-1,h[i][j],threshold);
        }
    
}