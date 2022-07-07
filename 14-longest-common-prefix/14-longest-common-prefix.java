class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        for(int i=1;i<strs.length;i++){
            int j;
            for(j=Math.min(ans.length(),strs[i].length());j>0;j--){
                if((ans.substring(0,j)).equals(strs[i].substring(0,j)))
                   {
                    ans=ans.substring(0,j);
                    break;
                }
                
            }
            if(j==0)
                return "";
            
                
        }
        return ans;
    }
}