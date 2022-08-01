class FreqStack {
    PriorityQueue<int[]> queue;
    Map<Integer,Integer> valueToFreq;
    int time;
    public FreqStack() {
        time=0;
        valueToFreq=new HashMap<>();
        queue=new PriorityQueue(new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[1]==b[1])
                    return b[2]-a[2];
                return b[1]-a[1];
        }
            
        });
        
    }
    
    public void push(int val) {
        int freq=valueToFreq.getOrDefault(val,0)+1;
        queue.offer(new int[]{val,freq,time++});
        valueToFreq.put(val,freq);
    }
    
    public int pop() {
        int[] val=queue.poll();
        valueToFreq.put(val[0],val[1]-1);
        return val[0];
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */