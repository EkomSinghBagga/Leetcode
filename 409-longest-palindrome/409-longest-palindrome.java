class Solution {
    public int longestPalindrome(String s) {
       int ans=0,flag=0;
        int[] f=new int[256];
        for(char ch:s.toCharArray()){
            f[ch]++;
        }
        for(int i:f){
            if(i==1||i%2!=0)
                flag=1;
            
                ans+=i/2;
        }
        return ans*2+flag;
    }
}