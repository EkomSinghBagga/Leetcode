class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
       for(int i:stones){
           maxheap.offer(i);
       }
        int x,y;
        while(maxheap.size()>1){
            x=maxheap.poll();
            y=maxheap.poll();
            if(x>y){
                maxheap.offer(x-y);
            }
        }
        if(maxheap.size()==0)
            return 0;
        return maxheap.poll();
    }
}