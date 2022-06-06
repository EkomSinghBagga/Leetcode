class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] connected=new boolean[n][n];
        int[] cnt=new int[n];
        for(int[] r:roads){
            cnt[r[0]]++;
            cnt[r[1]]++;
            connected[r[0]][r[1]]=true;
            connected[r[1]][r[0]]=true;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans=Math.max(ans,cnt[i]+cnt[j]-((connected[i][j])?1:0));
            }
        }
        return ans;
    }
}