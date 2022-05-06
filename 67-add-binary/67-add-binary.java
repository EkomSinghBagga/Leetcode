class Solution {
    public String addBinary(String a, String b) {
       int la=a.length()-1,lb=b.length()-1;
        String ans="";
        int carry=0;
        while(la>=0&&lb>=0){
            int sum=a.charAt(la)-'0'+b.charAt(lb)-'0'+carry;
            carry=sum/2;
            sum%=2;
                     
            ans=sum+ans;
 
            la--;
            lb--;
        }
         while(la>=0){
            int sum=a.charAt(la)-'0'+carry;
            carry=sum/2;
            sum%=2;
            ans=sum+ans;
             
            la--;
        }
         while(lb>=0){
            int sum=b.charAt(lb)-'0'+carry;
            carry=sum/2;
            sum%=2;
            ans=sum+ans;
                          lb--;
        }
        carry%=2;
        if(carry!=0){
            
            ans=carry+ans;
        }
        return ans;
        
    }
}