// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static Integer[][] memo;
    static int palindromicPartition(String str)
    {
        // code here
        int N=str.length();
        memo=new Integer[N][N];
        return solve(str,0,str.length()-1);
    }
    static int solve(String s,int i,int j){
        if(memo[i][j]!=null)
            return memo[i][j];
        if(isPallindrome(s,i,j))
            return 0;
        int ans=s.length();
 
        for(int k=i;k<j;k++){
            ans=Math.min(ans,solve(s,i,k)+solve(s,k+1,j)+1);
        }
        return memo[i][j]=ans;
    }
    static boolean isPallindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
            return false;
        }
        return true;
    }
}