class Solution {
    int[][] memo;
    public int change(int amount, int[] coins) {
        memo=new int[coins.length+1][amount+1];
        for(int i=0;i<=coins.length;i++){
            for(int j=0;j<=amount;j++)
                memo[i][j]=-1;
        }
        return solve(coins,amount,coins.length);
    }
    public int solve(int[] coins,int amount,int n){
        if(memo[n][amount]!=-1)
            return memo[n][amount];
        if(amount==0)
            return 1;
        if(n==0)
            return 0;
        int res=0;
        if(coins[n-1]<=amount)
            res+=solve(coins,amount-coins[n-1],n);
        res+=solve(coins,amount,n-1);
        memo[n][amount]=res;
        return res;
    }
}