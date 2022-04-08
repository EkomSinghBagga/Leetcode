class KthLargest {
    PriorityQueue<Integer> maxheap=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        for(int i:nums){
            maxheap.offer(i);
        }
        while (maxheap.size() > k) {
            maxheap.poll();
        }
    }
    
    public int add(int val) {
        maxheap.offer(val);
       if(maxheap.size()>k)
           maxheap.poll();
        return maxheap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */