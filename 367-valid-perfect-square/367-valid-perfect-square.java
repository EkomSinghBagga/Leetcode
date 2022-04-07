class Solution {
    public boolean isPerfectSquare(int num) {
        int st=1,end=Integer.MAX_VALUE;
        while(st<=end){
            long mid=st+(end-st)/2;
            if(mid*mid==num)
                return true;
            else if(mid*mid<num)
                st=(int)mid+1;
            else
                end=(int)mid-1;
        }
        return false;
    }
}