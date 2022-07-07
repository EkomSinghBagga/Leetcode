class Solution {
    Boolean[][][] memo;
    public boolean isInterleave(String s1, String s2, String s3) {
        memo=new Boolean[s1.length()+1][s2.length()+1][s3.length()];
        return solve(s1,s2,s3,0,0,0);
        
    }
    public boolean solve(String s1,String s2,String s3,int i1,int i2,int i3){
        if(i3==s3.length()&&i2==s2.length()&&i1==s1.length())
            return true;
        if(i3==s3.length())
            return false;
        if(memo[i1][i2][i3]!=null) return memo[i1][i2][i3];
        if((i1<s1.length()&&s3.charAt(i3)==s1.charAt(i1))&&(i2<s2.length()&&s3.charAt(i3)==s2.charAt(i2)))
            return memo[i1][i2][i3]=solve(s1,s2,s3,i1+1,i2,i3+1)||solve(s1,s2,s3,i1,i2+1,i3+1);
        if(i1<s1.length()&&s1.charAt(i1)==s3.charAt(i3))
            return memo[i1][i2][i3]=solve(s1,s2,s3,i1+1,i2,i3+1);
        if(i2<s2.length()&&s2.charAt(i2)==s3.charAt(i3))
            return memo[i1][i2][i3]=solve(s1,s2,s3,i1,i2+1,i3+1);
        return false;
    }
}