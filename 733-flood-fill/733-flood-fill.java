class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color=image[sr][sc];
        if(color!=newColor){
            dfs(image,sr,sc,newColor,color);
        }
    
    return image;
    }
    public void dfs(int[][] image,int i,int j,int newColor,int color){
        if(i<0||j<0||i>=image.length||j>=image[0].length||image[i][j]!=color)
            return;
        image[i][j]=newColor;
        dfs(image,i+1,j,newColor,color);
        dfs(image,i,j+1,newColor,color);
        dfs(image,i-1,j,newColor,color);
        dfs(image,i,j-1,newColor,color);
    }
}