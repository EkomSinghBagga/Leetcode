class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      int n=rooms.size();
        boolean[] visited=new boolean[n];
        Arrays.fill(visited,false);
        dfs(rooms,visited,0);
        for(boolean i:visited)
            if(!i) return false;
        return true;
    }
    public void dfs(List<List<Integer>> rooms,boolean[] visited,int i){
        if(visited[i])
            return;
        visited[i]=true;
        for(int j:rooms.get(i))
            dfs(rooms,visited,j);
    }
}