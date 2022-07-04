class Solution {
    public String getHint(String secret, String guess) {
       int bulls=findBulls(secret,guess);
        int cows=findSame(secret,guess)-bulls;
        return bulls+"A"+cows+"B";
    }
    public int findBulls(String secret,String guess){
        int ans=0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i))
                ans++;
        }
        return ans;
    }
    public int findSame(String s,String g){
        int[] f1=new int[10],f2=new int[10];
        for(int i=0;i<s.length();i++){
            f1[s.charAt(i)-'0']++;
            f2[g.charAt(i)-'0']++;
        }
        int ans=0;
        for(int i=0;i<=9;i++){
            ans+=Math.min(f1[i],f2[i]);
        }
        return ans;
    }
}