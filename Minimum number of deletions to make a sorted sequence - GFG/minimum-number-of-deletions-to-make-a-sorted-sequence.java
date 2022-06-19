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
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDeletions(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java
class Solution
{
	public int minDeletions(int arr[], int n) 
	{ 
	   //code here.
	    List<Integer> tail=new ArrayList<>();
	    tail.add(arr[0]);
	    int ans=0;
	    for(int i=1;i<n;i++){
	        if(arr[i]>tail.get(tail.size()-1))
	            tail.add(arr[i]);
	       else
	            {
	               int ind=findIndex(tail,arr[i]); 
	               tail.set(ind,arr[i]);
	            }
	    }
	    return n-tail.size();
	}
	public static int findIndex(List<Integer> tail,int x){
	    int st=0,end=tail.size()-1,ans=0;
	    while(st<=end){
	        int mid=st+(end-st)/2;
	        if(tail.get(mid)>=x)
	        {
	           ans=mid;
	           end=mid-1;
	        }
	        else
	        st=mid+1;
	    }
	    return ans;
	}
}