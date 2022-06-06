class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Set<Integer> visited=new HashSet<>();
        for(int i:forbidden)
            visited.add(i);
        Map<Integer,Integer> jumps=new HashMap<>();
        jumps.put(0,0);
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{0,1});
        while(!q.isEmpty()){
            int[] cur=q.poll();
            int y=cur[0],d=cur[1];
            if(y==x)
                return jumps.get(y);
            if(y+a<6001&&!visited.contains(y+a)){
                q.add(new int[]{y+a,1});
                visited.add(y+a);
                jumps.put(y+a,jumps.get(y)+1);
            }
            if(d!=-1&&y-b>-1&&!visited.contains(y-b)){
                q.add(new int[]{y-b,-1});
                jumps.put(y-b,jumps.get(y)+1);
            } 
        }
        return -1;
    }
}