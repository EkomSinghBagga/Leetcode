class Solution {
    public void solve(char[][] board) {
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(i==0||j==0||i==board.length-1||j==board[0].length-1)
                    if(board[i][j]=='O')
                        dfs(board,visited,i,j);
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&!visited[i][j])
                    board[i][j]='X';
            }
        }
        
    }
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public void dfs(char[][] board,boolean[][] visited,int i,int j){
        if(i<0||i>=board.length||j<0||j>=board[0].length)
            return;
        if(visited[i][j]||board[i][j]=='X')
            return;
        visited[i][j]=true;
        for(int[] d:dir)
            dfs(board,visited,i+d[0],j+d[1]);
    }
}