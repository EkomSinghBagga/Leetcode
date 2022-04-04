class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int m=matrix.length,n=matrix[0].length,row=0,i;
        for( i=0;i<m;i++){
            if(target<matrix[i][0]){
              row=i-1;
                break;
            }
        }
        if(i==m)
            row=m-1;
        if(row==-1)
            return false;
        for(int j=0;j<n;j++){
            if(matrix[row][j]==target){
                return true;
            }
        }
        return false;
    }
}