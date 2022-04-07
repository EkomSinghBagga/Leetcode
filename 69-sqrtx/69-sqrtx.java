class Solution {
    public int mySqrt(int x) {
       int st=0,end=x/2,ans=0;
        if(x==1) return 1;
        while(st<=end){
            long mid=st+(end-st)/2;
            if(mid*mid<=x){
                ans=(int)mid;
                st=(int)mid+1;
            }
            else
                end=(int)mid-1;
        }
        return ans;
    }
}