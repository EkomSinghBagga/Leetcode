class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix.length==matrix[0].length){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        return matrix;
        }
        else{
            int[][] ans=new int[matrix[0].length][matrix.length];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    ans[j][i]=matrix[i][j];
                }
            }
            return ans;
        }
    }
}