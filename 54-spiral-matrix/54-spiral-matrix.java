class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowbegin=0,colbegin=0;
        List<Integer> ans=new ArrayList<>();
        int rowend=matrix.length-1,colend=matrix[0].length-1;
        while(rowbegin<=rowend&&colbegin<=colend){
            for(int i=colbegin;i<=colend;i++){
                ans.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            for(int i=rowbegin;i<=rowend;i++){
                ans.add(matrix[i][colend]);
            }
            colend--;
            if(rowbegin<=rowend){
                for(int i=colend;i>=colbegin;i--){
                    ans.add(matrix[rowend][i]);
                }
            }
            rowend--;
            if(colend>=colbegin){
                for(int i=rowend;i>=rowbegin;--i){
                    ans.add(matrix[i][colbegin]);
                }
            }
            colbegin++;
        }
        return ans;
    }
}