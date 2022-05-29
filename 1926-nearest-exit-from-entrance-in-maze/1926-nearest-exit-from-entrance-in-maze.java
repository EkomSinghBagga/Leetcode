class Solution {
    int[][] dir={{1,0},{0,1},{-1,0},{0,-1}};
    public int nearestExit(char[][] maze, int[] entrance) {
        int level=1;
        Queue<int[]> q=new LinkedList<>();
        q.offer(entrance);
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int[] cur=q.poll();
                for(int[] d:dir){
                    int ti=d[0]+cur[0];
                    int tj=d[1]+cur[1];
                    if(ti<0||ti>=maze.length||tj<0||tj>=maze[0].length||maze[ti][tj]=='+')
                        continue;
                    if((ti==0||tj==0||ti==maze.length-1||tj==maze[0].length-1))
                        
                    {
                        if(ti!=entrance[0]||tj!=entrance[1])
                        return level;
                        else{
                            maze[ti][tj]='+';
                        }
                        }
                    if(maze[ti][tj]=='.')
                    {
                        q.offer(new int[]{ti,tj});
                        maze[ti][tj]='+';
                    }
                }
            }
            level++;
        }
        return -1;
    }
}