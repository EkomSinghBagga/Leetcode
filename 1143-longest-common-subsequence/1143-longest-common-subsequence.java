class Solution {
    int[][] memo;
    public int longestCommonSubsequence(String text1, String text2) {
        memo=new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                memo[i][j]=-1;
            }
        }
        return lcs(text1,text2,text1.length()-1,text2.length()-1);
    }
    
    public int lcs(String a,String b,int m,int n){
        if(m<0||n<0)
            return 0;
        if(memo[m][n]!=-1)
            return  memo[m][n];
        if(a.charAt(m)==b.charAt(n))
           { memo[m][n]=1+lcs(a,b,m-1,n-1);
            return memo[m][n];}
        else
        {
            memo[m][n]= Math.max(lcs(a,b,m-1,n),lcs(a,b,m,n-1));
            return memo[m][n];
            
    }
    }
}