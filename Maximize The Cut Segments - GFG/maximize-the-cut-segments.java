// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading length of line segment
            int n = Integer.parseInt(read.readLine().trim());
            
            
            //reading 3 segment lengths
            String str[] = read.readLine().trim().split(" ");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            
            
            //calling method maximizeCuts() of class Solution()
            //and printinting the result
            System.out.println(new Solution().maximizeCuts(n, x, y, z));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the maximum number of cuts.
    static Integer[] memo;
    public int maximizeCuts(int n, int x, int y, int z)
    {
       //Your code here
         memo=new Integer[n+1];
        int a=solve(n,x,y,z);
        if(a<0)
        return 0;
        
        return a;
    }
    static int solve(int n,int x,int y,int z){
        if(n==0)
            return 0;
        if(n<0)
            return -100000;
        if(memo[n]!=null)
        return memo[n];
        return memo[n]=1+Math.max(solve(n-x,x,y,z),Math.max(solve(n-y,x,y,z),solve(n-z,x,y,z)));
    
    }
}
