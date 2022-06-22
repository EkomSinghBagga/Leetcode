// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   static Integer[][] memo;
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        memo=new Integer[N+1][N+1];
        return solve(arr,0,N-1);
    }
    public static int solve(int[] arr,int i,int j){
        if(i+1==j)
        return 0;
        int ans=Integer.MAX_VALUE;
        if(memo[i][j]!=null)
        return memo[i][j];
        for(int k=i+1;k<j;k++){
            ans=Math.min(ans,solve(arr,i,k)+solve(arr,k,j)+arr[i]*arr[j]*arr[k]);
        }
        return memo[i][j]=ans;
    }
}