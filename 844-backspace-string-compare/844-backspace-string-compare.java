class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1,j=t.length()-1,si=0,sj=0;
        while(i>=0||j>=0){
            while(i>=0){
                if(s.charAt(i)=='#')
                {
                    si++;
                    i--;
                }
                else if(si>0)
                   { si--;i--;}
                else
                    break;
            }
            while(j>=0){
                if(t.charAt(j)=='#'){
                    sj++;
                    j--;
                }
                else if(sj>0)
                {
                    sj--;j--;
                    
                }
                else 
                    break;
            }
            if(i>=0&&j>=0&&s.charAt(i)!=t.charAt(j))
                return false;
            if((i>=0)!=(j>=0))
                return false;
            i--;
            j--;
        }
        return true;
    }
}