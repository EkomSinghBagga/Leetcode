// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
        	int N = Integer.parseInt(br.readLine()); 
        	int[] Arr = new int[N];
        	String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
        	for(int i=0; i<N; i++)
        	{
        		Arr[i] = Integer.parseInt(strs[i]); 
        	}
        	

            Solution ob = new Solution();
			int[] ans = ob.farNumber(N,Arr);
  
            for(int i=0; i<ans.length; i++)
                out.print(ans[i] + " ");
            out.println();

            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int[] farNumber(int N, int Arr[])
	{    
	    int n=N;
       int[] suffix=new int[n];
       suffix[N-1]=Arr[n-1];
       for(int i=N-2;i>=0;i--){
           suffix[i]=Math.min(suffix[i+1],Arr[i]);
       }
        for(int i=0;i<N;i++){
            int low=i+1,high=N-1,ans=-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(suffix[mid]<Arr[i])
                {
                    ans=mid;
                    low=mid+1;
                }
                else
                    high=mid-1;
            }
           Arr[i]=ans; 
        }
        return Arr;
	}
} 