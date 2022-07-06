class Solution {
    public boolean isHappy(int n) {
        int slow=(n),fast=(n);
        do{
            fast=calculate(calculate(fast));
            slow=calculate(slow);
        } while(fast!=1&&fast!=slow);
        return fast==1;
    }
    public int calculate(int n){
        int sum=0;
       while(n!=0){
           sum+=(n%10)*(n%10);
           n/=10;
       } 
        return sum;
    }
}