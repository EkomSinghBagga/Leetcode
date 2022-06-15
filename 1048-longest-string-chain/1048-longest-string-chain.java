class Solution {
    public int longestStrChain(String[] words) {
        if(words==null||words.length==0)
            return 0;
        Arrays.sort(words,(a,b)->a.length()-b.length());
        int ans=0;
        Map<String,Integer> mp=new HashMap<>();
        for(String w:words){
            mp.put(w,1);
            for(int i=0;i<w.length();i++){
                StringBuilder sb=new StringBuilder(w);
                String next=sb.deleteCharAt(i).toString();
                if(mp.containsKey(next)&&mp.get(next)+1>mp.get(w))
                    mp.put(w,mp.get(next)+1);
            }
            ans=Math.max(ans,mp.get(w));
        }
        return ans;
    }
}