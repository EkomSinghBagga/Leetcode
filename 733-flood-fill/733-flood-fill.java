class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor=image[sr][sc];
        if(oldColor==color)
            return image;
        dfs(image,sr,sc,color,oldColor);
        return image;
    }
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public void dfs(int[][] image,int row,int col,int color,int old){
        if(row<0||row>=image.length||col<0||col>=image[0].length||image[row][col]!=old)
            return;
        image[row][col]=color;
        for(int[] d:dir){
            dfs(image,row+d[0],col+d[1],color,old);
        }
    }
}