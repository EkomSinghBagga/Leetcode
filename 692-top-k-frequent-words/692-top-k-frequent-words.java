class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ans=new ArrayList<>();
        Map<String,Integer> mp=new HashMap<>();
        for(String w:words){
            mp.put(w,mp.getOrDefault(w,0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comp()); 
        for(String i:mp.keySet()){
            pq.offer(new Pair(i,mp.get(i)));
        }
        for(int i=0;i<k;i++)
            ans.add(pq.poll().s);
        return ans;
    }
    public class Pair{
        String s;
        int freq;
        Pair(String s,int freq){
            this.s=s;
            this.freq=freq;
        }
    }
    public class Comp implements Comparator<Pair>{
        public int compare(Pair p1,Pair p2){
            if(p1.freq!=p2.freq)
            return p2.freq-p1.freq;
            else
                return (p1.s).compareTo(p2.s);
        }
    } 
}