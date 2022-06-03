class Solution {
    public boolean canReach(int[] arr, int start) {
       boolean[] visited=new boolean[arr.length];
        return dfs(arr,start,visited);
    }
    public boolean dfs(int[] nums,int i,boolean[] visited){
        if(i<0||i>=nums.length)
            return false;
        if(nums[i]==0)
            return true;
        if(visited[i])
            return false;
        visited[i]=true;
        return dfs(nums,i+nums[i],visited)||dfs(nums,i-nums[i],visited);
        
    }
}