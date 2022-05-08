class Solution {
    public int lengthOfLastWord(String s) {
        int last=-1,st=-1;
       for(int i=s.length()-1;i>=0;i--){
           char ch=s.charAt(i);
           if(last==-1&&ch!=' ')
               last=i;
           if(last!=-1&&ch==' ')
           {
               st=i;
               break;
           }
       } 
        if(st==-1)
            return last+1;
        return last-st;
    }
}