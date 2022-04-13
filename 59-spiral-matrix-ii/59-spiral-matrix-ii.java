class Solution {
    public int[][] generateMatrix(int n) {
        int[][] x=new int[n][n];
        int cnt=1;
        for(int i=0;i<(n+1)/2;i++){
            for(int j=i;j<n-i;j++){
                x[i][j]=cnt++;
            }
            for(int j=i+1;j<n-i;j++)
                x[j][n-i-1]=cnt++;
            for(int j=i+1;j<n-i;j++)
                x[n-i-1][n-j-1]=cnt++;
            for(int j=i+1;j<n-i-1;j++)
                x[n-j-1][i]=cnt++;
        }
        return x;
    }
}