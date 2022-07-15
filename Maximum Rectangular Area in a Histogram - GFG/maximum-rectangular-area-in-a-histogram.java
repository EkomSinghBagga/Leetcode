// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}



// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        int x=(int)n;
        long[] ps=new long[x];
        long[] ns=new long[x];
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st1.isEmpty()&&hist[st1.peek()]>=hist[i])
                st1.pop();
            if(st1.isEmpty())
                ps[i]=-1;
            else{
                ps[i]=st1.peek();
                
            }
            st1.push(i);
        }
          for(int i=x-1;i>=0;i--){
            while(!st2.isEmpty()&&hist[st2.peek()]>=hist[i])
                st2.pop();
            if(st2.isEmpty())
                ns[i]=n;
            else{
                ns[i]=st2.peek();
                
            }
            st2.push(i);
        }
        long max=0;
        for(int i=0;i<x;i++){
           long cur=hist[i];
           cur+=hist[i]*(i-ps[i]-1);
           cur+=hist[i]*(ns[i]-i-1);
          
            max=Math.max(cur,max);
        }
        return max;
    }
        
}



