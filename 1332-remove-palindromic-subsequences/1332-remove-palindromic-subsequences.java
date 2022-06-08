class Solution {
    public int removePalindromeSub(String s) {
        if(s.length()==0)
            return 0;
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return 2;
            
            }
            else{
                i++;
                j--;
            }
        }
        return 1;
    }
}