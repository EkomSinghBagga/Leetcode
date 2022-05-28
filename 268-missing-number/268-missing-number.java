class Solution {
    public int missingNumber(int[] nums) {
     int n=0,sum=0,c=0;
     for(int i:nums){
         sum+=i;
         n=Math.max(i,n);
         c++;
     }
    if(c-1==n)
        return n+1;
    int total=(n*(n+1))/2;
    return total-sum;
    }
}