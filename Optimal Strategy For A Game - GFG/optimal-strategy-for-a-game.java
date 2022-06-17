// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class OptimalStrategy
{
    public static void main (String[] args) {
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of elements
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            //inserting the elements
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
           //calling the countMaximum() method of class solve
           System.out.println(new solve().countMaximum(arr, n)); 
        }
    }
    
    
}// } Driver Code Ends



class solve
{
    //Function to find the maximum possible amount of money we can win.
    static Long[][] memo;
    static long countMaximum(int arr[], int n)
    {
        // Your code here
        memo=new Long[n][n];
        return solve(arr,0,n-1);
    }
    static long  solve(int arr[],int st,int end){
        if(st>end)
        return 0;
        if(memo[st][end]!=null)
        return memo[st][end];
        return memo[st][end]=Math.max(arr[st]+Math.min(solve(arr,st+2,end),solve(arr,st+1,end-1)),
        arr[end]+Math.min(solve(arr,st,end-2),solve(arr,st+1,end-1)));
    }
}
