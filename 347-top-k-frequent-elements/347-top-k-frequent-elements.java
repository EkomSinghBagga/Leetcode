class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        Queue<Integer> heap=new PriorityQueue<>((n1,n2)->mp.get(n1)-mp.get(n2));
        for(int i:mp.keySet()){
            heap.add(i);
            if(heap.size()>k) heap.poll();
        }
        int [] top=new int[k];
        for(int i=0;i<k;i++){
            top[i]=heap.poll();
        }
        return top;
    }
}