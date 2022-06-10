class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length,m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0))
                    if(dfs(board,i,j,0,word,visited))
                        return true;
            }
        }
        return false;
    }
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public boolean dfs(char[][] board,int i,int j,int ind,String word,boolean[][] visited){
        if(ind==word.length())
            return true;
        if(i<0||j<0||i>=board.length||j>=board[0].length||visited[i][j]||board[i][j]!=word.charAt(ind))
            return false;
        visited[i][j]=true;
        boolean ans=false;
        for(int[] d:dir){
            ans=ans||dfs(board,i+d[0],j+d[1],ind+1,word,visited);
        }
        visited[i][j]=false;
        return ans;
    }
}