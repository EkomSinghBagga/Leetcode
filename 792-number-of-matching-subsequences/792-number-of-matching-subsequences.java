class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<String,Integer> mp=new HashMap<>();
        for(String x:words){
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        int ans=0;
        for(String w:mp.keySet()){
         int si=0,wi=0;
        while(si<s.length()&&wi<w.length()){
            if(s.charAt(si)==w.charAt(wi)){
                si++;
                wi++;
            }
            else{
                si++;
            }
        }
            if(wi==w.length())
                ans+=mp.get(w);
        }
        return ans;
    }
}