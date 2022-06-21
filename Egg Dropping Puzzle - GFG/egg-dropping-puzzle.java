// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}


// } Driver Code Ends


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    // Your code here
	    int[][] dp=new int[n+1][k+1];
	    for(int i=1;i<=k;i++)
	    dp[1][i]=i;
	    for(int i=0;i<=n;i++){
	        dp[i][0]=0;
	        dp[i][1]=1;
	    }
	    for(int i=2;i<=n;i++){
	        for(int j=2;j<=k;j++){
	            dp[i][j]=Integer.MAX_VALUE;
	            for(int x=1;x<=j;x++){
	                dp[i][j]=Math.min(dp[i][j],Math.max(1+dp[i-1][x-1],1+dp[i][j-x]));
	            }
	        }
	    }
	    return dp[n][k];
	}
}