class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
       if(z<0||z>x+y)
           return false;
        Set<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        int[] options=new int[]{x,-x,y,-y};
        while(!q.isEmpty()){
          int size=q.size();
            while(size-->0){
                int cur=q.poll();
                if(cur==z)
                    return true;
                for(int o:options){
                    int next=cur+o;
                    if(next<0||next>x+y)
                        continue;
                    if(!visited.contains(next))
                       q.offer(next);
                        visited.add(next);    
                }
            }
        }
        return false;
    }
}