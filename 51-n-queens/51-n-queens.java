class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        backtrack(board,0,ans);
        return ans;
    }
    public void backtrack(char[][] board,int col,List<List<String>> ans){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,col,i)){
                board[i][col]='Q';
                backtrack(board,col+1,ans);
                board[i][col]='.';
            }
        }
    }
    public boolean isSafe(char[][] board,int col,int row){
        for(int i=0;i<col;i++){
            if(board[row][i]=='Q') return false;
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row,j=col;i<board.length&&j>=0;j--,i++)
            if(board[i][j]=='Q') return false;
        return true;
    }
    
    public List<String> construct(char[][] board){
        List<String> ans=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
             ans.add(s);

        }
        return ans;
    }
}