class Solution {
    public boolean validPalindrome(String s) {
        int st=0,end=s.length()-1;
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end))
            {
               return isPallindrome(s,st+1,end)||isPallindrome(s,st,end-1); 
            }
            st++;
            end--;
        }
        return true;
    }
    public boolean isPallindrome(String s,int st,int end){
        while(st<=end){
            if(s.charAt(st)!=s.charAt(end))
                return false;
            st++;
            end--;
        }
        return true;
    }
}