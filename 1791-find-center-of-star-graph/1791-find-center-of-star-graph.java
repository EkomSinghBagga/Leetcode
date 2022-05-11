class Solution {
    public int findCenter(int[][] edges) {
        // int[] node=new int[edges.length+2];
        // Arrays.fill(node,0);
        // for(int[] x:edges){
        //     node[x[0]]++;
        //     node[x[1]]++;
        // }
        // int c=0;
        // for(int i:node){
        //     if(i==edges.length)
        //         return c;
        //     c++;
        // }
        // return c;
        return (edges[0][0]==edges[1][0]||edges[0][0]==edges[1][1])?edges[0][0]:edges[0][1];
    }
}