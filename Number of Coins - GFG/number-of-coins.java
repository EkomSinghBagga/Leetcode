// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    // } Driver Code Ends


class Solution{
static Integer[][] memo;
	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here
	    memo=new Integer[M][V+1];
	    int ans=solve(coins,0,V);
	    if(ans>=100000)
	    return -1;
	    return ans;
	} 
	public static int solve(int[] coins,int i,int target){
	    if(target==0)
	    return 0;
	    if(i==coins.length||target<0)
	    return 100000;
	    if(memo[i][target]!=null)
	    return memo[i][target];
	    return memo[i][target]=Math.min(1+solve(coins,i,target-coins[i]),solve(coins,i+1,target));
	} 
}