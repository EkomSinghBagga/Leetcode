class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
        int n1=num1.length()-1,n2=num2.length()-1,carry=0,sum=0;
        while(n1>=0||n2>=0||carry!=0){
            sum=0;
            if(n1>=0){
                sum+=num1.charAt(n1--)-'0';
            }
            if(n2>=0)
                sum+=num2.charAt(n2--)-'0';
            sum+=carry;
            carry=sum/10;
            sum%=10;
            sb.append(sum);
        }
        return sb.reverse().toString();
    }
}