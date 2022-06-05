class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1)
            return 1;
       int[] t=new int[n+1];
        for(int[] x:trust)
        {
          t[x[0]]--;
          t[x[1]]++;
        } 
        for(int i=0;i<=n;i++){
            if(t[i]==n-1)
                return i;
        }
        return -1;
    }
}