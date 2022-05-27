class Solution {
    public int maximumProduct(int[] nums) {
    int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE,c=Integer.MIN_VALUE,x=Integer.MAX_VALUE,y=Integer.MAX_VALUE;
    for(int i:nums){
        if(i>a){
            c=b;
            b=a;
            a=i;
        }
        else if(i>b)
        {
            c=b;
            b=i;
    }
        else if(i>c)
            c=i;
        if(i<x)
          { y=x;
           x=i;}
        else if(i<y)
            y=i;
    }
    return Math.max(a*b*c,a*x*y);
    }
}