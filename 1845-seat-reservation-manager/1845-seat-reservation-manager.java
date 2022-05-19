class SeatManager {
    PriorityQueue<Integer> heap;
    int count;
    public SeatManager(int n) {
        heap=new PriorityQueue();
        count=1;
        
    }
    
    public int reserve() {
        if(heap.size()==0)
            return count++;
        return heap.poll();
    }
    
    public void unreserve(int seatNumber) {
        heap.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */