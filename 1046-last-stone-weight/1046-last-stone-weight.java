class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:stones)
            pq.offer(i);
        while(pq.size()>1){
            int y=pq.poll(),x=pq.poll();
            if(x==y) continue;
            pq.offer(y-x);
        }
        return (pq.isEmpty())?0:pq.poll();
    }
}