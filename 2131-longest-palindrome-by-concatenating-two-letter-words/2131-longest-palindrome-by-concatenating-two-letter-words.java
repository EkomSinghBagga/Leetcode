class Solution {
    public int longestPalindrome(String[] words) {
       Map<String,Integer> mp=new HashMap<>();
        for(String s:words){
            mp.put(s,mp.getOrDefault(s,0)+1);
        }
        int ans=0,flag=0;
        for(String x:mp.keySet()){
            String rev=x.charAt(1)+""+x.charAt(0);
            if(rev.equals(x)){
                int y=mp.get(rev);
                
                if(y%2==0){
                    ans+=y;
                }
                else
                  { ans+=y-1 ;
                    flag=2;}
                continue;
            }
            if(mp.containsKey(rev)){
                ans+=Math.min(mp.get(rev),mp.get(x));
            }
        }
        return ans*2+flag;
    }
}