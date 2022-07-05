class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
      PriorityQueue<Integer> pq=new PriorityQueue<>(set);
        int prev=pq.poll(),c=1,max=0;
      while(!pq.isEmpty()){
          int cur=pq.poll();
          if(cur==prev+1)
          {
              c++;
              prev=cur;
          }
          else
          {
              max=Math.max(c,max);
              c=1;
              prev=cur;
                  
          }
      }
        return Math.max(c,max);
    }
}